/**
 * @author : Knight
 * @program : 华为机试
 * @description : 截取字符串
 * @date : 2021-01-04 19:28
 **/
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            String s = scanner.next() ;
            int n = scanner.nextInt() ;
            char[] arr = s.toCharArray() ;
            for(int i = 0 ; i < n ; i++){
                System.out.print(arr[i]) ;
            }
            System.out.println() ;
        }
        scanner.close() ;
    }
}
