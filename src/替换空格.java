public class 替换空格 {

//    charAt(), append(), setCharAt()
    public static String replaceSpace(StringBuffer str){
        int n = str.length();
        for(int i=0; i<n; i++){
            if(str.charAt(i) == ' '){
                str.append("  ");
            }
        }
        int idxOfOriginal = n - 1;
        int idxOfNew = str.length() - 1;
        while(idxOfNew > idxOfOriginal && idxOfOriginal >= 0){
            if(str.charAt(idxOfOriginal) == ' '){
                str.setCharAt(idxOfNew--, '0');
                str.setCharAt(idxOfNew--, '2');
                str.setCharAt(idxOfNew--, '%');
            }else{
                str.setCharAt(idxOfNew--, str.charAt(idxOfOriginal));
            }
            idxOfOriginal--;
        }
        return str.toString();
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer(" helloworld");
        System.out.println(replaceSpace(str));
    }

}