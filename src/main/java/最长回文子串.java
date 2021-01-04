/**
 * @author : Knight
 * @program : 华为机试
 * @description : 最长回文子串
 * @date : 2021-01-01 21:10
 **/
//---------------------------动态规划---------------------------------
import java.util.* ;

public class Main {
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            String str = scanner.nextLine() ;
            System.out.println(longestPalindrome(str).length());
        }
        scanner.close();
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        String ans = "";
        for (int l = 0; l < n; ++l) {
            for (int i = 0; i + l < n; ++i) {
                int j = i + l;
                if (l == 0) {
                    dp[i][j] = true;
                } else if (l == 1) {
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                } else {
                    dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]);
                }
                if (dp[i][j] && l + 1 > ans.length()) {
                    ans = s.substring(i, j + 1);
                }
            }
        }
        return ans;
    }
}
//----------------------------------------------------------------------------

//------------------------------调用reverse()----------------------------------
//仅限输入为部分中心对称：
import java.util.* ;

public class Main {
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            String str = scanner.nextLine() ;
            StringBuffer s1 = new StringBuffer(str) ;
            s1.reverse() ;
            int count = 0;
            int tempCount = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != s1.charAt(i)) {
                    tempCount = 0;
                } else {
                    tempCount = tempCount + 1;
                    count = Math.max(count, tempCount);
                }
            }
            System.out.println(count);
        }
        scanner.close();
    }
}
//---------------------------------------------------------------------