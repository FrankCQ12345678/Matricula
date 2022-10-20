package matriculaEv2.matricula.api.dto;
import lombok.Data;

import javax.validation.constraints.NotBlank;
@Data
public class MatriculaDTO {
    @NotBlank
    private String nombre;
}
