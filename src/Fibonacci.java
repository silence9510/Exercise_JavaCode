public class Fibonacci {
    private int[] fib = new int[40];

    public Fibonacci() {
        fib[0] = 1;
        fib[1] = 1;
        for(int i=2; i<fib.length; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
    }

    public int returnN(int n){
        return fib[n];
    }

    public static void main(String[] args) {
        System.out.println(new Fibonacci().returnN(10));
    }
}
