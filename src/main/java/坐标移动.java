/**
 * @author : Knight
 * @program : 华为机试
 * @description : 坐标移动
 * @date : 2021-02-10 19:36
 **/
//----------------------------两个变量来讨论------------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            String s = scanner.nextLine() ;
            String[] arr = s.split(";") ;
            int x = 0 ;
            int y = 0 ;
            for(int i = 0 ; i < arr.length ; i++){
                String str = arr[i] ;
                char a = str.charAt(0) ;
                int b = Integer.parseInt(str.substring(1)) ;
                if(a == 'A'){
                    x -= b ;
                }
                else if(a == 'S'){
                    y -= b ;
                }
                else if(a == 'W'){
                    y += b ;
                }
                else{
                    x += b ;
                }
            }
            System.out.println(x + "," + y) ;
        }
        scanner.close() ;
    }
}
//-----------------------------------------------------------------------

