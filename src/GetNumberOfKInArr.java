public class GetNumberOfKInArr {
    public int GetNumberOfK(int [] array , int k) {
        int first = getFirstK(array, k);
        int last = getLastK(array, k);
        return first == -1 || last == -1 ? 0 : last - first + 1;
    }
    private int getFirstK(int[] nums, int K){
        int l = 0, h = nums.length - 1;
        while (l <= h){
            int m = l + (h - l) / 2;
            if (nums[m] >= K) h = m - 1;
            else l = m + 1;
        }
        if (l > nums.length - 1 || nums[l] != K) return -1;
        return l;
    }
    private int getLastK(int[] nums, int K){
        int l = 0, h = nums.length - 1;
        while (l <= h){
            int m = l + (h - l) / 2;
            if (nums[m] > K) h = m - 1;
            else l = m + 1;
        }
        if (h < 0 || nums[h] != K) return -1;
        return h;
    }
}