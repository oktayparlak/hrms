package kodlamaio.hrms.entities.concretes.people;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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

    @NotNull
    @NotBlank
    @Column(name = "name")
    private String name;

    @NotNull
    @NotBlank
    @Column(name = "last_name")
    private String lastName;

    @NotNull
    @NotBlank
    @Column(name = "nationality_number")
    private long nationalityNumber;

    @NotNull
    @NotBlank
    @Column(name = "birth_year")
    private int birthYear;

    @NotNull
    @NotBlank
    @Email
    @Column(name = "e_mail")
    private String eMail;

    @NotNull
    @NotBlank
    @Column(name = "password")
    private String password;

}
