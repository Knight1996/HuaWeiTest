/**
 * @author : Knight
 * @program : 华为机试
 * @description : 计算字符个数
 * @date : 2020-12-31 09:16
 **/
//----------------------------------遍历-------------------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextLine()){
            String firstStr = scanner.nextLine().toLowerCase() ;
            Character secondStr = scanner.nextLine().charAt(0) ;
            Character ch = Character.toLowerCase(secondStr) ;
            int cnt = 0 ;
            for(int i = 0 ; i < firstStr.length() ; i++){
                if(ch == firstStr.charAt(i)){
                    cnt++ ;
                }
            }
            System.out.println(cnt) ;
        }
        scanner.close() ;
    }
}
//---------------------------------------------------------------------------