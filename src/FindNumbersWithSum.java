import java.util.ArrayList;

public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(final int [] array, int sum) {
        if (array == null || array.length == 0) return new ArrayList<>();
        int l = 0, h = array.length - 1;
        ArrayList<Integer> list = new ArrayList<>();
        while (l < h) {
            if (array[l] + array[h] == sum){
                list.add(array[l]); list.add(array[h]);
                break;
            }else if (array[l] + array[h] > sum)
                h--;
            else
                l++;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 7, 11, 15};
        System.out.println(new FindNumbersWithSum().FindNumbersWithSum(array, 15));
    }
}
