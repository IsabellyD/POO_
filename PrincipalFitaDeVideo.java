public class PrincipalFitaDeVideo {
    public static void main(String[] args) {
        FitaDeVideo fita1 = new FitaDeVideo("Barbie", 3.5);
        FitaDeVideo fita2 = new FitaDeVideo("Branca de Neve", 7.0);
        
        System.out.printf("Título: %s, Preço por dia: R$%.2f\n", fita1.getTitulo(), fita1.getPrecoAluguelPorDia());
        System.out.printf("Valor do aluguel por 7 dias: R$%.2f\n", fita1.getValorAluguel(7));
        System.out.printf("Título: %s, Preço por dia: R$%.2f\n", fita2.getTitulo(), fita2.getPrecoAluguelPorDia());
        System.out.printf("Valor do aluguel por 4 dias: R$%.2f\n", fita2.getValorAluguel(4));
    }
}
