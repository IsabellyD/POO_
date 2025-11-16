public class Boleto extends Pagamento {

    private String linhaDigitavel;

    public Boleto(String nomeCliente, double valor, String linhaDigitavel) {
        super(nomeCliente, valor);
        this.linhaDigitavel = linhaDigitavel;
    }

    @Override
    public double processarPagamento() {
        return getValor() + (getValor() * 0.015); // 1,5%
    }

    @Override
    public String toString() {
        return "Boleto | Cliente: " + getNomeCliente() +
               " | Linha Digitável: " + linhaDigitavel +
               " | Valor base: R$ " + getValor() +
               " | Final: R$ " + processarPagamento();
    }
}
