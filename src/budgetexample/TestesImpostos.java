package budgetexample;

import budgetexample.imposto.CalculadoraDeImpostos;
import budgetexample.imposto.ICMS;
import budgetexample.imposto.ISS;
import budgetexample.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ISS()));
        System.out.println(calculadora.calcular(orcamento, new ICMS()));
    }
}
