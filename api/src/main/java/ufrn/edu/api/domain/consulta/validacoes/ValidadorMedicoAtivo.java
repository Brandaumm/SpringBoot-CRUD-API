package ufrn.edu.api.domain.consulta.validacoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ufrn.edu.api.domain.ValidacaoExpection;
import ufrn.edu.api.domain.consulta.DadosAgendamentoConsulta;
import ufrn.edu.api.domain.medico.MedicoRepository;

@Component
public class ValidadorMedicoAtivo implements ValidadorAgendamentoDeConsulta{
    @Autowired
    private MedicoRepository repository;

    public void validar (DadosAgendamentoConsulta dados) {

        if(dados.idMedico() == null){
            return;
        }

        var medicoEstaAtivo = repository.findAtivoById(dados.idMedico());
        if(!medicoEstaAtivo){
            throw new ValidacaoExpection("A consulta não pode ser agendada com um medico inativo");
        }
    }
}
