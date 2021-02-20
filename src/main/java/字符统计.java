/**
 * @author : Knight
 * @program : 华为机试
 * @description : 字符统计
 * @date : 2021-02-14 19:45
 **/
//--------------------------数组统计-------------------------------
import java.util.*;

public class Main{

    public static void main(String[] args) {
        Main solution = new Main();
    }

    public Main(){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String str = scanner.nextLine() ;
            char[] chars = str.toCharArray() ;
            int[] arr = new int[128] ;
            for(int i = 0 ; i < chars.length ; i++){
                arr[chars[i]]++ ;
            }
            int max = 0 ;
            for(int i = 0 ; i < arr.length ; i++){
                if(max < arr[i]){
                    max = arr[i] ;
                }
            }
            StringBuffer ans = new StringBuffer() ;
            while(max != 0){
                for (int i = 0; i < arr.length; i++){
                    if (arr[i] == max)
                        ans.append((char) i);
                }
                max-- ;
            }
            System.out.println(ans.toString());
        }
        scanner.close() ;
    }
}
//--------------------------------------------------------------