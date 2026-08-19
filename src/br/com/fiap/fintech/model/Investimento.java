package br.com.fiap.fintech.model;

public class Investimento {

    private int idInvestimento;
    private String tipo;
    private double valorAplicado;
    private double rendimento;
    private String dataInvestimento;

    public void aplicarInvestimento() {
        System.out.println("Aplicando investimento de: " + valorAplicado);
    }

    public void resgatarInvestimento(double valorResgate) {
        System.out.println("Resgatando R$ " + valorResgate + " do investimento em " + tipo);
    }

    public void calcularRendimento () {
        System.out.println("Calculando rendimento: " + rendimento);
    }

    public Investimento() {

    }

    public Investimento(int idInvestimento, String tipo, double valorAplicado, double rendimento, String dataInvestimento) {
        this.idInvestimento = idInvestimento;
        this.tipo = tipo;
        this.valorAplicado = valorAplicado;
        this.rendimento = rendimento;
        this.dataInvestimento = dataInvestimento;
    }

    public int getIdInvestimento() {
        return idInvestimento;
    }

    public void setIdInvestimento(int idInvestimento) {
        this.idInvestimento = idInvestimento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValorAplicado() {
        return valorAplicado;
    }

    public void setValorAplicado(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public String getDataInvestimento() {
        return dataInvestimento;
    }

    public void setDataInvestimento(String dataInvestimento) {
        this.dataInvestimento = dataInvestimento;
    }
}
