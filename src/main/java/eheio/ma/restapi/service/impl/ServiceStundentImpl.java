package eheio.ma.restapi.service.impl;

import eheio.ma.restapi.DAO.StudentImpl.StudentRepositoryImpl;
import eheio.ma.restapi.DAO.StudentRepository;
import eheio.ma.restapi.entity.Student;
import eheio.ma.restapi.service.ServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceStundentImpl implements ServiceStudent {

    private final StudentRepository studentRepository;

    public ServiceStundentImpl(@Autowired StudentRepository studentRepositoryImpl) {
        this.studentRepository = studentRepositoryImpl;
    }

    @Override
    public Student getStudent() {
        return null;
    }

    @Override
    public List<Student> getStudents() {
        return List.of();
    }

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public void deleteStudent(Student student) {

    }

    @Override
    public void updateStudent(Student student) {

    }
}
