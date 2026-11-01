import model.Transacao;
import model.TipoTransacao;
import service.FinanceiroService;

import java.math.BigDecimal;
import java.time.LocalDate;

void main() {
    FinanceiroService financeiroService = new FinanceiroService();
    Transacao salario = new Transacao("Salário",
            new BigDecimal("3000.00"),
            TipoTransacao.RECEITA,
            "Trabalho",
            LocalDate.now()
    );
    financeiroService.adicionarTransacao(salario);
    System.out.println(financeiroService.getTransacoes());
}