/*在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字是重复的。
也不知道每个数字重复几次。请找出数组中任意一个重复的数字。例如，如果输入长度为 7 的数组 {2, 3, 1, 0, 2, 5, 3}，
那么对应的输出是第一个重复的数字 2。*/

import java.util.Arrays;

public class 数组中重复数字 {

    public static void swap(int[] nums, int i, int j){
        int t;
        t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    public static boolean duplication(int[] nums, int length, int[] duplicatioin){
        if(nums == null || length <= 0){
            return false;
        }
        int i = -1;
        int j = 0;
        System.out.println(Arrays.toString(nums));
        while(i++ < length){
            if(nums[i]!=i && nums[i]!=nums[nums[i]]){
                swap(nums, i, nums[i]);
            }
            if(nums[i]!=i && nums[i]==nums[nums[i]]){
                duplicatioin[j++] = nums[i];
                return true;
            }
            System.out.println(Arrays.toString(nums));

        }
        return false;
    }
//    静态函数无法直接调用非静态方法
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        int[] duplicatioin = new int[10];

        if(duplication(nums, nums.length, duplicatioin)){
            System.out.println(Arrays.toString(duplicatioin));
        }
    }
}
