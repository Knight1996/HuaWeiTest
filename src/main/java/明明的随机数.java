/**
 * @author : Knight
 * @program : 华为机试
 * @description : 明明的随机数
 * @date : 2021-01-03 19:24
 **/
//--------------------------SortedSet------------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextInt()){
            int n = scanner.nextInt() ;
            SortedSet<Integer> set = new TreeSet<>() ;
            for(int i = 0 ; i < n ; i++){
                set.add(scanner.nextInt()) ;
            }
            for(int num : set){
                System.out.println(num) ;
            }
        }
        scanner.close() ;
    }
}
//----------------------------------------------------------------

//----------------------------数组---------------------------------

import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextInt()){
            int n = scanner.nextInt() ;
            int[] arr = new int[n] ;
            for(int i = 0 ; i < n ; i++){
                arr[i] = scanner.nextInt() ;
            }
            Arrays.sort(arr) ;
            for(int i = 0 ; i < n ; i++){
                if(i == 0 || arr[i] != arr[i - 1]){
                    System.out.println(arr[i]) ;
                }
            }
        }
        scanner.close() ;
    }
}
//-----------------------------------------------------------------