package model;

public class Funcionario {
    // Atributos do funcionário
    private int id; // ID único do funcionário
    private String nome; // Nome do funcionário
    private String senha; // Senha do funcionário
    private String cargo; // Cargo do funcionário (ex: Administrador, Vendedor, etc.)
    private String email; // Email do funcionário
    private String telefone; // Telefone do funcionário

    // Construtor padrão
    public Funcionario() {
    }

    // Construtor com parâmetros
    public Funcionario(int id, String nome, String senha, String cargo, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.cargo = cargo;
        this.email = email;
        this.telefone = telefone;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Método para exibir informações do funcionário
    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", cargo='" + cargo + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
