package ufrn.edu.api.domain.consulta.validacoes;

import org.springframework.stereotype.Component;
import ufrn.edu.api.domain.ValidacaoExpection;
import ufrn.edu.api.domain.consulta.DadosAgendamentoConsulta;

import java.time.DayOfWeek;

@Component
public class ValidadorHorarioFuncionamentoClinica implements ValidadorAgendamentoDeConsulta {

    public void validar(DadosAgendamentoConsulta dados) {
        var dataConsulta = dados.data();

        var domingo = dataConsulta.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        var antesDaAberturaClinica = dataConsulta.getHour() < 7;
        var depoisDoEncerramentoClinica = dataConsulta.getHour() > 18;

        if(domingo || antesDaAberturaClinica || depoisDoEncerramentoClinica){
            throw new ValidacaoExpection("Consulta fora do horario de funcionamento da clinica");
        }

    }
}
