/**
 * @author : Knight
 * @program : 华为机试
 * @description :
 * @date : 2020-12-31 12:46
 **/
//----------------------------------正则表达式---------------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextLine()){
            String str = scanner.nextLine() ;
            //把所有的数字段提取出来，前后加上星号再放回去
            //public String replaceAll(String regex, String replacement);
            // []：里面包含的单个字符不限顺序的出现
            // +: 重复出现：
            // ():合并整体匹配，并放入内存，可使用\1 \2…依次获取
            // $1，$2表达的是小括号里面的内容
            System.out.println(str.replaceAll("([0-9]+)", "*$1*"));
        }
        scanner.close() ;
    }
}
//-------------------------------------------------------------------------------

//------------------------------------遍历模拟------------------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;

        while(scanner.hasNextLine()){
            String str = scanner.nextLine() ;
            StringBuffer ans = new StringBuffer() ;
            int i = 0 ;
            while(i < str.length()){
                if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                    ans.append("*") ;
                    while(i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                        ans.append(str.charAt(i)) ;
                        i++ ;
                    }
                    ans.append("*") ;
                }
                else{
                    ans.append(str.charAt(i)) ;
                    i++ ;
                }
            }
            System.out.println(ans.toString()) ;
        }
        scanner.close() ;
    }
}
//--------------------------------------------------------------------------------