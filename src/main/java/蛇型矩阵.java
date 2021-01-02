/**
 * @author : Knight
 * @program : 华为机试
 * @description : 蛇形矩阵
 * @date : 2021-01-01 22:15
 **/
//----------------------------数学推导----------------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextInt()){
            int num = scanner.nextInt() ;
            for(int i = 0 ; i < num ; i++){
                for(int j = i + 1 ; j <= num ; j++){
                    System.out.print((j * (j + 1) / 2 - i) + " ") ;
                }
                System.out.println("") ;
            }
        }
        scanner.close() ;
    }
}
//-------------------------------------------------------------------------

//-------------------------------数学推导-----------------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextInt()){
            int num = scanner.nextInt() ;
            int start = 0 ;
            for(int i = 0 ; i < num ; i++){
                int cur = start ;
                for(int j = 1 ; j <= num - i ; j++){
                    cur = cur + i + j ;
                    System.out.print(cur + " ") ;
                }
                start += i ;
                System.out.println() ;
            }
        }
        scanner.close() ;
    }
}
//---------------------------------------------------------------------------