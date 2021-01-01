/**
 * @author : Knight
 * @program : 华为机试
 * @description : 等差数列
 * @date : 2021-01-01 17:15
 **/
//----------------------数学公式--------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextInt()){
            int n = scanner.nextInt() ;
            int ans = ((3*n + 1) * n) / 2 ;
            System.out.println(ans) ;
        }
        scanner.close();
    }
}
//---------------------------------------------------------
