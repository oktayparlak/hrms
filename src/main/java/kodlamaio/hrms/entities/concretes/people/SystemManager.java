package kodlamaio.hrms.entities.concretes.people;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "system_managers")
public class SystemManager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;



}
