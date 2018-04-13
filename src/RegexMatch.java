// Created by ZCL on 2018-04-13.
// https://blog.csdn.net/hll174/article/details/51001253

public class RegexMatch {

    public boolean match(char[] str, char[] pattern)
    {
        if(str==null||pattern==null) return false;
        return matchCore(str,0,pattern,0);
    }

    public boolean matchCore(char[] str,int s, char[] pattern,int p) {
        if(str.length <= s && pattern.length <= p) return true;
        if(str.length > s && pattern.length <= p) return false;
        if(p + 1 < pattern.length && pattern[p+1] == '*'){
            if(s >= str.length) return matchCore(str, s, pattern, p+2);
            else{
                if(pattern[p] == str[s] || pattern[p] == '.')
                    return matchCore(str,s+1, pattern,p+2)  ||matchCore(str,s+1, pattern,p)  || matchCore(str,s, pattern,p+2);
                else
                    return matchCore(str, s, pattern, p+2);
            }
        }
        if(s >= str.length) return false;
        else{
            if(str[s] == pattern[p] || pattern[p] == '.')
                return matchCore(str, s+1, pattern, p+1);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new RegexMatch().match("aaa".toCharArray(), "a.a".toCharArray()));
    }
}
