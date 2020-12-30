/**
 * @author : Knight
 * @program : 华为机试
 * @description : 字符逆序
 * @date : 2020-12-30 09:19
 **/
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Main solution = new Main();
    }

    public Main(){
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            String str = in.nextLine() ;
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
    }
}
