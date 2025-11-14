public class PrincipalMercadinho {
    public static void main(String[] args) {

        Mercadinho mercado = new Mercadinho(10);

        mercado.adicionarCliente(new ClienteRegular("Ana", 100));
        mercado.adicionarCliente(new ClienteVip("João", 200, "1234"));
        mercado.adicionarCliente(new ClienteOuroVip("Maria", 300, "9999", "Rua A"));

        System.out.println("----- LISTA DE CLIENTES -----");
        mercado.imprimirClientes();

        System.out.println("\nTotal geral das compras: " + mercado.calcularTotal());
    }
}
