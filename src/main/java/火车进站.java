/**
 * @author : Knight
 * @program : 华为机试
 * @description : 火车进站
 * @date : 2021-02-14 16:40
 **/
import java.util.* ;

public class Main{

    private static Stack<String> stack1 = new Stack<>();
    private static Stack<String> stack2 = new Stack<>();
    private static List<String> ans = new ArrayList<>();

    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            int n = scanner.nextInt() ;
            scanner.nextLine() ;
            String s = scanner.nextLine() ;
            String[] str = s.split(" ") ;
            for(int i = str.length - 1 ; i >= 0 ; i--){
                stack1.push(str[i]) ;
            }
            helper("") ;
            Collections.sort(ans) ;
            for(String ss : ans){
                System.out.println(ss) ;
            }
        }
    }

    public void helper(String s){
        if(stack1.isEmpty() && stack2.isEmpty()){
            ans.add(s.trim()) ;
            return ;
        }
        if(!stack2.isEmpty()){
            String tem = stack2.pop() ;
            helper(s + " " + tem) ;
            stack2.push(tem) ;
        }
        if(!stack1.isEmpty()){
            String tem = stack1.pop() ;
            stack2.push(tem) ;
            helper(s) ;
            stack2.pop() ;
            stack1.push(tem) ;
        }
    }
}
