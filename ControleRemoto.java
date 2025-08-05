public class ControleRemoto {
    private final Televisor televisor;

    public ControleRemoto(Televisor televisor) {
        this.televisor = televisor;
    }

    public void ligarTV() {
        televisor.ligar();
    }

    public void desligarTV() {
        televisor.desligar();
    }

    public void aumentarVolume() {
        televisor.aumentarVolume();
    }

    public void diminuirVolume() {
        televisor.diminuirVolume();
    }

    public void trocarCanal(int novoCanal) {
        televisor.trocarCanal(novoCanal);
    }

    public void mostrarStatus() {
        System.out.println(televisor.toString());
    }
}
