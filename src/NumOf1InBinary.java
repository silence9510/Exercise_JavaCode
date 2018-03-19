public class NumOf1InBinary {

    public static int NumberOf1_1(int n) {
        int count = 0;
        int flag = 1;
        while (flag != 0){
            if((n & flag) != 0)
                count++;
            flag = flag << 1;
        }
        return count;
    }
    public static int NumberOf1_2(int n){
        int count = 0;
        while (n != 0){
            count++;
            n &= (n - 1);
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(Integer.bitCount(1000));
        System.out.println(NumberOf1_1(1000));
    }
}
