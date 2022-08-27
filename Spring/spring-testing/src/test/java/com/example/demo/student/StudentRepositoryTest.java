package com.example.demo.student;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest // this needs for configure database and autowired
class StudentRepositoryTest {

    @Autowired
    private StudentRepository underTest;

    @AfterEach
    void tearDown() {
        underTest.deleteAll();
    }

    @Test
    void itShouldCheckIfStudentExistsByEmail() {
        // give
        String email = "jamila@gmail.com";

        Student student = new Student(
                "Jamila",
                email,
                Gender.FEMALE
        );
        underTest.save(student);

        // when
        boolean exists = underTest.selectExistsEmail(email);

        // expected
        boolean expected = true;

        // then
        assertThat(expected).isTrue();
    }

    @Test
    void itShouldCheckIfStudentByEmailDoesNotExists() {
        // give
        String email = "jeyHarper@gmail.com";

        Student student = new Student(
                "Jamila",
                "jamila@gmail.com",
                Gender.FEMALE
        );

        underTest.save(student);

        // when
        boolean exists = underTest.selectExistsEmail(email);

        // expected
        boolean expected = false;

        // then
        assertThat(expected).isFalse();
    }
}