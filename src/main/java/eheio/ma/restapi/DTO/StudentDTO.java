package eheio.ma.restapi.DTO;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {

    private int id;
    private String nom;
    private String prenom;
    private int age;

}