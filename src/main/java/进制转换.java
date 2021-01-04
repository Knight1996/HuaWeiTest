/**
 * @author : Knight
 * @program : 华为机试
 * @description : 进制转换
 * @date : 2021-01-04 15:44
 **/
//------------------------------分步骤计算-------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            String s = scanner.nextLine() ;
            char[] arr = s.toCharArray() ;
            int ans = 0 ;
            for(int i = 2 ; i < arr.length ; i++){
                ans += charHelper(arr[i]) * sixteenHelper(arr.length - 1 - i) ;
            }
            System.out.println(ans) ;
        }
        scanner.close() ;
    }

    public int charHelper(char c){
        if(c >= 'a'){
            return c - 'a' + 10 ;
        }
        else if(c >= 'A'){
            return c - 'A' + 10 ;
        }
        else{
            return c - '0' ;
        }
    }

    //输出16进制的数
    public int sixteenHelper(int n){
        int ans = 1 ;
        for(int i = 0 ; i < n ; i++){
            ans *= 16 ;
        }
        return ans ;
    }
}
//------------------------------------------------------------------