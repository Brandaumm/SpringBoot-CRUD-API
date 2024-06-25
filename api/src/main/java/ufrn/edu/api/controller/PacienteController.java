package ufrn.edu.api.controller;


import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import ufrn.edu.api.paciente.*;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    PacienteRepository repository;

    @Transactional
    @PostMapping
    public void cadastrar(@RequestBody @Valid DadosCliente dados){
        repository.save(new Paciente(dados));

    }

   @GetMapping
    public Page<DadosListagemPaciente> listar (@PageableDefault(sort={"nome"}, size = 10) Pageable paginacao){
    return repository.findAllByAtivoTrue(paginacao).map(DadosListagemPaciente::new);
    }

    @Transactional
    @PutMapping
    public void atualizar(@RequestBody @Valid DadosClienteAtualizar dados){
        var medico = repository.getReferenceById(dados.id());
        medico.atualizar(dados);

    }

    @Transactional
    @DeleteMapping("/{id}")
    public void desativar(@PathVariable Long id){
        var paciente = repository.getReferenceById(id);
        paciente.desativar();
    }
}
