public class RotateArraysMinNum {

    public static Object getMin(int[] array){
        int len = array.length;
        if(len == 0)
            return 0;
        int i = 0; int j = len-1;
        while(array[i] >= array[j]){
            if(j - i == 1)
                return array[j];
            int k = (i + j) / 2;
            if(array[k] >= array[i])
                i = k;
            else if(array[k] <= array[j])
                j = k;
        }
        return array[j];
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        System.out.println(getMin(arr));
    }
}
