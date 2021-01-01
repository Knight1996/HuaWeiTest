/**
 * @author : Knight
 * @program : 华为机试
 * @description : 求int型正整数在内存中存储时1的个数
 * @date : 2021-01-01 14:12
 **/
//--------------------------------位运算------------------------------
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
            while(num != 0){
                if((num & 1) == 1){
                    ans++ ;
                }
                num >>= 1 ;
            }
            System.out.println(ans) ;
        }
        scanner.close();
    }
}
//---------------------------------------------------------------------

//-----------------------------toBinaryString方法-----------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextInt()){
            int num = scanner.nextInt() ;
            String str = Integer.toBinaryString(num) ;
            int ans = 0 ;
            for(char c : str.toCharArray()){
                if(c == '1'){
                    ans++ ;
                }
            }
            System.out.println(ans) ;
        }
        scanner.close();
    }
}
//----------------------------------------------------------------------