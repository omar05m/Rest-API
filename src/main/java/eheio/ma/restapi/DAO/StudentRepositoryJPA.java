package eheio.ma.restapi.DAO;

import eheio.ma.restapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositoryJPA extends JpaRepository<Student,Integer> {

}
