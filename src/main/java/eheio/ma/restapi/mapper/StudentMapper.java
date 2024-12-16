package eheio.ma.restapi.mapper;


import eheio.ma.restapi.DTO.StudentDTO;
import eheio.ma.restapi.entity.Student;
import fr.xebia.extras.selma.Mapper;

@Mapper
public interface StudentMapper {

    StudentDTO asStudent(Student student);
    Student asStudent(StudentDTO studentDTO);
}
