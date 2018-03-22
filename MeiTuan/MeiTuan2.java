import java.util.Scanner;

public class MeiTuan2 {
    public int solution(String input){
        if (input == null || input.length() == 0 || input.length() > 1000) return 0;
        char[] numsStr = input.toCharArray();
        int[] labels = new int[10];
        for (int i = 0; i < numsStr.length; i++)
            labels[numsStr[i] - '0'] += 1;
        final int[] clone = labels.clone();
        for (int i = 1; ;i++){
            labels = clone.clone();
            int num = i;
            while (num != 0){
                labels[num % 10]--;
                num /= 10;
            }
            if (hasNegtiveOne(labels)) return i;
        }
    }
    public boolean hasNegtiveOne(int[] arr){
        for (int i = 0; i < 10; i++){
            if (arr[i] < 0) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(new MeiTuan2().solution(input));
    }
}
