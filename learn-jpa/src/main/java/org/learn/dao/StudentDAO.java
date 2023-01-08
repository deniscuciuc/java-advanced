package org.learn.dao;

import org.learn.model.School;
import org.learn.model.Student;

import java.util.List;

public interface StudentDAO {

    Student create(Student student);

    Student update(Student student);

    Long delete(Long id);

    Student findById(Long id);

    List<Student> findAll();

    Student addSchool(Long id, School school);
}
