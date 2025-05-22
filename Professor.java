public class Professor {
    private int matricula;
    private String nome_do_Professor;
    private String nome_do_departamento;

    public Professor(int matricula, String nome_do_Professor, String nome_do_departamento) {
        this.matricula = matricula;
        this.nome_do_Professor = nome_do_Professor;
        this.nome_do_departamento = nome_do_departamento;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome_do_Professor() {
        return nome_do_Professor;
    }
    public void setNome_do_Professor(String nome_do_Professor) {
        this.nome_do_Professor = nome_do_Professor;
    }
    public String getNome_do_departamento() {
        return nome_do_departamento;
    }
    public void setNome_do_departamento(String nome_do_departamento) {
        this.nome_do_departamento = nome_do_departamento;
    }

    public void imprimir() {
        System.out.printf("Matrícula: %d, Nome do Professor: %s, Departamento: %s\n",
                matricula, nome_do_Professor, nome_do_departamento);
    }
}
