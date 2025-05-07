public class PrincipalCalendario {
    public static void main(String[] args) {

        Calendario data1 = new Calendario(27, 6, 2021);
        Calendario data2 = new Calendario(19, 12, 2024);

        System.out.print("\nData 1: ");
        data1.mostrarData();
        data1.anoBissexto();

        System.out.print("\nData 2: ");
        data2.mostrarData();
        data2.anoBissexto();
    }
}