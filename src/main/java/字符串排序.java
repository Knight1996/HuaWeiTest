/**
 * @author : Knight
 * @program : 华为机试
 * @description : 字符串排序
 * @date : 2021-01-03 15:47
 **/
//-------------------------调用sort()方法-------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            int n = scanner.nextInt() ;
            String[] arr = new String[n] ;
            for(int i = 0 ; i < n ; i++){
                arr[i] = scanner.next() ;
            }
            Arrays.sort(arr) ;
            for(String s : arr){
                System.out.println(s) ;
            }
        }
        scanner.close() ;
    }
}
//----------------------------------------------------------------