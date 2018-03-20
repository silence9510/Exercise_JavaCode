public class MoreThanHalfNum {
    public static int MoreThanHalfNum_Solution(int [] array) {
        int len = array.length;
        int result = 0, time = 0;
        for (int i=0; i<len; i++){
            if (time == 0){
                result = array[i];
                time = 1;
            }else if (array[i] == result)
                time++;
            else
                time--;
        }
        time = 0;
        for (int i=0; i<len; i++){
            if (array[i] == result)
                time++;
        }
        return time > len/2 ? result : 0;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum_Solution(array));
    }
}
