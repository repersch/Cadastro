package br.edu.ifsp.scl.ads.pdm.cadastro;

public class Formulario {

    private String nome;
    private String telefone;
    private String email;
    private Boolean lista;
    private String sexo;
    private String cidade;
    private String uf;

    public Formulario() {
    }

    public Formulario(String nome, String telefone, String email, Boolean lista, String sexo, String cidade, String uf) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.lista = lista;
        this.sexo = sexo;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getLista() {
        return lista;
    }

    public void setLista(Boolean lista) {
        this.lista = lista;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return  "Nome: " + nome +
                "\nTelefone: " + telefone +
                "\nE-mail: " + email +
                "\nEstá na lista de e-mail? " + lista +
                "\nSexo: " + sexo +
                "\nCidade: " + cidade +
                "\nUF: " + uf;
    }
}
