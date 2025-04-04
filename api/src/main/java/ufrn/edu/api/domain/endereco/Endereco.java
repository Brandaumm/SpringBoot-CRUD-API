package ufrn.edu.api.domain.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco endereco) {
        this.logradouro = endereco.logradouro();
        this.bairro = endereco.bairro();
        this.cep = endereco.cep();
        this.uf = endereco.uf();
        this.cidade = endereco.cidade();
        this.numero = endereco.numero();
        this.complemento = endereco.complemento();
    }

    public void atualizar(DadosEndereco dados) {
        if(dados.logradouro() != null){
            this.logradouro = dados.logradouro();
        }
        if(dados.bairro() != null){
            this.bairro = dados.logradouro();
        }
        if(dados.cep() != null){
            this.cep = dados.logradouro();
        }
        if(dados.uf() != null){
            this.uf = dados.logradouro();
        }
        if(dados.cidade() != null){
            this.cidade = dados.logradouro();
        }
        if(dados.numero() != null){
            this.numero = dados.logradouro();
        }
        if(dados.complemento() != null){
            this.complemento = dados.logradouro();
        }

    }
}
