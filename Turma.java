public class Turma {
    private Aluno[] alunos;
    private int quantidade;

    public Turma() {
        alunos = new Aluno[5];
        quantidade = 0;
    }

    public void adicionarAluno(Aluno aluno) {
        if (quantidade < 5) {
            alunos[quantidade] = aluno;
            quantidade++;
        } else {
            System.out.println("Limite de alunos atingido.");
        }
    }

    public void listarAlunos() {
        System.out.println("=== Lista de Alunos ===");
        for (int i = 0; i < quantidade; i++) {
            alunos[i].exibirInfo();
        }
    }

    public Aluno buscarPorMatricula(int matricula) {
        for (int i = 0; i < quantidade; i++) {
            if (alunos[i].getMatricula() == matricula) {
                return alunos[i];
            }
        }
        return null;
    }
}
