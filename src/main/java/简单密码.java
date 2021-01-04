/**
 * @author : Knight
 * @program : 华为机试
 * @description : 简单密码
 * @date : 2021-01-03 14:18
 **/
//---------------------------------分情况讨论-----------------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextLine()){
            String s = scanner.nextLine() ;
            StringBuffer ans = new StringBuffer() ;
            for(char c : s.toCharArray()){
                if(c == 'a' || c == 'b' || c == 'c'){
                    ans.append("2") ;
                }
                else if(c == 'd' || c == 'e' || c == 'f'){
                    ans.append("3") ;
                }
                else if(c == 'g' || c == 'h' || c == 'i'){
                    ans.append("4") ;
                }
                else if(c == 'j' || c == 'k' || c == 'l'){
                    ans.append("5") ;
                }
                else if(c == 'm' || c == 'n' || c == 'o'){
                    ans.append("6") ;
                }
                else if(c == 'p' || c == 'q' || c == 'r' || c == 's'){
                    ans.append("7") ;
                }
                else if(c == 't' || c == 'u' || c == 'v'){
                    ans.append("8") ;
                }
                else if(c == 'w' || c == 'x' || c == 'y' || c == 'z'){
                    ans.append("9") ;
                }
                else if(Character.isUpperCase(c) && c != 'Z'){
                    ans.append((char)(c + 33)) ;
                }
                else if(c == 'Z'){
                    ans.append("a") ;
                }
                else{
                    ans.append(c) ;
                }
            }
            System.out.println(ans) ;
        }
        scanner.close() ;
    }
}
//-----------------------------------------------------------------------

//--------------------------------优化-----------------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextLine()){
            String s = scanner.nextLine() ;
            char[] arr = s.toCharArray() ;
            String s1 = "abcdefghijklmnopqrstuvwxyz" ;
            String s2 = "22233344455566677778889999" ;
            for(int i = 0 ; i < arr.length ; i++){
                if(Character.isDigit(arr[i])){
                    continue ;
                }
                else if(Character.isUpperCase(arr[i])){
                    if(arr[i] == 'Z'){
                        arr[i] = 'a' ;
                    }
                    else{
                        arr[i] = (char)(arr[i] + 33) ;
                    }
                }
                else{
                    arr[i] = s2.charAt(s1.indexOf(arr[i])) ;
                }
            }
            System.out.println(new String(arr)) ;
        }
        scanner.close() ;
    }
}
//-----------------------------------------------------------------------