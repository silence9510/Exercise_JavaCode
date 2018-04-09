public class ReverseSentence {
    public String ReverseSentence(String str) {
        if (str == null || str.length() == 0) return "";
        str = " " + str;
        char[] arrStr = str.toCharArray();
        reverse(arrStr, 0, str.length() - 1);
        int i, j = 0, k = -1;
        while (j < arrStr.length) {
            if (arrStr[j] == ' ' || j == arrStr.length - 1){
                i = k + 1;
                reverse(arrStr, i, j-1);
                k = j;
            }
            j++;
        }
        return String.valueOf(arrStr).substring(0, arrStr.length - 1);
    }
    public void reverse(char[] arrStr, int s, int e){
        while (s < e) {
            char tmp = arrStr[s]; arrStr[s] = arrStr[e]; arrStr[e] = tmp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        System.out.println(new ReverseSentence().ReverseSentence("student"));
    }
}
