public class ReOrderArray {
    public void reOrderArray(int [] array) {
        if (array == null || array.length == 0) return;
        int len = array.length, dLen = 0;
        for (int ele : array) if (ele % 2 == 0) dLen++;
        int[] newArr = array.clone();
        for (int k = 0, i = 0, j = len-dLen; k < len; k++){
            if (newArr[k] % 2 == 0)
                array[j++] = newArr[k];
            else
                array[i++] = newArr[k];
        }
    }

    public static void main(String[] args) {

    }
}
