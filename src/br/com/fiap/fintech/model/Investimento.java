package br.com.fiap.fintech.model;

public abstract class Investimento {

    private int idInvestimento;
    private String nome;
    private double valorAplicado;
    private String dataInvestimento;

    public abstract double calcularRendimento();

    public void aplicarInvestimento(double valorAporte) {
        if (valorAporte <= 0) {
            throw new IllegalArgumentException("O valor aportado deve ser positivo");
        }
        this.valorAplicado += valorAporte;
    }

    public void resgatarInvestimento(double valorResgate) {
        if (valorResgate > this.valorAplicado) {
            throw new IllegalArgumentException("O valor a ser resgatado deve ser menor ou igual ao valor aplicado");
        }

        if (valorResgate <= 0) {
            throw new IllegalArgumentException("O valor a ser resgatado deve ser positivo");
        }

        this.valorAplicado -= valorResgate;
    }

    public Investimento(int idInvestimento, String nome, double valorAplicado, String dataInvestimento) {
        this.idInvestimento = idInvestimento;
        this.nome = nome;
        this.valorAplicado = valorAplicado;
        this.dataInvestimento = dataInvestimento;
    }

    public int getIdInvestimento() {
        return idInvestimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorAplicado() {
        return valorAplicado;
    }


    public String getDataInvestimento() {
        return dataInvestimento;
    }
}
