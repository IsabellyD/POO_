public class Aluno {
    private String nome;
    private int matricula;
    private double nota1;
    private double nota2;

    public Aluno(String nome, int matricula, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String situacao() {
        return calcularMedia() >= 7.0 ? "Aprovado" : "Reprovado";
    }

    public void exibirInfo() {
        System.out.printf("Nome: %s | Matrícula: %d | Média: %.1f | Situação: %s%n", nome, matricula, calcularMedia(), situacao());
    }

    public int getMatricula() {
        return matricula;
    }
}


