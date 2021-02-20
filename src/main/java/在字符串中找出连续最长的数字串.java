/**
 * @author : Knight
 * @program : 华为机试
 * @description : 在字符串中找出连续最长的数字串
 * @date : 2021-02-15 10:59
 **/
//------------------------按数字分割------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextLine()){
            String s = scanner.nextLine() ;
            String str = "" ;
            for(int i = 0 ; i < s.length() ; i++){
                if(Character.isDigit(s.charAt(i))){
                    str += s.charAt(i) ;
                }
                else{
                    str += 'k';
                }
            }
            String[] arr = str.split("k") ;
            int max = 0 ;
            for(int i = 0 ; i < arr.length ; i++){
                int len = arr[i].length() ;
                max = Math.max(len , max) ;
            }
            String ans = "" ;
            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i].length() == max){
                    ans += arr[i] ;
                }
            }
            System.out.print(ans) ;
            System.out.print(",") ;
            System.out.println(max) ;
        }
        scanner.close() ;
    }
}
//----------------------------------------------------------
