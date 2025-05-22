public class Porta {
    private String cor;
    private double altura;
    private double largura;
    private boolean estaAberta;

    public Porta(String cor, double altura, double largura, boolean estaAberta) {
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
        this.estaAberta = estaAberta;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    public boolean isEstaAberta() {
        return estaAberta;
    }
    public void setEstaAberta(boolean estaAberta) {
        this.estaAberta = estaAberta;
    }

    public String toString() {
        return "Porta{" +
                "cor='" + cor + '\'' +
                ", altura=" + altura +
                ", largura=" + largura +
                ", está aberta=" + estaAberta +
                '}';
    }
}
