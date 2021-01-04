/**
 * @author : Knight
 * @program : 华为机试
 * @description : 参数解析
 * @date : 2021-01-04 16:14
 **/
// -----------------------分情况讨论----------------------------
import java.util.* ;

public class Main {
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String s = scanner.nextLine() ;
            StringBuffer str = new StringBuffer() ;
            ArrayList<String> list = new ArrayList<>() ;
            boolean flag = false ;
            for(int i = 0 ; i < s.length() ; i++){
                char c = s.charAt(i) ;
                // 第一次遇见 “ 变为 true
                if(c == '"'){
                    flag = flag ? false : true ;
                    continue ;
                }
                // 遇见空格且不在 “ ” 之内：
                if(c == ' ' && !flag){
                    list.add(str.toString());
                    str = new StringBuffer() ;
                }
                else{
                    str.append(c) ;
                }
            }

            list.add(str.toString());
            System.out.println(list.size()) ;
            for(String tem : list){
                System.out.println(tem) ;
            }
        }
        scanner.close() ;
    }
}
//--------------------------------------------------------