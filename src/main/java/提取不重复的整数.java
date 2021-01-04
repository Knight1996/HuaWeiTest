/**
 * @author : Knight
 * @program : 华为机试
 * @description : 提取不重复的整数
 * @date : 2021-01-04 14:57
 **/
// --------------------------String.valueOf()------------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            int n = scanner.nextInt() ;
            char[] arr = String.valueOf(n).toCharArray() ;
            String s = "" ;
            for(int i = arr.length - 1 ; i >= 0 ; i--){
                if(!s.contains(String.valueOf(arr[i]))){
                    s += arr[i] ;
                }
            }
            System.out.println(s) ;
        }
        scanner.close() ;
    }
}
// ------------------------------------------------------------------------