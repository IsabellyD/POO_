public class Main4 {
    public static void main(String[] args) {
        int[] A = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169, 196, 225};
        double[] B = new double[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = Math.sqrt(A[i]);
        }

        System.out.print("Vetor B: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}