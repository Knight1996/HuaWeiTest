/**
 * @author : Knight
 * @program : 华为机试
 * @description : 判断两个IP是否属于同一子网
 * @date : 2021-02-13 19:02
 **/
//-------------------------分情况讨论----------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            String s = scanner.nextLine() ;
            String s1 = scanner.nextLine() ;
            String s2 = scanner.nextLine() ;
            String[] arr = s.split("\\.") ;
            String[] arr1 = s1.split("\\.") ;
            String[] arr2 = s2.split("\\.") ;
            if(helper2(arr) == false ||
                    helper1(arr1) == false ||
                    helper1(arr2) == false){
                System.out.println(1) ;
                continue ;
            }
            String[] tem1 = judge(arr1 , arr) ;
            String[] tem2 = judge(arr2 , arr) ;
            boolean flag = true ;
            for(int i = 0 ; i < 4 ; i++){
                if(!tem1[i].equals(tem2[i])){
                    flag = false ;
                }
            }
            if(flag == true){
                System.out.println(0) ;
            }
            else{
                System.out.println(2) ;
            }
        }
        scanner.close() ;
    }

    public String[] judge(String[] arr1 , String[] arr2){
        String[] ans = new String[4] ;
        for(int  i = 0 ; i < 4 ; i++){
            int n1 = Integer.parseInt(arr1[i]) ;
            int n2 = Integer.parseInt(arr2[i]) ;
            ans[i] = String.valueOf(n1 & n2) ;
        }
        return ans ;
    }

    public boolean helper1(String[] arr){
        boolean f = true ;
        if(arr.length != 4){
            f = false ;
        }
        for(int  i = 0 ; i < arr.length ; i++){
            int n = Integer.parseInt(arr[i]) ;
            if( n < 0 || n > 255){
                f = false ;
            }
        }
        return f ;
    }

    public boolean helper2(String[] arr){
        boolean f = true ;
        if(arr.length != 4){
            f = false ;
        }
        for(int  i = 0 ; i < arr.length ; i++){
            int n = Integer.parseInt(arr[i]) ;
            if( n < 0 || n > 255){
                f = false ;
            }
        }
        for(int i = 1 ; i < 4 ; i++){
            int n2 = Integer.parseInt(arr[i]) ;
            int n1 = Integer.parseInt(arr[i - 1]) ;
            if( n1 < n2){
                f = false ;
            }
        }
        return f ;
    }
}
//------------------------------------------------------------