package eheio.ma.restapi.DAO.StudentImpl;

import eheio.ma.restapi.DAO.StudentRepository;
import eheio.ma.restapi.DAO.StudentRepositoryJPA;
import eheio.ma.restapi.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StudentRepositoryImpl implements StudentRepository {


    StudentRepositoryJPA studentRepository;


    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Optional<Student> addStudent(Student student) {
         studentRepository.save(student);
         return Optional.of(student);
    }

    @Override
    public void updateStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
}
