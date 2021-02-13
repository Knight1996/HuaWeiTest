/**
 * @author : Knight
 * @program : 华为机试
 * @description : 找出字符串中第一个只出现一次的字符
 * @date : 2021-02-10 15:48
 **/
//------------------------------hashMap-------------------------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextLine()){
            String s = scanner.nextLine() ;
            HashMap<Character , Integer> map = new HashMap<>() ;
            for(int i = 0 ; i < s.length() ; i++){
                char c = s.charAt(i) ;
                map.put(c , map.getOrDefault(c , 0) + 1) ;
            }
            char ans = ' ' ;
            for(char c : s.toCharArray()){
                if(map.get(c) == 1){
                    ans = c ;
                    break ;
                }
            }
            if(ans !=  ' '){
                System.out.println(ans) ;
            }
            else{
                System.out.println(-1) ;
            }

        }
        scanner.close() ;
    }
}
//------------------------------------------------------------------------------