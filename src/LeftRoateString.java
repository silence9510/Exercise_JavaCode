public class LeftRoateString {
    public String LeftRotateString(String str,int n) {
        if (str == null || str.length() == 0 || str.length() < n) return "";
        char[] strArr = str.toCharArray();
        reverse(strArr, 0, n-1);
        reverse(strArr, n, strArr.length - 1);
        reverse(strArr, 0, strArr.length - 1);
        return String.valueOf(strArr);
    }
    public void reverse(char[] arrStr, int s, int e){
        while (s < e) {
            char tmp = arrStr[s]; arrStr[s] = arrStr[e]; arrStr[e] = tmp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        System.out.println(new LeftRoateString().LeftRotateString("abcXYZdef", 3));
    }
}
