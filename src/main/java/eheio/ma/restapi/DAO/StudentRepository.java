package eheio.ma.restapi.DAO;

import eheio.ma.restapi.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {

    List<Student> getAllStudents();
    Student getStudentById(int id);
    Optional<Student> addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(int id);
}
