/**
 * @author : Knight
 * @program : 华为机试
 * @description : 数字颠倒
 * @date : 2021-01-01 15:52
 **/
//------------------------------逆序遍历---------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextInt()){
            int num = scanner.nextInt() ;
            String str = Integer.toString(num) ;
            int left = 0 ;
            int right = str.length() - 1;
            for(int i = str.length() - 1 ; i >= 0 ; i--){
                System.out.print(str.charAt(i)) ;
            }
        scanner.close();
        }
    }
}
//---------------------------------------------------------------

//--------------------------反转:reverse（）----------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextInt()){
            int num = scanner.nextInt() ;
            String str = Integer.toString(num) ;
            StringBuffer s = new StringBuffer(str) ;
            s.reverse() ;
            System.out.print(s) ;
        }
        scanner.close();
    }
}
//---------------------------------------------------------------

//--------------------------反转:手写swap函数----------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextInt()){
            int num = scanner.nextInt() ;
            String str = Integer.toString(num) ;
            char[] arr = str.toCharArray() ;
            int i = 0 ;
            int j = str.length() - 1 ;
            while(i < j){
                swap(arr , i , j) ;
                i++ ;
                j-- ;
            }
            System.out.print(new String(arr)) ;
        }
        scanner.close();
    }
    public void swap(char[] arr , int i , int j){
        char tem = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = tem ;
    }
}
//---------------------------------------------------------------