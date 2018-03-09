public class FirstOnceChar {

    public static Object searchChar(String s) throws Exception {
//      char由八位组成，共2^8种可能
        int[] cArray = new int[256];
        for(int i = 0; i < s.length(); i++){
            cArray[s.charAt(i)]++;
        }
        for(int i = 0; i < s.length(); i++){
            if(cArray[s.charAt(i)] == 1)
                return s.charAt(i);
        }
        return null;
    }

    public static void main(String[] args) throws Exception {
        String s = "aabb";
        System.out.println(searchChar(s));
    }
}
