public class FitaDeVideo {
    private String titulo;
    private double PrecoAluguelPorDia;
    
    public FitaDeVideo(String titulo, double PrecoAluguelPorDia){
        this.titulo = titulo;
        this.PrecoAluguelPorDia = PrecoAluguelPorDia;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public double getPrecoAluguelPorDia() {
        return PrecoAluguelPorDia;
    }
    
    public double getValorAluguel(int NumeroDeDiasAlugada) {
        return PrecoAluguelPorDia * NumeroDeDiasAlugada;
    }
    public String toString() {
        return String.format("Título: %s, Preço por dia: R$%.2f", titulo, PrecoAluguelPorDia);
    }
}