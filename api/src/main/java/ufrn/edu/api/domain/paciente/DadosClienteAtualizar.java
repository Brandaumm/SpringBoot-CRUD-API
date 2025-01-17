package ufrn.edu.api.domain.paciente;

import jakarta.validation.constraints.NotNull;

public record DadosClienteAtualizar(
        @NotNull
        Long id,
        String nome,
        String email,
        String cpf) {
}
