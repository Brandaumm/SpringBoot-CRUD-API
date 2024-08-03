package ufrn.edu.api.domain.paciente;

import ufrn.edu.api.domain.endereco.Endereco;

public record DadosDetalhamentoPaciente(String nome, String email, String cpf, Endereco endereco, String telefone) {

    public DadosDetalhamentoPaciente(Paciente paciente){
        this(paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getEndereco(), paciente.getTelefone());
    }

}
