import java.util.ArrayList;
import java.util.Collections;

public class StringArrange {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<String>();
        if (str == null || str.length() == 0) return list;
        char[] strArr = str.toCharArray();
        premu(list, strArr, 0, strArr.length);
        Collections.sort(list);
        return list;
    }
    public void premu(ArrayList<String> list, char[] strArr, int start, int len){
        if (start == len - 1){
            String s = String.valueOf(strArr);
            if (list.indexOf(s) == -1) list.add(s);
        }
        for (int i = start; i < len; i++){
            swap(strArr, start, i);
            premu(list, strArr, start + 1, len);
            swap(strArr, start, i);
        }
    }
    public void swap(char[] strArr, int i, int j){
        char temp = strArr[i];
        strArr[i] = strArr[j];
        strArr[j] = temp;
    }
    public static void main(String[] args) {
        String str = "abc";
        for (String s : new StringArrange().Permutation(str))
            System.out.print(s + " ");
    }
}
