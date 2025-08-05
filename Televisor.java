public class Televisor {
    private int canal;
    private int volume;
    private boolean ligado;

    public Televisor(int canal, int volume, boolean ligado) {
        this.canal = canal;
        this.volume = volume;
        this.ligado = ligado;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("TV ligada. Canal: " + canal + ", Volume: " + volume);
        } else {
            System.out.println("TV já está ligada");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("TV desligada");
        } else {
            System.out.println("TV já está desligada");
        }
    }

    public void aumentarVolume() {
        if (ligado && volume < 100) {
            volume++;
            System.out.println("Volume aumentado: " + volume);
        } else if (!ligado) {
            System.out.println("TV desligada - não pode alterar volume");
        } else {
            System.out.println("Volume máximo (100) atingido");
        }
    }

    public void diminuirVolume() {
        if (ligado && volume > 0) {
            volume--;
            System.out.println("Volume diminuído: " + volume);
        } else if (!ligado) {
            System.out.println("TV desligada - não pode alterar volume");
        } else {
            System.out.println("Volume mínimo (0) atingido");
        }
    }

    public void trocarCanal(int novoCanal) {
        if (ligado && novoCanal >= 1 && novoCanal <= 100) {
            canal = novoCanal;
            System.out.println("Canal alterado para: " + canal);
        } else if (!ligado) {
            System.out.println("TV desligada - não pode trocar canal");
        } else {
            System.out.println("Canal inválido (deve ser entre 1 e 100)");
        }
    }

    @Override
    public String toString() {
        return "Televisor - Canal: " + canal + " | Volume: " + volume + " | " + (ligado ? "Ligado" : "Desligado");
    }
}
