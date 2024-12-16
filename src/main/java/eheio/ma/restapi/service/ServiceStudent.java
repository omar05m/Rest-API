package eheio.ma.restapi.service;

import eheio.ma.restapi.entity.Student;

import java.util.List;

public interface ServiceStudent {

    Student getStudent();
    List<Student> getStudents();
    void addStudent(Student student);
    void deleteStudent(Student student);
    void updateStudent(Student student);
}
