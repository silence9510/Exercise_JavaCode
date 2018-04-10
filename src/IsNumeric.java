public class IsNumeric {

//    public boolean isNumeric(char[] str) {
//        String s = new String(str);
//        return s.matches("[+-]{0,1}\\d*(\\.\\d+){0,1}([eE][+-]{0,1}\\d+){0,1}");
//    }

//    判断字符数组是否为数字
    public boolean isNumeric(char[] str) {
        if (str == null || str.length == 0) return false;
        int index = 0;
        if (str[0] == '+' || str[0] == '-') index++;
        if (index == str.length) return false;
        index = scanDigits(str, index);
        if (index < str.length) {
            if (str[index] == '.') {
                index++;
                index = scanDigits(str, index);
                if (index < str.length) {
                    if (str[index] == 'e' || str[index] == 'E') {
                        index++;
                        return isExponential(str, index);
                    }
                    return false;
                }
                return true;
            } else if (str[index] == 'e' || str[index] == 'E') {
                index++;
                return isExponential(str, index);
            } else
                return false;
        }
        return true;
    }

//    扫描过滤数字
    public int scanDigits(char[] str, int index){
        while (index < str.length && '0' <= str[index] && str[index] <= '9' )
            index++;
        return index;
    }

//    e指数部分是否合法
    public boolean isExponential(char[] str, int index) {
        if (index < str.length){
            if (str[index] == '+' || str[index] == '-')
                index++;
            index = scanDigits(str, index);
            if (index == str.length) return true;
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        char[] num = {'1', '0', '0'};
        System.out.println(new IsNumeric().isNumeric(num));
    }
}
