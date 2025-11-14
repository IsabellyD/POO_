public class ClienteVip extends Cliente {

    private String numeroCartao;

    public ClienteVip(String nome, double valorDaCompra, String numeroCartao) {
        super(nome, valorDaCompra);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public double calcularPagamento() {
        return getValorDaCompra() * 0.90; // 10% de desconto
    }
}
