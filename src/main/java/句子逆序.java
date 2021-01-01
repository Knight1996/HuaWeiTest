/**
 * @author : Knight
 * @program : 华为机试
 * @description : 句子逆序
 * @date : 2021-01-01 18:38
 **/
//--------------------------反向遍历---------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextLine()){
            String str = scanner.nextLine() ;
            String[] arr = str.split(" ") ;
            for(int i = arr.length - 1 ; i >= 0 ; i--){
                System.out.print(arr[i]) ;
                System.out.print(" ") ;
            }
        }
        scanner.close() ;
    }
}
//--------------------------------------------------------------

//-----------------------------栈-------------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextLine()){
            String str = scanner.nextLine() ;
            Stack<String> stack = new Stack<>() ;
            String[] arr = str.split(" ") ;
            StringBuffer ans = new StringBuffer() ;
            for(String s : arr){
                stack.push(s) ;
            }
            while(!stack.isEmpty()){
                ans.append(stack.pop() + " ") ;
            }
            System.out.println(ans) ;
        }
        scanner.close() ;
    }
}
//--------------------------------------------------------------