package br.com.fiap.fintech.model;

public class Simulacao {

    private int idSimulacao;
    private double valorInicial;
    private int periodo;
    private double taxaRendimento;
    private double valorFinal;
    private double lucro;

    public void simularInvestimento() {
        System.out.println("Executando simulação de investimento de R$ " + valorInicial + " por " + periodo + " meses");
    }

    public void calcularLucro() {
        System.out.println("Calculando lucro da simulação de investimento: " + lucro);
    }

    public void exibirResultadoSimulacao() {
        System.out.println("Exibindo resultado da simulação: R$ " + valorInicial + " a " + taxaRendimento + "% resulta em R$ " + valorFinal);
    }

    public Simulacao(int idSimulacao, double valorInicial, int periodo, double taxaRendimento, double valorFinal, double lucro) {
        this.idSimulacao = idSimulacao;
        this.valorInicial = valorInicial;
        this.periodo = periodo;
        this.taxaRendimento = taxaRendimento;
        this.valorFinal = valorFinal;
        this.lucro = lucro;
    }

    public Simulacao() {

    }

    public int getIdSimulacao() {
        return idSimulacao;
    }

    public void setIdSimulacao(int idSimulacao) {
        this.idSimulacao = idSimulacao;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }


}
