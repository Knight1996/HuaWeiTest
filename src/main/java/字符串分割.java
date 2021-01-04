/**
 * @author : Knight
 * @program : 华为机试
 * @description : 字符串分割
 * @date : 2021-01-03 14:55
 **/
//---------------------------模拟循环------------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            String s = scanner.next() ;
            StringBuffer ans = new StringBuffer() ;
            ans.append(s) ;
            int cntZero = 8 - ans.length() % 8 ;
            while(cntZero > 0 && cntZero < 8){
                ans.append("0") ;
                cntZero-- ;
            }
            String str = new String(ans) ;
            while(str.length() > 0){
                System.out.println(str.substring(0 , 8)) ;
                str = str.substring(8) ;
            }
        }
        scanner.close() ;
    }
}
//--------------------------------------------------------------------