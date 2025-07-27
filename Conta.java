public class Conta {
    private int numeroDaConta;
    private String nomeDoCliente;
    private double saldo;
    private boolean ativa;

    public Conta(int numeroDaConta, String nomeDoCliente) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoCliente = nomeDoCliente;
        this.saldo = 0.0;
        this.ativa = true;
    }

    public void depositar(double valor) {
        if (valor > 0 && ativa) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado na conta " + numeroDaConta);
        } else {
            System.out.println("Erro: depósito inválido ou conta inativa.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo && ativa) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado na conta " + numeroDaConta);
        } else {
            System.out.println("Erro: saque inválido ou conta inativa.");
        }
    }

    public void desativar() {
        if (ativa) {
            ativa = false;
            System.out.println("Conta " + numeroDaConta + " desativada.");
        } else {
            System.out.println("Conta já está desativada.");
        }
    }

    public void ativar() {
        if (!ativa) {
            ativa = true;
            System.out.println("Conta " + numeroDaConta + " ativada.");
        } else {
            System.out.println("Conta já está ativa.");
        }
    }

    public void exibir() {
        System.out.println(this.toString());
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public String toString() {
        return "Conta { " +
                "Número: " + numeroDaConta +
                ", Cliente: '" + nomeDoCliente + '\'' +
                ", Saldo: R$" + saldo +
                ", Ativa: " + ativa +
                " }";
    }
}