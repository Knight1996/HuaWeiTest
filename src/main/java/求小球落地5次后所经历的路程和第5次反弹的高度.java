/**
 * @author : Knight
 * @program : 华为机试
 * @description : 求小球落地5次后所经历的路程和第5次反弹的高度
 * @date : 2021-01-04 18:37
 **/
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextInt()){
            int n = scanner.nextInt() ;
            double high = 0 ;
            double tem = n ;
            for(int i = 0 ; i < 5 ; i++){
                high += tem * 2;
                tem /= 2 ;
            }
            high -= n ;
            System.out.printf("%.6f\n",high) ;
            System.out.printf("%.6f\n",tem) ;
        }
        scanner.close() ;
    }
}
