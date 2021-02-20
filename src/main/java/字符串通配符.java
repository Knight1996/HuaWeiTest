/**
 * @author : Knight
 * @program : 华为机试
 * @description : 字符串通配符
 * @date : 2021-02-14 16:41
 **/
//------------------------递归-------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            System.out.println(helper(s1 , s2 , 0 , 0)) ;
        }
        scanner.close() ;
    }

    public boolean helper(String s1 , String s2 , int p1 , int p2){
        if(p1 == s1.length() && p2 == s2.length()){
            return true ;
        }
        else if(p1 == s1.length() || p2 == s2.length()){
            return false ;
        }

        if(s1.charAt(p1) == '*'){
            return helper(s1 , s2 , p1 , p2 + 1) ||
                    helper(s1 , s2 , p1 + 1 , p2 + 1) ;
        }
        else if(s1.charAt(p1) == '?' || s1.charAt(p1) == s2.charAt(p2)){
            return helper(s1 , s2 , p1 + 1 , p2 + 1) ;
        }
        else{
            return false ;
        }
    }
}
//--------------------------------------------------------

//-------------------------正则表达式----------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            // ? 匹配一个字符  [0-9A-Za-z]{1}
            // * 匹配0个或以上的字符  [0-9A-Za-z]{0,}
            s1 = s1.replaceAll("\\?", "[0-9A-Za-z]{1}");
            s1 = s1.replaceAll("\\*", "[0-9A-Za-z]{0,}");
            s1 = s1.replaceAll("\\.", "\\\\.");
            boolean result = s2.matches(s1);
            System.out.println(result);
        }
        scanner.close() ;
    }
}
//-----------------------动态规划----------------------------

//--------------------------------------------------------

//--------------------------------------------------------