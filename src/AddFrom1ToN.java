public class AddFrom1ToN {
    public int Sum_Solution(int n) {
        return n * (1 + n) / 2;
    }
    public int Sum_Solution1(int n) {
        int sum = 0;
        boolean b = (n > 0) && ((sum += Sum_Solution1(n-1)) > 0);
        return sum;
    }
    public static void main(String[] args) {

    }
}
