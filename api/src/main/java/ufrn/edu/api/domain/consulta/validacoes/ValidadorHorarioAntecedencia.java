package ufrn.edu.api.domain.consulta.validacoes;

import org.springframework.stereotype.Component;
import ufrn.edu.api.domain.ValidacaoExpection;
import ufrn.edu.api.domain.consulta.DadosAgendamentoConsulta;

import java.time.Duration;
import java.time.LocalDateTime;

@Component
public class ValidadorHorarioAntecedencia implements ValidadorAgendamentoDeConsulta {

    public void validar(DadosAgendamentoConsulta dados){
        var dataConsulta = dados.data();
        var agora = LocalDateTime.now();
        var diferencaMinutos = Duration.between(agora, dataConsulta).toMinutes();

        if (diferencaMinutos < 30){
            throw new ValidacaoExpection("Conulta deve ser agendada com antecedência minima de 30 minutos");
        }
    }
}
