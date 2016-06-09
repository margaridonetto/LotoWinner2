package regras.negocio;

public class Usuario {
    
    private String nome;
    private String cpf;
    private String telefone;
    private String celular;
    private String email;
    private String senha;
    private String user;
    
    public Usuario(){}
    
    public Usuario(String nome, String cpf, String celular, String telefone, String email, String senha, String user){
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.user = user;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
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
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
