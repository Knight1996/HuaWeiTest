/**
 * @author : Knight
 * @program : 华为机试
 * @description : 密码验证合格程序
 * @date : 2021-01-01 20:57
 **/
//--------------------------分情况判断--------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextLine()){
            String str = scanner.nextLine() ;
            String ans = new String("NG") ;
            if(judgeOfLength(str) && judgeOfContent(str) && judgeOfChar(str)){
                ans = "OK" ;
            }
            System.out.println(ans) ;
        }
    }

    public boolean judgeOfLength(String s){
        return s.length() > 8 ;
    }

    public boolean judgeOfContent(String s){
        boolean[] arr = new boolean[4] ;
        int ans = 0 ;
        for(char c : s.toCharArray()){
            if(Character.isLowerCase(c)){
                arr[0] = true ;
            }
            else if(Character.isUpperCase(c)){
                arr[1] = true ;
            }
            else if(Character.isDigit(c)){
                arr[2] = true ;
            }
            else if(!Character.isLetterOrDigit(c)){
                arr[3] = true ;
            }
        }
        for(boolean b : arr){
            if(b == true){
                ans++ ;
            }
        }
        return ans >= 3 ;
    }

    public boolean judgeOfChar(String s){
        for(int i = 0 ; i <= s.length() - 3 ; i++){
            String tem = s.substring(i , i + 3) ;
            if(s.substring(i + 1).contains(tem)){
                return false ;
            }
        }
        return true ;
    }
}
//----------------------------------------------------------------