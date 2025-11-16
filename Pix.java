public class Pix extends Pagamento {
    private String chave;

    public Pix(String nomeCliente, double valor, String chave) {
        super(nomeCliente, valor);
        this.chave = chave;
    }

    @Override
    public double processarPagamento() {
        return getValor();
    }

    @Override
    public String toString() {
        return "PIX | Cliente: " + getNomeCliente() +
               " | Chave: " + chave +
               " | Valor base: R$ " + getValor() +
               " | Final: R$ " + processarPagamento();
    }
}
