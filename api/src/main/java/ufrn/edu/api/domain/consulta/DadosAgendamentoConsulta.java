package ufrn.edu.api.domain.consulta;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import ufrn.edu.api.domain.medico.Especialidade;
import java.time.LocalDateTime;

public record DadosAgendamentoConsulta(
        Long idMedico,

        @NotNull
        Long idPaciente,

        @NotNull
        @Future
        LocalDateTime data,

        Especialidade especialidade
) {
}
