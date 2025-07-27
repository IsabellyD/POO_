public class PrincipalConta {
    public static void main(String[] args) {
        Conta c1 = new Conta(101, "Rhílary Bracho");
        Conta c2 = new Conta(102, "Gabriel Jesus");
        Conta c3 = new Conta(103, "Antônio Villalobos");

        System.out.println(">>> Estado inicial das contas:");
        c1.exibir();
        c2.exibir();
        c3.exibir();

        c1.depositar(200);
        c2.depositar(150);
        c3.depositar(300);

        System.out.println("\n>>> Após depósitos:");
        c1.exibir();
        c2.exibir();
        c3.exibir();

        c1.setNomeDoCliente("Rhílary Bracho");
        c2.setNomeDoCliente("Gabriel Jesus");
        c3.setNomeDoCliente("Antônio Villalobos");

        c1.sacar(50);
        c2.sacar(100);
        c3.sacar(400);

        System.out.println("\n>>> Após saques:");
        c1.exibir();
        c2.exibir();
        c3.exibir();

        c2.desativar();
        c3.desativar();

        System.out.println("\n>>> Estado final das contas:");
        c1.exibir();
        c2.exibir();
        c3.exibir();
    }
}
