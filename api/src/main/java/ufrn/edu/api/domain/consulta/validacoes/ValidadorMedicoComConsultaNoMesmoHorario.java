package ufrn.edu.api.domain.consulta.validacoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ufrn.edu.api.domain.ValidacaoExpection;
import ufrn.edu.api.domain.consulta.ConsultaRepository;
import ufrn.edu.api.domain.consulta.DadosAgendamentoConsulta;

@Component
public class ValidadorMedicoComConsultaNoMesmoHorario implements ValidadorAgendamentoDeConsulta{
    @Autowired
    private ConsultaRepository repository;

    public void validar(DadosAgendamentoConsulta dados){
        var medicoPossuiConsultaNoMesmoHorario = repository.existsByMedicoIdAndData(dados.idMedico(), dados.data());
        if(medicoPossuiConsultaNoMesmoHorario){
            throw new ValidacaoExpection("Medico ja possui outra consulta agendada nesse mesmo horario");
        }
    }
}
