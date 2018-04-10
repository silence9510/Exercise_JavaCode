import java.util.ArrayList;

public class FindContinuousSequence {

    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        int l = 1, r = 2;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        while (r < sum) {
            if ( (l + r) / 2.0 * (r - l + 1) == sum ){
                ArrayList<Integer> arr = new ArrayList<>();
                for (int i = l; i <= r; i++) arr.add(i);
                result.add(arr);
                r++;
            }
            if ( (l + r) / 2 * (r - l + 1) < sum )
                r++;
            if ( (l + r) / 2 * (r - l + 1) > sum )
                l++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new FindContinuousSequence().FindContinuousSequence(3));
    }
}
