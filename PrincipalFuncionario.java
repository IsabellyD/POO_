import java.util.Scanner;

public class PrincipalFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario f = new Funcionario(1, "Lais Oliveira", "148.076.129-59", "Rua João Pessoa, 170", "90896-3174", 35, 2500.0f);

        System.out.println("Dados iniciais do funcionário:");
        f.mostrarDados();

        System.out.print("\nDigite o novo salário: ");
        float novoSalario = sc.nextFloat();
        f.setSalario(novoSalario);

        float salarioLiquido = f.calculaSalarioLiquido();

        System.out.println("\nDados atualizados do funcionário:");
        f.mostrarDados();
        System.out.printf("Salário líquido (com desconto de 11%%): R$%.2f\n", salarioLiquido);

        sc.close();
    }
}
