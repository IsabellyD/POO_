public class PrincipalTelevisor {
    public static void main(String[] args) {
        Televisor tvSala = new Televisor(5, 20, false);
        Televisor tvQuarto = new Televisor(10, 15, false);
        
        ControleRemoto controleSala = new ControleRemoto(tvSala);
        ControleRemoto controleQuarto = new ControleRemoto(tvQuarto);
        
        System.out.println("=== Operações com TV da Sala ===");
        controleSala.ligarTV();
        controleSala.aumentarVolume();
        controleSala.aumentarVolume();
        controleSala.trocarCanal(8);
        controleSala.mostrarStatus();
        
        System.out.println("\n=== Operações com TV do Quarto ===");
        controleQuarto.ligarTV();
        for (int i = 0; i < 3; i++) {
            controleQuarto.aumentarVolume();
        }
        controleQuarto.trocarCanal(15);
        controleQuarto.mostrarStatus();
        
        System.out.println("\n=== Desligando TVs ===");
        controleSala.desligarTV();
        controleQuarto.desligarTV();
        
        System.out.println("\n=== Status Final ===");
        controleSala.mostrarStatus();
        controleQuarto.mostrarStatus();
    }
}
