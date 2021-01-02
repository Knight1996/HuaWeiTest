/**
 * @author : Knight
 * @program : 华为机试
 * @description : 完全数计算
 * @date : 2021-01-02 15:38
 **/
//-------------------------循环--------------------------
import java.util.*;

public class Main {
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            int ans = 0 ;
            for(int i = 1 ; i <= num ; i++){
                if(perfect2(i)){
                    ans++ ;
                }
            }
            System.out.println(ans);
        }
        scanner.close();
    }

    // 普通版本：
    public boolean perfect1(int n){
        int sum = 0 ;
        for(int i = 1 ; i < n ; i++){
            if(n % i == 0){
                sum += i ;
            }
        }
        return sum == n ;
    }

    // 优化时间版本：
    public boolean perfect2(int n){
        int sum = 0 ;
        for(int i = 1 ; i * i < n ; i++){
            if(n % i == 0){
                sum += i ;
                if(i * i != n){
                    sum += n / i ;
                }
            }
        }
        return sum == 2 * n ;
    }
}
//------------------------------------------------------------