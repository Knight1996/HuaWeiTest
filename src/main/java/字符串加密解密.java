/**
 * @author : Knight
 * @program : 华为机试
 * @description : 字符串加密解密
 * @date : 2021-01-03 16:29
 **/
//----------------------------分情况讨论----------------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            String s1 = scanner.next() ;
            String s2 = scanner.next() ;
            char[] arr1 = s1.toCharArray() ;
            char[] arr2 = s2.toCharArray() ;
            helper1(arr1) ;
            helper2(arr2) ;
            System.out.println(new String(arr1)) ;
            System.out.println(new String(arr2)) ;
        }
        scanner.close() ;
    }

    public void helper1(char[] arr1){
        for(int i= 0 ; i < arr1.length ; i++){
            if(arr1[i] >= 'a' && arr1[i] <= 'y'){
                arr1[i] = (char)(arr1[i] - 31) ;
            }
            else if(arr1[i] >= 'A' && arr1[i] <= 'Y'){
                arr1[i] = (char)(arr1[i] + 33) ;
            }
            else if(arr1[i] == 'Z'){
                arr1[i] = 'a' ;
            }
            else if(arr1[i] == 'z'){
                arr1[i] = 'A' ;
            }
            else if(arr1[i] >= '0' && arr1[i] <= '8'){
                arr1[i] = (char)(arr1[i] + 1) ;
            }
            else if(arr1[i] == '9'){
                arr1[i] = '0' ;
            }
        }
    }

    public void helper2(char[] arr2){
        for(int i= 0 ; i < arr2.length ; i++){
            if(arr2[i] >= 'b' && arr2[i] <= 'z'){
                arr2[i] = (char)(arr2[i] - 33) ;
            }
            else if(arr2[i] >= 'B' && arr2[i] <= 'Z'){
                arr2[i] = (char)(arr2[i] + 31) ;
            }
            else if(arr2[i] == 'A'){
                arr2[i] = 'z' ;
            }
            else if(arr2[i] == 'a'){
                arr2[i] = 'Z' ;
            }
            else if(arr2[i] >= '1' && arr2[i] <= '9'){
                arr2[i] = (char)(arr2[i] - 1) ;
            }
            else if(arr2[i] == '0'){
                arr2[i] = '9' ;
            }
        }
    }
}
//-------------------------------------------------------------------------------