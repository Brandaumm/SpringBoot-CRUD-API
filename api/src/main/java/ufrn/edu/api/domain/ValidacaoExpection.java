package ufrn.edu.api.domain;

public class ValidacaoExpection extends RuntimeException {
    public ValidacaoExpection(String mensagem) {
        super(mensagem);
    }
}
