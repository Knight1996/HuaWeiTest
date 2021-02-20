/**
 * @author : Knight
 * @program : 华为机试
 * @description : 线性插值
 * @date : 2021-02-15 10:10
 **/
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            int m = scanner.nextInt() ;
            int n = scanner.nextInt() ;
            int[][] arr = new int[m][2] ;
            for(int i = 0 ; i < m ; i++){
                arr[i][0] = scanner.nextInt() ;
                arr[i][1] = scanner.nextInt() ;
            }
            int key = arr[0][0] ;
            int value = arr[0][1] ;
            System.out.println(key + " " + value) ;
            for(int i = 1 ; i < m ; i++){
                int temKey = arr[i][0] ;
                int temValue = arr[i][1] ;
                if(temKey - key != 0){
                    for(int j = key + 1 ; j < temKey ; j++){
                        System.out.println(j + " " +
                                (value + (temValue - value)/(temKey - key)*(j - key))) ;
                    }
                    System.out.println(temKey + " " + temValue) ;
                    key = temKey ;
                    value = temValue ;
                }
            }
        }
    }
}
