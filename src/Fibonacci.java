public class Fibonacci {
    private int[] fib = new int[200];

    public Fibonacci() {
        fib[0] = 0;
        fib[1] = 1;
        for(int i=2; i<fib.length; i++)
            fib[i] = fib[i-1] + fib[i-2];
    }
	public int getFibonacci(int n) {
		int p = 0, q = 1;
		while (n-- > 0) {
			q += p;
			p = q - p;
		}
		return p;
	}

    public int returnN(int n){
        return fib[n];
    }

    public static void main(String[] args) {
        System.out.println(new Fibonacci().returnN(30));
    }
}
