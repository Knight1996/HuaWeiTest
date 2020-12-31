/**
 * @author : Knight
 * @program : 华为机试
 * @description : 取近似值
 * @date : 2020-12-30 17:27
 **/
//-----------------------------利用强制类型转换------------------------------------
// java的强制类型转换：double 转 int：是将小数点后直接截断：

import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextDouble()){
            double num = scanner.nextDouble() ;
            System.out.println((int)(num + 0.5)) ;
        }
        scanner.close() ;
    }
}
//---------------------------------------------------------------------------------