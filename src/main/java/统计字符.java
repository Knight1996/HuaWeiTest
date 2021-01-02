/**
 * @author : Knight
 * @program : 华为机试
 * @description : 统计字符
 * @date : 2021-01-02 16:13
 **/
//---------------------------分情况讨论---------------------------------
import java.util.* ;

public class Main {
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextLine()){
            String str = scanner.nextLine();
            int[] ans = new int[4] ;
            for(char c : str.toCharArray()){
                if(Character.isLetter(c)){
                    ans[0]++ ;
                }
                else if(c == ' '){
                    ans[1]++ ;
                }
                else if(Character.isDigit(c)){
                    ans[2]++ ;
                }
                else{
                    ans[3]++ ;
                }
            }
            for(int num : ans){
                System.out.println(num) ;
            }
        }
        scanner.close() ;
    }
}
//-------------------------------------------------------------------