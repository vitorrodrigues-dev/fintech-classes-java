package br.com.fiap.fintech.model;

public class RendaFixa extends Investimento {
    private double taxaJuros;

    public RendaFixa(int idInvestimento, String nome, double valorAplicado, String dataInvestimento, double taxaJuros) {
        super(idInvestimento, nome, valorAplicado, dataInvestimento);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public double calcularRendimento() {
        return getValorAplicado() * taxaJuros / 100;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
}
