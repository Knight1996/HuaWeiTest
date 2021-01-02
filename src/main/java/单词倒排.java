/**
 * @author : Knight
 * @program : 华为机试
 * @description : 单词倒排
 * @date : 2021-01-02 15:36
 **/
//--------------------------------正则表达式----------------------------------
import java.util.* ;

public class Main {
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextLine()){
            // [^a-zA-Z]+ :不含大小写字母：
            // 忽略前导空白和尾部空白:
            String str = scanner.nextLine().replaceAll("[^a-zA-Z]+", " ").trim();
            String[] words=str.split(" ");
            StringBuffer res = new StringBuffer();
            for(int i = words.length - 1 ; i >= 0 ; i--){
                res.append(words[i]).append(" ") ;
            }
            // 去掉最后一个空格：
            System.out.println(res.substring(0,res.length()-1));
        }
        scanner.close() ;
    }
}
//-----------------------------------------------------------------------------