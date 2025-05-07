public class Circulo {
    private int raio;
    private static final double pi = 3.141516;
    
    public Circulo(int raio){
        this.raio = raio;
    }
    
    public double calcularArea(){
        return pi * raio * raio;
    }
    
    public double calcularPerimetro(){
        return 2 * pi * raio;
    }
    
    public void imprimir(){
        System.out.printf("Raio: %d, Área: %.2f, Perímetro: %.2f \n", raio, calcularArea(), calcularPerimetro());
    }
}
