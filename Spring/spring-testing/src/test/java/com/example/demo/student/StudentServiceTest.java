package com.example.demo.student;

import com.example.demo.student.exception.BadRequestException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

/**
 * I can use @ExtendWith(MockitoExtension.class) instead of:
 *      private AutoCloseable autoCloseable
 *      autoCloseable = MockitoAnnotations.openMocks(this)
 *          @AfterEach
 *          void tearDown() throws Exception {
 *              autoCloseable.close();
 *          }
 */
class StudentServiceTest {

    @Mock
    private StudentRepository studentRepository;
    private AutoCloseable autoCloseable;
    private StudentService underTest;

    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        underTest = new StudentService(studentRepository);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    /**
     * can be used when with dao but not repository i guess
     */
    @Test
    void shouldGetAllStudents() {
        // when
        underTest.getAllStudents();

        //then
        verify(studentRepository).findAll();
    }

    /**
     * Логика в том что мы ловим аргументы которые кидаем в сохранения юзера и так как мы уже знаем что
     * Репозитория (ДАО) работает то заново проверять одно и тоже нету смысла
     * и так мы проверям правильные ли параметры полетели в дао.
     * Мокито ловит методы можно сказать которые из сервиса летят в дао (которые вызываются)
     */
    @Test
    void shouldAddStudent() {
        //given
        Student student = new Student(
                "Jamila",
                "jamila@gmail.com",
                Gender.FEMALE
        );

        // when
        underTest.addStudent(student);

        // then
        ArgumentCaptor<Student> studentArgumentCaptor = ArgumentCaptor.forClass(Student.class);

        verify(studentRepository)
                .save(studentArgumentCaptor.capture());

        // вытаскиваем юзера из studentArgumentCaptor который словили в методе в сервисе (в параметрах save())
        Student capturedStudent = studentArgumentCaptor.getValue();
        assertThat(capturedStudent).isEqualTo(student);
    }

    @Test
    void willThrowWhenEmailTaken() {

        Student student = new Student(
                "Jamila",
                "jamila@gmail.com",
                Gender.FEMALE
        );

        // делаем так чтобы метод ниже в методе что тестим выдавал тру (такой пользователь найден) чтобы вызвать exception
        given(studentRepository.selectExistsEmail(student.getEmail()))
                .willReturn(true);

        String expectedThrowMessage = "Email " + student.getEmail() + " taken";

        assertThatThrownBy(() -> underTest.addStudent(student))
                .isInstanceOf(BadRequestException.class)
                .hasMessageContaining(expectedThrowMessage);

        verify(studentRepository, never()).save(any());

    }

    @Test
    @Disabled
    void deleteStudent() {
    }
}