public class Helicoptero {
    private boolean ligado;
    private int altitude;
    private int capacidadeDoHelicoptero;
    private int quantidadeDePessoasPresentes;

    public Helicoptero(int capacidadeDoHelicoptero) {
        this.capacidadeDoHelicoptero = capacidadeDoHelicoptero;
        this.ligado = false;
        this.altitude = 0;
        this.quantidadeDePessoasPresentes = 0;
    }


    public void realizarEntrada() {
        if (quantidadeDePessoasPresentes < capacidadeDoHelicoptero) {
            quantidadeDePessoasPresentes++;
            System.out.println("Entrou uma pessoa no helicóptero.");
        } else {
            System.out.println("Helicóptero cheio. Ninguém pode entrar.");
        }
    }

    public void realizarSaida() {
        if (quantidadeDePessoasPresentes > 0) {
            quantidadeDePessoasPresentes--;
            System.out.println("Saiu uma pessoa do helicóptero.");
        } else {
            System.out.println("Não há ninguém no helicóptero.");
        }
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Helicóptero ligado.");
        } else {
            System.out.println("O helicóptero já está ligado.");
        }
    }

    public void decolar() {
        if (ligado && altitude == 0) {
            altitude = 300;
            System.out.println("Helicóptero decolou para 300 metros.");
        } else {
            System.out.println("Não pode decolar. Verifique se está ligado e no chão.");
        }
    }

    public void aterrissar() {
        if (ligado && altitude > 0) {
            altitude = 0;
            System.out.println("Helicóptero aterrissou.");
        } else {
            System.out.println("Não pode aterrissar agora.");
        }
    }

    public void desligar() {
        if (ligado && altitude == 0) {
            ligado = false;
            System.out.println("Helicóptero desligado.");
        } else {
            System.out.println("Não pode desligar com o helicóptero no ar.");
        }
    }

    public void exibir() {
        System.out.println(this.toString());
    }

    public boolean getEstaLigado() {
        return ligado;
    }

    public void setEstaLigado(boolean estaLigado) {
        this.ligado = estaLigado;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getCapacidadeDoHelicoptero() {
        return capacidadeDoHelicoptero;
    }

    public void setCapacidadeDoHelicoptero(int capacidadeDoHelicoptero) {
        this.capacidadeDoHelicoptero = capacidadeDoHelicoptero;
    }

    public int getQuantidadeDePessoasPresentes() {
        return quantidadeDePessoasPresentes;
    }

    public void setQuantidadeDePessoasPresentes(int quantidadeDePessoasPresentes) {
        this.quantidadeDePessoasPresentes = quantidadeDePessoasPresentes;
    }

    public String toString() {
        return "Helicóptero {" + "Ligado = " + ligado + ", Altitude = " + altitude + ", Capacidade = " + capacidadeDoHelicoptero + ", Pessoas = " + quantidadeDePessoasPresentes + "}";
    }
}