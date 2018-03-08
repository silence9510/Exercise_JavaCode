public class FrogJumpFloors {
    public static int jumpFloors1(int n) throws Exception {
        if(n < 1)   throw new Exception("Invalid input");
        if(n == 1)  return 1;
        if(n == 2)  return 1;
        return jumpFloors1(n-1) + jumpFloors1(n-2);
    }

    public static int jumpFloors2(int n) throws Exception {
        if(n < 1)   throw new Exception("Invalid input");
        int[] arr = new int[101];
        arr[1] = 1; arr[2] = 1;
        for(int i = 3; i <= n; i++)
            arr[i] = arr[i-1] + arr[i-2];

        return arr[n];
    }

    public static void main(String[] args) throws Exception {
        System.out.println(jumpFloors1(10));
        System.out.println(jumpFloors2(10));
    }
}
