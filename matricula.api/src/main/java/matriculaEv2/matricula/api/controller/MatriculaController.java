package matriculaEv2.matricula.api.controller;

import matriculaEv2.matricula.api.dto.MatriculaDTO;
import matriculaEv2.matricula.api.model.Matricula;
import matriculaEv2.matricula.api.repository.MatriculaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/api/admin/matricula")
public class MatriculaController {
    private  final MatriculaRepository matriculaRepository;

    public MatriculaController( MatriculaRepository matriculaRepository){
        this.matriculaRepository = matriculaRepository;
    }
    @GetMapping("")
    Page<Matricula> index(@PageableDefault(sort="nombre",size=5) Pageable pageable){
        return matriculaRepository.findAll(pageable);
    }
    @GetMapping("/{id}")
    Matricula obtener(@PathVariable Integer id){
        return MatriculaRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    Matricula crear(@RequestBody @Validated MatriculaDTO matriculaDTO){
        Matricula matricula=new ModelMapper().map(matriculaDTO,Matricula.class);
        return matriculaRepository.save(matricula);
    }
}
