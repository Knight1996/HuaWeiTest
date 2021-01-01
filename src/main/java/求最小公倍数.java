/**
 * @author : Knight
 * @program : 华为机试
 * @description : 求最小公倍数
 * @date : 2021-01-01 14:36
 **/
//-----------------------先辗转相除法求最大公约数------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextInt()){
            int num1 = scanner.nextInt() ;
            int num2 = scanner.nextInt() ;
            int ans = (num1 * num2) / gcd(num1 , num2) ;
            System.out.println(ans) ;
        }
        scanner.close();
    }

    public int gcd(int num1 , int num2){
        if(num2 == 0){
            return num1 ;
        }
        return gcd(num2 , num1 % num2) ;
    }
}
//----------------------------------------------------------------------