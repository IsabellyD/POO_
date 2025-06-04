public class PrincipalHelicoptero {
    public static void main(String[] args) {
        Helicoptero h3 = new Helicoptero(4);
        Helicoptero h5 = new Helicoptero(7);
        
        System.out.println("Estado inicial dos helicópteros:");
        h3.exibir();
        h5.exibir();

        h3.realizarEntrada();
        h3.realizarEntrada();
        h5.realizarEntrada();
        h5.realizarEntrada();
        h5.realizarEntrada();

        h3.ligar();
        h5.ligar();

        h3.decolar();
        h5.decolar();

        System.out.println("\nEstado após decolagem:");
        h3.exibir();
        h5.exibir();

        h3.aterrissar();
        h5.aterrissar();


        h3.desligar();
        h5.desligar();

        h3.realizarSaida();
        h3.realizarSaida();
        h5.realizarSaida();

        System.out.println("\nEstado final dos helicópteros:");
        h3.exibir();
        h5.exibir();
    }
}

