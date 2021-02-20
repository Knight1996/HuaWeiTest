/**
 * @author : Knight
 * @program : 华为机试
 * @description : 挑七
 * @date : 2021-01-04 14:33
 **/
// ----------------------判断--------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            int n = scanner.nextInt() ;
            int ans = 0 ;
            for(int i = 1 ; i <= n ; i++){
                if(helper(i)){
                    ans++ ;
                }
            }
            System.out.println(ans) ;
        }
        scanner.close();
    }

    public boolean helper(int n){
        if(n % 7 == 0 || String.valueOf(n).contains("7")){
            return true ;
        }else{
            return false ;
        }
    }
}
//---------------------------------------------------------------