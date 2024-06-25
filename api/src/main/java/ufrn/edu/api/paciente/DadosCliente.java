package ufrn.edu.api.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import ufrn.edu.api.endereco.DadosEndereco;

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
