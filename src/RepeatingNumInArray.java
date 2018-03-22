public class RepeatingNumInArray {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        for (int i = 0; i < length; i++){
            if (numbers[i] != i){
                if (numbers[numbers[i]] == numbers[i]){
                    duplication[0] = numbers[i];
                    return true;
                }else
                    swap(numbers, numbers[i], numbers[numbers[i]]);
            }
        }
        return false;
    }
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {

    }
}
