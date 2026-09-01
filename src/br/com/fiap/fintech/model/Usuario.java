package br.com.fiap.fintech.model;

public class Usuario {

    private int idUsuario;
    private String nome;
    private String email;
    private String senha;
    private String perfilFinanceiro;
    private String dataCadastro;


    public void alterarSenha(String novaSenha) {
        if (novaSenha == null || novaSenha.length() < 4) {
            throw new IllegalArgumentException("A nova senha deve ter pelo menos 4 caracteres.");
        }

        if(novaSenha.equals(this.senha)) {
            throw new IllegalArgumentException("A nova senha não pode ser igual à senha atual.");
        }

        this.senha = novaSenha;
    }

    public void atualizarPerfilFinanceiro(String novoPerfil) {
        this.perfilFinanceiro = novoPerfil;
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

    public String getPerfilFinanceiro() {
        return perfilFinanceiro;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

}
