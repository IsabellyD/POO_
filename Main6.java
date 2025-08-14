public class Main6 {
    public static void main(String[] args) {
        int[] A = {10, 2, 37, 14, 5, 67, 7, 84, 29, 10};
        int[] B = {1, 98, 8, 27, 65, 52, 40, 3, 12, 81};

        exibirVetor("Vetor A: ", A);
        exibirVetor("Vetor B: ", B);

        int[] C = somarVetores(A, B);
        exibirVetor("Vetor C (A[i] + B[i]): ", C);
    }

    public static int[] somarVetores(int[] A, int[] B) {
        int[] C = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
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
