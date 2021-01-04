/**
 * @author : Knight
 * @program : 华为机试
 * @description : DNA序列
 * @date : 2021-01-04 09:30
 **/
//------------------------最长子序列--------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            String s = scanner.nextLine() ;
            int n = scanner.nextInt() ;
            System.out.println(helper(s , n)) ;
        }
    }

    public String helper(String s , int n){
        int gc = 0 ;
        String ans = "" ;
        for(int i = 0 ; i <= s.length() - n ; i++){
            int gcCnt = GCRatio(s.substring(i , n + i).toCharArray()) ;
            if(gcCnt > gc){
                gc = gcCnt ;
                ans = s.substring(i , n + i) ;
            }
        }
        return ans ;
    }

    public int GCRatio(char[] arr){
        int cnt = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 'G' || arr[i] == 'C'){
                cnt++ ;
            }
        }
        return cnt ;
    }
}
//----------------------------------------------------------------