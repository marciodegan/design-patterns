package budgetexample.desconto;

import budgetexample.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    // protected para que classes-filhas consigam acessar esse atribute.
    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    // com método abstract, forço cada classe filha a ter esse método implementado.
    public abstract BigDecimal calcular(Orcamento orcamento);

    }
