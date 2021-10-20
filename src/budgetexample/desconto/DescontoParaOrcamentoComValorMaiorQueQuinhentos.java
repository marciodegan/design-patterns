package budgetexample.desconto;

import budgetexample.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends Desconto {

    public DescontoParaOrcamentoComValorMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
            return orcamento.getValor().multiply((new BigDecimal("0.05")));
        }

//        return BigDecimal.ZERO // ao inves de retornar zero, agora retorno o proximo a calcular.
        return proximo.calcular( orcamento);
    }
}
