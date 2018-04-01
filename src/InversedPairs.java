public class InversedPairs {
    private long cnt = 0;
    private int[] temp;

    public int InversePairs(int [] array) {
        temp = new int[array.length];
        mergeSortUp2Down(array, 0, array.length - 1);
        return (int)(cnt % 1000000007);
    }

    private void mergeSortUp2Down(int[] array, int first, int last){
        if (last - first < 1) return;
        int mid = first + (last - first) / 2;
        mergeSortUp2Down(array, first, mid);
        mergeSortUp2Down(array, mid + 1, last);
        merge(array, first, mid, last);
    }

    private void merge(int[] nums, int first, int mid, int last){
        int i = first, j = mid + 1, k = first;
        while (i <= mid || j <= last){
            if (i > mid) temp[k] = nums[j++];
            else if (j > last) temp[k] = nums[i++];
            else if (nums[i] < nums[j]) temp[k] = nums[i++];
            else {
                temp[k] = nums[j++];
                this.cnt += mid - i + 1;
            }
            k++;
        }
        for (k = first; k <= last; k++)
            nums[k] = temp[k];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 0};
        System.out.println(new InversedPairs().InversePairs(arr));
    }
}
