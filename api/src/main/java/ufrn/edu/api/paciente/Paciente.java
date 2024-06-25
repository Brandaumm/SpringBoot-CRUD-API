package ufrn.edu.api.paciente;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ufrn.edu.api.endereco.Endereco;

@Table(name = "pacientes")
@Entity(name = "Paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Paciente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private boolean ativo = true;

    @Embedded
    private Endereco endereco;

    public Paciente(DadosCliente dados){
        this.nome = dados.nome();
        this.email = dados.email();
        this.cpf = dados.cpf();
        this.endereco = new Endereco(dados.endereco());
        this.telefone = dados.telefone();
    }

    public void atualizar(DadosClienteAtualizar dados) {
        if(dados.nome() != null) {
            this.nome = dados.nome();
        }
        if(dados.email() != null) {
            this.email = dados.email();
        }

        if(dados.cpf() != null) {
            this.cpf = dados.cpf();
        }
    }

    public void desativar() {
        this.ativo = false;
    }
}



