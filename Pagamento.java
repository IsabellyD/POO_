public abstract class Pagamento {
    private String nomeCliente;
    private double valor;

    public Pagamento(String nomeCliente, double valor) {
        this.nomeCliente = nomeCliente;
        this.valor = valor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getValor() {
        return valor;
    }

    public abstract double processarPagamento();
}
