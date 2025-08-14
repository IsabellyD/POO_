public class Main1 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }

        System.out.print("Vetor B: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
