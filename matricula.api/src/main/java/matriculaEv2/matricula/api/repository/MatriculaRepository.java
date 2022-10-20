package matriculaEv2.matricula.api.repository;

import matriculaEv2.matricula.api.model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;
public interface MatriculaRepository extends JpaRepository<Matricula, Integer> {

}
