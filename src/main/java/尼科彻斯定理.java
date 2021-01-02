/**
 * @author : Knight
 * @program : 华为机试
 * @description : 尼科彻斯定理
 * @date : 2021-01-02 11:23
 **/
//--------------------------找规律---------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextInt()){
            int num = scanner.nextInt() ;
            int start = num * num - num + 1 ; //首
            int end = num * num + num - 1 ;   //尾
            for(int i = start ; i < end ; i += 2){
                System.out.print(i + "+") ;
            }
            System.out.println(end) ;
        }
        scanner.close() ;
    }
}
//------------------------------------------------------------