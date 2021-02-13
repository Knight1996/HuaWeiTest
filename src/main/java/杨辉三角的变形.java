/**
 * @author : Knight
 * @program : 华为机试
 * @description : 杨辉三角的变形
 * @date : 2021-02-10 19:53
 **/
//------------------------------分情况讨论-------------------------------
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if(num == 1 || num == 2){
                System.out.println(-1);
                continue;
            }
            else if(num % 4 == 1 || num % 4 == 3){
                System.out.println(2);
                continue;
            }
            else if(num % 4 == 0){
                System.out.println(3);
                continue;
            }
            else if(num % 4 == 2){
                System.out.println(4);
                continue;
            }
        }
        scanner.close() ;
    }
}
//----------------------------------------------------------------------
