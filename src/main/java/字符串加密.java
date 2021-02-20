/**
 * @author : Knight
 * @program : 华为机试
 * @description : 字符串加密
 * @date : 2021-02-20 15:53
 **/
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            String key = scanner.nextLine() ;
            String s = scanner.nextLine() ;

            String s2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String s1 = s2.toLowerCase();

            List<String> list = new ArrayList<>();
            for (int i = 0 ; i < s1.length(); i++) {
                list.add(s1.charAt(i) + "");
            }
            // str为 key 中不重复的字符集合：
            String str= "";
            for(int i = 0; i < key.length(); i++) {
                char c = key.charAt(i) ;
                if (!(str.contains(key.charAt(i)+""))) {
                    str += key.charAt(i) ;
                }
            }
            //2.删一个添一个
            for (int i = 0; i < str.length(); i++) {
                list.remove(str.charAt(i) + "");
                list.add(i, str.charAt(i) + "");
            }

            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i) ;
                System.out.print(list.get(s1.indexOf(c)));
            }
            System.out.println();
        }
        scanner.close() ;
    }
}
