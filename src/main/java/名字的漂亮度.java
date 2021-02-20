/**
 * @author : Knight
 * @program : 华为机试
 * @description : 名字的漂亮度
 * @date : 2021-01-04 18:58
 **/
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            int n = Integer.parseInt(scanner.nextLine());
            for(int i = 0 ; i < n ; i++){
                String s = scanner.nextLine().toLowerCase() ;
                System.out.println(helper(s)) ;
            }
        }
        scanner.close() ;
    }

    public int helper(String s){
        int[] arr = new int[26] ;
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i) ;
            arr[c - 'a']++ ;
        }
        Arrays.sort(arr) ;
        int cnt = 0 ;
        for(int j = 26 , i = 25; i >= 0 ; i--){
            if(arr[i] != 0){
                cnt += j*arr[i] ;
                j-- ;
            }
        }
        return cnt ;
    }
}
