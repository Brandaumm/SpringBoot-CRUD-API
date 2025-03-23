package ufrn.edu.api.domain.paciente;

import ufrn.edu.api.domain.endereco.DadosEndereco;

public record DadosCadastroPaciente(String nome, String email, String telefone, String cpf, DadosEndereco dadosEndereco) {
}
