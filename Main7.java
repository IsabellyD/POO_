public class Main7 {
    public static void main(String[] args) {
        int[] A = {17, 2, 30, 54, 25, 68, 7, 80, 91, 10};
        int[] B = {70, 96, 84, 17, 6, 35, 4, 32, 12, 1};

        exibirVetor("Vetor A: ", A);
        exibirVetor("Vetor B: ", B);

        int[] C = subtrairVetores(A, B);
        exibirVetor("Vetor C (A[i] - B[i]): ", C);
    }

    public static int[] subtrairVetores(int[] A, int[] B) {
        int[] C = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] - B[i];
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
