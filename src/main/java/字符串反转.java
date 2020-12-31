/**
 * @author : Knight
 * @program : 华为机试
 * @description : 字符串反转
 * @date : 2020-12-31 09:38
 **/
//----------------------------双指针------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextLine()){
            String str = scanner.nextLine() ;
            char[] chars = str.toCharArray() ;
            int left = 0 ;
            int right = chars.length - 1 ;
            while(left < right){
                swap(chars , left , right) ;
                left++ ;
                right-- ;
            }
            System.out.println(new String(chars)) ;
        }
    }

    public void swap(char[]chars , int left , int right){
        char tem = chars[left] ;
        chars[left] = chars[right] ;
        chars[right] = tem ;
    }
}
//---------------------------------------------------------------

//----------------------------reverse()方法----------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextLine()){
            String str = scanner.nextLine() ;
            StringBuffer s = new StringBuffer(str) ;
            s.reverse() ;
            System.out.println(new String(s)) ;
            //System.out.println(s) ;
        }
    }
}
//---------------------------------------------------------------