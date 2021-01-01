/**
 * @author : Knight
 * @program : 华为机试
 * @description : 百钱买百鸡问题
 * @date : 2021-01-01 21:24
 **/
//-------------------------------多层循环------------------------------------
import java.util.* ;

public class Main {

    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextInt()){
            int num = scanner.nextInt() ;
            for(int i = 0 ; i <= 20 ; i++){
                for(int j = 0 ; j <= 33 ; j++){
                    int k = 100 - i - j ;
                    if((k % 3 == 0) &&(i * 5 + j * 3 + k / 3 == 100)){
                        System.out.printf("%d %d %d" ,i,j,k);
                        System.out.println();
                        //System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
        scanner.close() ;
    }
}
//------------------------------------------------------------------------