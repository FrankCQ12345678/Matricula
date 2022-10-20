package matriculaEv2.matricula.api.model;
import Lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmatricula")
    private Matricula id;
    private String nombre;
    private String DNI;
    private String Ciclo;
    private String F_nac;
    private String Direccion;
    private String Telefono;
}
