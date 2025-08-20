import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Turma turma = new Turma();

        turma.adicionarAluno(new Aluno("Ana", 101, 8.5, 9.0));
        turma.adicionarAluno(new Aluno("João", 102, 6.0, 5.5));
        turma.adicionarAluno(new Aluno("Maria", 103, 9.0, 8.5));

        turma.listarAlunos();

        System.out.print("=== Buscar Aluno ===\nDigite a matrícula: ");
        int matriculaBusca = scanner.nextInt();
        Aluno alunoEncontrado = turma.buscarPorMatricula(matriculaBusca);

        if (alunoEncontrado != null) {
            alunoEncontrado.exibirInfo();
        } else {
            System.out.println("Aluno não encontrado.");
        }

        scanner.close();
    }
}
