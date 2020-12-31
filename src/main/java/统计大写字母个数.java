/**
 * @author : Knight
 * @program : 华为机试
 * @description : 统计大写字母个数
 * @date : 2020-12-31 22:11
 **/
//--------------------------遍历判断---------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }
    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextLine()){
            String str = scanner.nextLine() ;
            int cnt = 0 ;
            for(char c : str.toCharArray()){
                if(Character.isUpperCase(c)){
                    cnt++ ;
                }
                /*if(c >= 'A' && c <= 'Z'){
                    cnt++ ;
                }*/
            }
            System.out.println(cnt) ;
        }
        scanner.close();
    }
}
//--------------------------------------------------------