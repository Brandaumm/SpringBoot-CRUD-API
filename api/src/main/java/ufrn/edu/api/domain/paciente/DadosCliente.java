package ufrn.edu.api.domain.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import ufrn.edu.api.domain.endereco.DadosEndereco;

public record DadosCliente(
        @NotBlank
        String nome,
        @NotBlank
        String email,
        @NotBlank
        String cpf,
        @NotNull @Valid
        DadosEndereco endereco,
        @NotBlank
        String telefone
) {
}
