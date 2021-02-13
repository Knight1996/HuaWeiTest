/**
 * @author : Knight
 * @program : 华为机试
 * @description : 简单错误记录
 * @date : 2021-02-13 15:51
 **/
//----------------------------- stack + hashMap ------------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        Stack<String> stack = new Stack<>() ;
        HashMap<String , Integer> map = new HashMap<>() ;
        while(scanner.hasNext()){
            String[] arr = scanner.nextLine().split("\\\\") ;
            String line = arr[arr.length - 1] ;
            String l1 = line.split(" ")[0] ;
            String l2 = line.split(" ")[1] ;
            if(l1.length() > 16){
                l1 = l1.substring(l1.length() - 16) ;
            }
            line = l1 + " " + l2 ;
            if(stack.contains(line)){
                map.put(line , map.get(line) + 1) ;
            }
            else{
                stack.push(line) ;
                map.put(line , 1) ;
            }
        }
        Stack<String> stack1 = new Stack<>() ;
        // i 记录数据个数：
        int i = 0 ;
        while(!stack.isEmpty()){
            if(i == 8){
                break ;
            }
            stack1.push(stack.peek() + " " + map.get(stack.pop())) ;
            i++ ;
        }
        while(!stack1.isEmpty()){
            System.out.println(stack1.pop()) ;
        }
    }
}
//------------------------------------------------------------------------