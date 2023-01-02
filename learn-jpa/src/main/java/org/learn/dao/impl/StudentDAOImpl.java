package org.learn.dao.impl;

import org.learn.dao.StudentDAO;
import org.learn.dao.impl.exceptions.EntityNotFoundException;
import org.learn.model.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public StudentDAOImpl() {
        entityManagerFactory = Persistence.createEntityManagerFactory("student_pu");
        entityManager = entityManagerFactory.createEntityManager();
    }


    @Override
    public Student create(Student student) {
        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        return student;
    }

    @Override
    public Student update(Student student) {
        entityManager.getTransaction().begin();

        Student toUpdate = findById(student.getId());
        toUpdate.setFirstName(student.getFirstName());
        toUpdate.setLastName(student.getLastName());

        entityManager.getTransaction().commit();
        return toUpdate;
    }

    @Override
    public Long delete(Long id) {
        entityManager.getTransaction().begin();

        Student toRemove = findById(id);
        entityManager.remove(toRemove);

        entityManager.getTransaction().commit();
        return id;
    }

    @Override
    public Student findById(Long id) {
        Student foundStudent = entityManager.find(Student.class, id);

        if (foundStudent == null) {
            throw new EntityNotFoundException("Student with such id not found");
        }

        return foundStudent;
    }

    @Override
    public List<Student> findAll() {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("select s from Student s");

        List<Student> students = query.getResultList();
        if (students.isEmpty()) {
            throw new EntityNotFoundException("Students not found");
        }

        entityManager.getTransaction().commit();

        return students;
    }
}
