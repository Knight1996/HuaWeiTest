/**
 * @author : Knight
 * @program : 华为机试
 * @description : 汽水瓶
 * @date : 2021-01-01 15:24
 **/
//-------------------------数学方法-----------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextInt()){
            int num = scanner.nextInt() ;
            if(num != 0){
                System.out.println(num / 2) ;
            }
            // 处理输入为0的结尾：
            else{
                break ;
            }
        }
        scanner.close() ;
    }
}
//------------------------------------------------------------

//----------------------------模拟-----------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextInt()){
            int num = scanner.nextInt() ;
            int ans = 0 ;
            if(num != 0){
                while(num >= 2){
                    num -= 2;
                    ans++ ;
                }
                System.out.println(ans) ;
            }
            else{
                break ;
            }
        }
        scanner.close() ;
    }
}
//-------------------------------------------------------------