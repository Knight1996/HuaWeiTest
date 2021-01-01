/**
 * @author : Knight
 * @program : 华为机试
 * @description : 查找输入整数二进制中 1 的个数
 * @date : 2021-01-01 19:15
 **/
//------------------------位运算------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextInt()){
            int num = scanner.nextInt() ;
            int cnt = 0 ;
            while(num != 0){
                if((num & 1) == 1){
                    cnt++ ;
                }
                num >>= 1 ;
            }
            System.out.println(cnt) ;
        }
        scanner.close() ;
    }
}
//---------------------------------------------------------