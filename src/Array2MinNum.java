import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Array2MinNum {
    public String PrintMinNumber(int [] numbers) {
        int n = numbers.length;
        String result = "";
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(numbers[i]);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer str1, Integer str2) {
                String sum1 = str1 + "" + str2;
                String sum2 = str2 + "" + str1;
                return sum1.compareTo(sum2);
            }
        });
        for (int num : list)
            result += num;
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4, 2};
        System.out.println(new Array2MinNum().PrintMinNumber(arr));
    }
}