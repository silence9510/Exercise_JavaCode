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

    public void reOrderArray1(int[] array) {
        if (array == null || array.length == 0) return;
        int i = 0, j;
        while (i < array.length) {
            while (i < array.length && !isEvenNum(array[i]))
                i++;
            j = i + 1;
            while (j < array.length && isEvenNum(array[j]))
                j++;
            if (j < array.length) {
                int tmp = array[j];
                for (int j2 = j; j2 > i; j2--)
                    array[j2] = array[j2-1];
                array[i++] = tmp;
            } else
                break;
        }
    }
    public boolean isEvenNum(int num) {
        return num % 2 == 0 ? true : false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println("aa");
        new ReOrderArray().reOrderArray1(arr);
    }
}
