import java.util.Arrays;
import java.util.List;

public class UglyNumber {
    public static boolean isUglyNum(int n){
        while (n % 2 == 0)
            n /= 2;
        while (n % 3 == 0)
            n /= 3;
        while (n % 5 == 0)
            n /= 5;
        return n == 1 ? true : false;
    }
    public static int[] getSomeUglyNum1(int num){
        int[] uglyArr = new int[num];
        for(int i = 0, j = 2; i < num; ){
            if(isUglyNum(j)){
                uglyArr[i] = j;
                i++;
            }
            j++;
        }
        return uglyArr;
    }
//  生成式：时间换空间
    public static int[] getSomeUglyNum2(int num){
        int[] uglyArr = new int[num];
        uglyArr[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        for(int i = 1; i < num; i++){
            int nextUgly = Math.min(Math.min(uglyArr[i2]*2, uglyArr[i3]*3), uglyArr[i5]*5);
            uglyArr[i] = nextUgly;
            if(nextUgly == uglyArr[i2]*2)
                i2++;
            if(nextUgly == uglyArr[i3]*3)
                i3++;
            if(nextUgly == uglyArr[i5]*5)
                i5++;
        }
        return uglyArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSomeUglyNum1(100)));
        System.out.println(Arrays.toString(getSomeUglyNum2(100)));
    }
}
