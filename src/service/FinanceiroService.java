package service;

import model.Transacao;
import java.util.ArrayList;
import java.util.List;

public class FinanceiroService {

    private List<Transacao> transacoes;

    public FinanceiroService(){
        this.transacoes = new ArrayList<>();
    }
    public void adicionarTransacao(Transacao transacao){
        transacoes.add(transacao);
    }
    public List<Transacao> getTransacoes(){
        return List.copyOf(transacoes);
    }
}
