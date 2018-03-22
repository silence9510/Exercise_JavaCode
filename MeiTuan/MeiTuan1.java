import java.util.Scanner;

public class MeiTuan1
{
    public int solution(String s, String t){
        int lenS = s.length(), lenT = t.length();
        if (lenS < lenT) return 0;
        char[] cs = s.toCharArray(), ct = t.toCharArray();
        int result = 0;
        for (int i = 0; i < lenS - lenT + 1; i++)
            result += diffOfString(cs, ct, i);
        return result;
    }

    public int diffOfString(char[] c1, char[] c2, int index){
        int result = 0;
        for (int i = 0; i < c2.length; i++){
            if (c1[index+i] != c2[i])
                result++;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(new MeiTuan1().solution(s, t));
    }
}
