/**
 * @author : Knight
 * @program : 华为机试
 * @description : 字符逆序
 * @date : 2020-12-30 09:19
 **/
//---------------------------双指针-----------------------------
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Main solution = new Main();
    }

    public Main(){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String str = scanner.nextLine() ;
            char[] s = str.toCharArray() ;
            int left = 0 ;
            int right = s.length - 1 ;
            while(left < right){
                char tem = s[left] ;
                s[left] = s[right] ;
                s[right] = tem ;
                left++ ;
                right-- ;
            }
            System.out.println(new String(s));
        }
        scanner.close() ;
    }
}
//------------------------------------------------------------------

//-----------------------------reverse()------------------------------
import java.util.*;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextLine()){
            String str = scanner.nextLine() ;
            StringBuffer ans = new StringBuffer(str);
            //StringBuilder res = new StringBuilder(str);
            ans.reverse();
            System.out.println(ans);
            //System.out.println(new String(ans));
        }
        scanner.close() ;
    }
}
//------------------------------------------------------------------------

