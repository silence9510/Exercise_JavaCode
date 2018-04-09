public class Multiply {
    public int[] multiply(int[] A) {
        int len = A.length;
        int[] B = new int[len], C = new int[len], D = new int[len];
        C[0] = A[0]; D[len - 1] = A[len - 1];
        for (int i = 1; i < len; i++)
            C[i] = C[i-1] * A[i];
        for (int i = len - 2; i >= 0; i--)
            D[i] = D[i+1] * A[i];
        B[0] = D[1]; B[len-1] = C[len-2];
        for (int i = 1; i < len - 1; i++)
            B[i] = C[i-1] * D[i+1];
        return B;
    }

    public static void main(String[] args) {

    }
}
