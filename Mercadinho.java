public class Mercadinho {

    private Cliente[] clientes;
    private int quantidade;

    public Mercadinho(int capacidade) {
        clientes = new Cliente[capacidade];
        quantidade = 0;
    }

    public void adicionarCliente(Cliente cliente) {
        if (quantidade < clientes.length) {
            clientes[quantidade] = cliente;
            quantidade++;
        } else {
            System.out.println("Mercadinho cheio!");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < quantidade; i++) {
            total += clientes[i].calcularPagamento();
        }
        return total;
    }

    public void imprimirClientes() {
        for (int i = 0; i < quantidade; i++) {
            Cliente c = clientes[i];
            System.out.printf("Nome: %s — Valor final: %.2f\n",
                    c.getNome(), c.calcularPagamento());
        }
    }
}
