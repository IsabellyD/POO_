public class Main3 {
    public static void main(String[] args) {
        int[] A = {11, 42, 39, 62, 15, 27, 7, 18, 39, 10, 21, 12, 53, 54, 15};
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] * A[i];
        }

        System.out.print("Vetor B: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}

