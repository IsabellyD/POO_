public class Main8 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] B = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        exibirVetor("Vetor A: ", A);
        exibirVetor("Vetor B: ", B);

        int[] C = multiplicarVetores(A, B);
        exibirVetor("Vetor C (A[i] * B[i]): ", C);
    }

    public static int[] multiplicarVetores(int[] A, int[] B) {
        int[] C = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] * B[i];
        }
        return C;
    }

    public static void exibirVetor(String nome, int[] vetor) {
        System.out.print(nome);
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
