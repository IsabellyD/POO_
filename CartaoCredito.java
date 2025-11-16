public class CartaoCredito extends Pagamento {
    private int quantidadeParcelas;

    public CartaoCredito(String nomeCliente, double valor, int quantidadeParcelas) {
        super(nomeCliente, valor);
        this.quantidadeParcelas = quantidadeParcelas;
    }

    @Override
    public double processarPagamento() {
        // 2% por parcela → valor + (valor * parcelas / 100 * 2)
        return getValor() + (getValor() * quantidadeParcelas * 0.02);
    }

    @Override
    public String toString() {
        return "Cartão de Crédito | Cliente: " + getNomeCliente() +
               " | Parcelas: " + quantidadeParcelas +
               " | Valor base: R$ " + getValor() +
               " | Final: R$ " + processarPagamento();
    }
}
