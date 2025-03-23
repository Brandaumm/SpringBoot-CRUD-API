package ufrn.edu.api.domain.consulta.validacoes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ufrn.edu.api.domain.ValidacaoExpection;
import ufrn.edu.api.domain.consulta.DadosAgendamentoConsulta;
import ufrn.edu.api.domain.paciente.PacienteRepository;

@Component
public class ValidadorPacienteAtivo implements ValidadorAgendamentoDeConsulta{
    @Autowired
    private PacienteRepository repository;

    public void validar(DadosAgendamentoConsulta dados){
        var pacienteEstaAtivo = repository.findAtivoById(dados.idPaciente());
        if(!pacienteEstaAtivo){
            throw new ValidacaoExpection("Consulta não pode ser agendada com paciente excluido");
        }
    }
}
