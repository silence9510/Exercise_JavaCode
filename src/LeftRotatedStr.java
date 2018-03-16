public class LeftRotatedStr {
    public static String LeftRotateString(String str,int n) {
        if (str == null) return null;
        if (n > str.length()) n = str.length();
        char[] chars = str.toCharArray();
        int strLen = chars.length;
        reverse(chars, 0, n-1);
        reverse(chars, n, strLen-1);
        reverse(chars, 0, strLen-1);
//      char[] -> String : new String(chars), String.valueOf(char[] chars)
        return new String(chars);
    }
    public static void reverse(char[] chars, int start, int end){
        while (start <= end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        System.out.println(LeftRotateString("abcdefg", 2));
    }
}