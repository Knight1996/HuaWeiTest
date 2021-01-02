/**
 * @author : Knight
 * @program : 华为机试
 * @description : 自守数
 * @date : 2021-01-02 19:02
 **/
//-----------------------------个位数为 0、1、5、6 才可能-----------------------------------
import java.util.*;

public class Main {
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            System.out.println(helper(num));
        }
        scanner.close();
    }

    public int helper(int n){
        int cnt = 0 ;
        for(int i = 0 ; i <= n ; i++){
            if((i % 10 == 0) || (i % 10 == 1) || (i % 10 == 5) || (i % 10 == 6)){
                long j = i * i ;
                String stri = String.valueOf(i) ;
                String strj = String.valueOf(j) ;
                if(strj.indexOf(stri) == strj.length() - stri.length()){
                    cnt++ ;
                }
            }
        }
        return cnt ;
    }
}
//------------------------------------------------------------------------------------