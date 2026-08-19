package br.com.fiap.fintech.model;

public class MetaFinanceira {

    private int idMeta;
    private String nomeMeta;
    private double valorAlvo;
    private int prazoMeses;
    private double progresso;
    private String status;

    public void registrarMeta() {
        System.out.println("Registrando meta: " + nomeMeta);
    }

    public void atualizarProgresso(double valorDepositado) {
        System.out.println("Atualizando progresso da meta " + nomeMeta + " com depósito de R$ " + valorDepositado);
    }

    public void  verificarMetaAtingida() {
        System.out.println("Verificando meta atingida: " + status);
    }

    public MetaFinanceira(int idMeta, String nomeMeta, double valorAlvo, int prazoMeses, double progresso, String status) {
        this.idMeta = idMeta;
        this.nomeMeta = nomeMeta;
        this.valorAlvo = valorAlvo;
        this.prazoMeses = prazoMeses;
        this.progresso = progresso;
        this.status = status;
    }

    public MetaFinanceira() {

    }

    public int getIdMeta() {
        return idMeta;
    }

    public void setIdMeta(int idMeta) {
        this.idMeta = idMeta;
    }

    public String getNomeMeta() {
        return nomeMeta;
    }

    public void setNomeMeta(String nomeMeta) {
        this.nomeMeta = nomeMeta;
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

    public void setProgresso(double progresso) {
        this.progresso = progresso;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
