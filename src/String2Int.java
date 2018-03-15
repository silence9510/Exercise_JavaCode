public class String2Int {

    public static int StrToInt(String str) {
        if (str.length() == 0) return 0;
        char[] chars = str.toCharArray();
        boolean isNegative = chars[0] == '-';
        int ret = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 && (chars[i] == '+' || chars[i] == '-')) continue;
            if (chars[i] < '0' || chars[i] > '9') return 0;
            ret = ret * 10 + (chars[i] - '0');
        }
        return isNegative ? -ret : ret;
    }

    public static void main(String[] args) {
        System.out.println(StrToInt("1"));
        System.out.println(StrToInt("+1+"));
        System.out.println(StrToInt("+"));
        System.out.println(StrToInt("+1123"));
        System.out.println(StrToInt("-2231"));
        System.out.println(StrToInt(""));
    }
}
