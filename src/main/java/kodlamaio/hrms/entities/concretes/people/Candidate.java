package kodlamaio.hrms.entities.concretes.people;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "candidates")
@AllArgsConstructor
@NoArgsConstructor
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "nationality_number")
    private String nationalityNumber;

    @Column(name = "birth_year")
    private int birthYear;

    @Column(name = "e_mail")
    private String eMail;

    @Column(name = "password")
    private String password;

    @Column(name = "password_again")
    private String passwordAgain;

}
