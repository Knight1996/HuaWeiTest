/**
 * @author : Knight
 * @program : 华为机试
 * @description : 图片整理
 * @date : 2021-01-03 16:26
 **/
//---------------------------sort()方法----------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            String s = scanner.next() ;
            char[] arr = s.toCharArray() ;
            Arrays.sort(arr) ;
            System.out.println(new String(arr)) ;
        }
        scanner.close() ;
    }
}
//--------------------------------------------------------------------