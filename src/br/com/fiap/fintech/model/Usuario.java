package br.com.fiap.fintech.model;

public class Usuario {

    private int idUsuario;
    private String nome;
    private String email;
    private String senha;
    private String perfilFinanceiro;
    private String dataCadastro;


    public void cadastrarUsuario() {
        System.out.println("Cadastrando novo usuário: " + nome + " | e-mail: " + email);
    }

    public void alterarSenha(String novaSenha) {
        System.out.println("Alterando a senha do usuário " + nome);
    }

    public void atualizarPerfilFinanceiro() {
        System.out.println("Alterando Perfil Financeiro do usuário: " + nome);
    }

    public Usuario() {

    }

    public Usuario(int idUsuario, String nome, String email, String senha, String perfilFinanceiro, String dataCadastro) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.perfilFinanceiro = perfilFinanceiro;
        this.dataCadastro = dataCadastro;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfilFinanceiro() {
        return perfilFinanceiro;
    }

    public void setPerfilFinanceiro(String perfilFinanceiro) {
        this.perfilFinanceiro = perfilFinanceiro;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
