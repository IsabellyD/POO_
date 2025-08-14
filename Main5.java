public class Main5 {
    public static void main(String[] args) {
        int[] A = {1, 2, 30, 14, 5, 46, 7, 81, 90, 10};
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] * i;
        }

        System.out.print("Vetor B: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}