public class FrogJumpFloors {
    public static int jumpFloors1(int n) throws Exception {
        if(n < 1)   return 0;
        if(n == 1)  return 1;
        if(n == 2)  return 2;
        return jumpFloors1(n-1) + jumpFloors1(n-2);
    }

    public static int jumpFloors2(int n) throws Exception {
        if(n < 1) return 0;
        int[] arr = new int[101];
        arr[1] = 1; arr[2] = 2;
        for(int i = 3; i <= n; i++)
            arr[i] = arr[i-1] + arr[i-2];
        return arr[n];
    }
    //变态跳台阶
    public static int JumpFloorII(int target) {
        if (target < 1) return 0;
        return (int)Math.pow(2, (target-1));
    }
    //矩阵覆盖
    public int RectCover(int target) {
        if (target <= 0) return 0;
        if (target == 1) return 1;
        if (target == 2) return 2;
        return RectCover(target-1) + RectCover(target - 2);
    }


    public static void main(String[] args) throws Exception {
        System.out.println(JumpFloorII(10));
    }
}
