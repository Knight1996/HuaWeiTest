/**
 * @author : Knight
 * @program : 华为机试
 * @description : 将真分数分解为埃及分数
 * @date : 2021-02-13 11:05
 **/
//--------------------------分情况讨论----------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            String s = scanner.nextLine() ;
            String[] arr = s.split("/") ;
            int a = Integer.parseInt(arr[0]) ;
            int b = Integer.parseInt(arr[1]) ;
            String res = "" ;
            String pre = "" ;
            while(true){
                int c = b/a + 1 ;
                res += "1/" ;
                res += c ;
                a = a - b % a ;
                b = b * c ;
                res += "+" ;
                if(a == 1){
                    res += "1/" ;
                    res += b ;
                    break ;
                }
                else if(a > 1 && b % a == 0){
                    res += "1/" ;
                    res += b/a ;
                    break ;
                }
            }
            System.out.println(res) ;
        }
        scanner.close() ;
    }
}
//-------------------------------------------------------------------------