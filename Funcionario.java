import java.util.Scanner;

public class Funcionario {
    private int codigo;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private int idade;
    private float salario;

    public Funcionario(int codigo, String nome, String cpf, String endereco, String telefone, int idade, float salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.salario = salario;
    }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
    public float getSalario() { return salario; }
    public void setSalario(float salario) { this.salario = salario; }

    public void mostrarDados() {
        System.out.printf("Código: %d\nNome: %s\nCPF: %s\nEndereço: %s\nTelefone: %s\nIdade: %d\nSalário: R$%.2f\n",
            codigo, nome, cpf, endereco, telefone, idade, salario);
    }

    public float calculaSalarioLiquido() {
        float descontoINSS = salario * 11 / 100;
        return salario - descontoINSS;
    }
}