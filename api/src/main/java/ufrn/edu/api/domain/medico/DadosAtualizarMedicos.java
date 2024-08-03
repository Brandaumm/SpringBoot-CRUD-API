package ufrn.edu.api.domain.medico;

import jakarta.validation.constraints.NotNull;
import ufrn.edu.api.domain.endereco.DadosEndereco;

public record DadosAtualizarMedicos(
        @NotNull
        Long id,

        String nome,
        String telefone,
        DadosEndereco endereco) {
}
