public class AddTwoNums {
//    模仿二进制加法操作
    public int Add(int num1,int num2) {
//        直到进位值为0，循环过程中，num1与num2的和一直不变
        while(num2 != 0){
//            计算每位的值不算进位
            int tmp = num1 ^ num2;
//            计算那几位能能产生进位，并求出进位的总和
            num2 = (num1 & num2) << 1;
            num1 = tmp;
        }
        return num1;
    }

    public static void main(String[] args) {
        System.out.println(new AddTwoNums().Add(5, 7));
    }
}
