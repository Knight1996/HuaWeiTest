/**
 * @author : Knight
 * @program : 华为机试
 * @description : 整形数组合并
 * @date : 2021-01-03 10:48
 **/
//---------------------运用SortedSet：有序set--------------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            int len1 = scanner.nextInt() ;
            SortedSet<Integer> set = new TreeSet<>();
            for(int i = 0 ; i < len1 ; i++){
                set.add(scanner.nextInt()) ;
            }
            int len2 = scanner.nextInt() ;
            for(int i = 0 ; i < len2 ; i++){
                set.add(scanner.nextInt()) ;
            }
            for(Integer num : set){
                System.out.print(num) ;
            }
            System.out.println("") ;
        }
        scanner.close() ;
    }
}
//------------------------------------------------------------------------------