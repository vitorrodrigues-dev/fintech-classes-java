package br.com.fiap.fintech.model;

public class MetaFinanceira {

    private int idMeta;
    private String nomeMeta;
    private double valorAlvo;
    private int prazoMeses;
    private double progresso;


    public void atualizarProgresso(double valorDepositado) {
        if (valorDepositado <= 0) {
            throw new IllegalArgumentException("O valor depositado deve ser positivo.");
        }
        this.progresso += valorDepositado;

    }

    public boolean  verificarMetaAtingida() {
        return progresso >= valorAlvo;
    }

    public MetaFinanceira(int idMeta, String nomeMeta, double valorAlvo, int prazoMeses) {
        this.idMeta = idMeta;
        this.nomeMeta = nomeMeta;
        this.valorAlvo = valorAlvo;
        this.prazoMeses = prazoMeses;
    }

    public int getIdMeta() {
        return idMeta;
    }

    public void setNomeMeta(String nomeMeta) {
        this.nomeMeta = nomeMeta;
    }

    public String getNomeMeta() {
        return nomeMeta;
    }

    public double getValorAlvo() {
        return valorAlvo;
    }

    public void setValorAlvo(double valorAlvo) {
        this.valorAlvo = valorAlvo;
    }

    public int getPrazoMeses() {
        return prazoMeses;
    }

    public void setPrazoMeses(int prazoMeses) {
        this.prazoMeses = prazoMeses;
    }

    public double getProgresso() {
        return progresso;
    }

}
