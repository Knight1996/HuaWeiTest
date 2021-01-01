/**
 * @author : Knight
 * @program : 华为机试
 * @description : 放苹果
 * @date : 2021-01-01 20:55
 **/
//----------------------------------递归-----------------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextInt()){
            int apple = scanner.nextInt() ;
            int dish = scanner.nextInt() ;
            System.out.println(helper(apple , dish)) ;
        }
        scanner.close() ;
    }

    public int helper(int apple , int dish){
        // 如果只有一个盘子，或者没有苹果，定义为1：
        if(apple == 0 || dish == 1){
            return 1;
        }
        // 如果apple < dish，则必有空，等于放在apple个盘子里：
        else if(apple < dish){
            return helper(apple , apple) ;
        }
        // 如果有空盘，则等于 helper(apple , dish - 1)
        // 如果没有空盘，则等于每个盘子拿走一个苹果： helper(apple , dish - apple)
        else{
            return helper(apple , dish - 1) + helper(apple - dish , dish) ;
        }
    }
}
//---------------------------------------------------------------------------------------