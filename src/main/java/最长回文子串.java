/**
 * @author : Knight
 * @program : 华为机试
 * @description : 最长回文子串
 * @date : 2021-01-01 21:10
 **/
//------------------------------调用reverse()---------------------------------
import java.util.* ;

public class Main {
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            String str = scanner.nextLine() ;
            StringBuffer s1 = new StringBuffer(str) ;
            s1.reverse() ;
            int count = 0;
            int tempCount = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != s1.charAt(i)) {
                    tempCount = 0;
                } else {
                    tempCount = tempCount + 1;
                    count = Math.max(count, tempCount);
                }
            }
            System.out.println(count);
        }
        scanner.close();
    }
}
//---------------------------------------------------------------------