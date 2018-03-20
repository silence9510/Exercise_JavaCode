import java.util.ArrayList;
import java.util.Arrays;

public class topKSmall {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if (k > input.length || input == null || k < 1) return new ArrayList<>();
        int kthSamllest = findKthSmallest(input, k-1);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int ele : input){
            if (ele <= kthSamllest && arr.size() < k)
                arr.add(ele);
        }
        return arr;
    }
    public int findKthSmallest(int[] arr, int k){
        int low = 0, high = arr.length-1;
        while (low < high){
            int i = partition(arr, low, high);
            if (i == k)
                break;
            else if (i < k)
                 low = i + 1;
            else
                high = i - 1;
        }
        return arr[k];
    }
    public int partition(int[] arr, int low, int high){
//       j = high + 1?
        int i = low, j = high;
        int privot = arr[low];
        while (i < j){
            while (i < j && arr[j] >= privot)
                j--;
            swap(arr, i, j);
            while (i < j && arr[i] <= privot){
                i++;
            swap(arr, i, j);
            }
        }
        return i;
    }
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 6, 2, 7, 3, 8};
        System.out.println(Arrays.toString(arr));
        new topKSmall().GetLeastNumbers_Solution(arr, 8);
    }
}
