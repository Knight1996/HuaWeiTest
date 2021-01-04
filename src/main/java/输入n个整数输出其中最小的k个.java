/**
 * @author : Knight
 * @program : 华为机试
 * @description : 输入n个整数，输出其中最小的k个
 * @date : 2021-01-03 13:59
 **/
//-----------------------------模拟遍历--------------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextInt()){
            int n = scanner.nextInt() ;
            int k = scanner.nextInt() ;
            int[] arr = new int[n] ;
            for(int i = 0 ; i < n ; i++){
                arr[i] = scanner.nextInt() ;
            }
            Arrays.sort(arr) ;
            for(int i = 0 ; i < k ; i++){
                System.out.print(arr[i] + " ") ;
            }
            System.out.println();
        }
        scanner.close() ;
    }
}
//-----------------------------------------------------------------
