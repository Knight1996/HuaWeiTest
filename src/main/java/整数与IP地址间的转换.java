/**
 * @author : Knight
 * @program : 华为机试
 * @description : 整数与IP地址间的转换
 * @date : 2021-02-14 16:42
 **/
//--------------------------分情况讨论-------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            String s = scanner.nextLine() ;
            System.out.println(helper(s)) ;
        }
        scanner.close() ;
    }

    public String helper(String s){
        // IPV4  ----> 十进制
        if(s.contains(".")){
            String[] arr = s.split("\\.") ;
            long ans = 0 ;
            for(int i = 0 ; i < 4 ; i++){
                ans = ans * 256 + Integer.parseInt(arr[i]) ;
            }
            return String.valueOf(ans) ;
        }
        // 十进制  ----> IPV4
        else{
            long n = Long.parseLong(s) ;
            String ans = "" ;
            for(int i = 0 ; i < 4 ; i++){
                long tem = n % 256 ;
                ans = tem + "." + ans ;
                n /= 256 ;
            }
            return ans.substring(0 , ans.length() - 1) ;
        }
    }
}
//--------------------------------------------------------------