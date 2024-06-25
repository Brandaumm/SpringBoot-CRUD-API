package ufrn.edu.api.medico;

import jakarta.validation.constraints.NotNull;
import ufrn.edu.api.endereco.DadosEndereco;

public record DadosAtualizarMedicos(
        @NotNull
        Long id,

        String nome,
        String telefone,
        DadosEndereco endereco) {
}
