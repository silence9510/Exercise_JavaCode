public class GreatestSumOfArray {
//  贪心
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 1 && array[0] <= 0) return 0;
        int cur = array[0], sum = array[0];
        for (int i = 1; i < array.length; i++){
            if (cur < 0) cur = 0;
            cur += array[i];
            if (sum <= cur) sum = cur;
        }
        return sum;
    }
//  dp
    public int FindGreatestSumOfSubArray1(int[] array){
        int sum = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            sum = sum+array[i] > array[i] ? sum + array[i] : array[i];
            if (sum > max)
                max = sum;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2, 8, 1, 5, 9};
        System.out.println(new GreatestSumOfArray().FindGreatestSumOfSubArray(arr));
        System.out.println(new GreatestSumOfArray().FindGreatestSumOfSubArray1(arr));
    }
}
