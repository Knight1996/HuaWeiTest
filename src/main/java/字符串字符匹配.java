/**
 * @author : Knight
 * @program : 华为机试
 * @description : 字符串字符匹配
 * @date : 2020-12-31 23:14
 **/
//-----------------------------Set------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextLine()){
            String strShort = scanner.nextLine() ;
            String strLong = scanner.nextLine() ;
            boolean flag = judge(strShort , strLong) ;
            System.out.println(flag) ;
        }
        scanner.close();
    }

    public boolean judge(String strShort , String strLong){
        Set<Character> set = new HashSet<>() ;
        for(char c : strLong.toCharArray()){
            set.add(c) ;
        }
        for(char c : strShort.toCharArray()){
            if(!set.contains(c)){
                return false;
            }
        }
        return true ;
    }
}
//---------------------------------------------------------------