package br.com.fiap.fintech.model;

public class RendaVariavel extends Investimento{
    private double variacaoPercentual;

    public RendaVariavel(int idInvestimento, String nome, double valorAplicado, String dataInvestimento, double variacaoPercentual) {
        super(idInvestimento, nome, valorAplicado, dataInvestimento);
        this.variacaoPercentual = variacaoPercentual;
    }

    @Override
    public double calcularRendimento() {
        return getValorAplicado() * variacaoPercentual / 100;
    }

    public double getVariacaoPercentual() {
        return variacaoPercentual;
    }

    public void setVariacaoPercentual(double variacaoPercentual) {
        this.variacaoPercentual = variacaoPercentual;
    }
}
