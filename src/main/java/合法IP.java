/**
 * @author : Knight
 * @program : 华为机试
 * @description : 合法IP
 * @date : 2021-02-10 10:15
 **/
//-------------------------------分情况讨论-------------------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            String s = scanner.next() ;
            String[] arr = s.split("\\.") ;
            boolean flag = true ;
            if(arr.length != 4){
                flag = false ;
            }
            for(int i = 0 ; i < arr.length ; i++){
                if(!helper(arr[i])){
                    flag = false ;
                }
            }
            if(flag){
                System.out.println("YES") ;
            }
            else{
                System.out.println("NO") ;
            }
        }
        scanner.close() ;
    }

    public boolean helper(String s){
        boolean f = true ;
        char[] arr = s.toCharArray() ;
        if(s.length() == 0){
            f = false ;
        }
        for(char c : arr){
            if(!Character.isDigit(c)){
                f = false ;
            }
        }
        int n = Integer.parseInt(s) ;
        if(n < 0 || n > 256){
            f = false ;
        }
        return f ;
    }
}
//---------------------------------------------------------------