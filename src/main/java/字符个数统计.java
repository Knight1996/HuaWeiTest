/**
 * @author : Knight
 * @program : 华为机试
 * @description : 字符个数统计
 * @date : 2020-12-31 21:46
 **/
//---------------------------Set---------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            String str = scanner.next() ;
            Set<Character> set = new HashSet<>() ;
            char[] chars = str.toCharArray() ;
            for(int i = 0 ; i < chars.length ; i++){
                if(chars[i] >= 0 && chars[i] < 128){
                    set.add(chars[i]) ;
                }
            }
            System.out.println(set.size()) ;
        }
        scanner.close() ;
    }
}
//---------------------------------------------------------