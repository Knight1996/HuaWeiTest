/**
 * @author : Knight
 * @program : 华为机试
 * @description : 字符串最后一个单词的长度
 * @date : 2020-12-30 17:11
 **/
//---------------------------------反序遍历----------------------------
import java.util.* ;

public class Main {

    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner in = new Scanner(System.in) ;
        String str = in.nextLine() ;
        int cnt = 0 ;
        char[] s = str.toCharArray() ;
        for(int i = s.length - 1 ; i >= 0 ; i--){
            if(s[i] == ' '){
                break ;
            }
            cnt++ ;
        }
        System.out.println(cnt);
    }
}
//-----------------------------------------------------------------------------
import java.util.*;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] s = str.split(" ");
        int len = s[s.length - 1].length();
        System.out.println(len) ;
    }
}
//------------------------------------分割字符串--------------------------------

