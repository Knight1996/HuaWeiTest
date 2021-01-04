/**
 * @author : Knight
 * @program : 华为机试
 * @description : 查找组成一个偶数最接近的两个素数
 * @date : 2021-01-03 14:07
 **/
//-----------------------------循环判断--------------------------

import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextInt()){
            int n = scanner.nextInt() ;
            int i = n / 2 ;
            int j = n - i ;
            while(!isPrime(i) || !isPrime(j)){
                i-- ;
                j++ ;
            }
            System.out.println(i) ;
            System.out.println(j) ;
        }
        scanner.close() ;
    }

    public boolean isPrime(int n){
        for(int i = 2 ; i * i <= n ; i++){
            if(n % i == 0){
                return false ;
            }
        }
        return true ;
    }
}
//--------------------------------------------------------------------------------