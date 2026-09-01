package br.com.fiap.fintech.model;

public class Simulacao {

    private int idSimulacao;
    private double valorInicial;
    private int periodo;
    private double taxaRendimento;

    public Simulacao(int idSimulacao, double valorInicial, int periodo, double taxaRendimento) {
        if (valorInicial <= 0) {
            throw new IllegalArgumentException("O valor inicial deve ser maior que zero.");
        }
        if (periodo <= 0) {
            throw new IllegalArgumentException("O período deve ser maior que zero.");
        }

        this.idSimulacao = idSimulacao;
        this.valorInicial = valorInicial;
        this.periodo = periodo;
        this.taxaRendimento = taxaRendimento;
    }


    public double simularInvestimento() {
        double simulacao = valorInicial * (1 + taxaRendimento * periodo / 100);
        return simulacao;
    }

    public double calcularLucro() {
        return simularInvestimento() - valorInicial;
    }

    public String exibirResultadoSimulacao() {
        return "Simulação: R$ " + valorInicial + " a " + taxaRendimento + "% ao mês por " + periodo + " meses é igual a: " + simularInvestimento() + ", com lucro de: " + calcularLucro();
    }

    public int getIdSimulacao() {
        return idSimulacao;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public int getPeriodo() {
        return periodo;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

}
