public class CadastroPagamento {

    private Pagamento[] pagamentos;
    private int quantidade;

    public CadastroPagamento(int capacidade) {
        pagamentos = new Pagamento[capacidade];
        quantidade = 0;
    }

    public void adicionar(Pagamento pagamento) {
        if (quantidade < pagamentos.length) {
            pagamentos[quantidade] = pagamento;
            quantidade++;
        } else {
            System.out.println("Cadastro cheio! Não é possível adicionar mais pagamentos.");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < quantidade; i++) {
            total += pagamentos[i].processarPagamento();
        }
        return total;
    }

    public void imprimirPagamentos() {
        for (int i = 0; i < quantidade; i++) {
            System.out.println(pagamentos[i]);
        }
    }
}
