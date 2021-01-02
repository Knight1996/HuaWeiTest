/**
 * @author : Knight
 * @program : 华为机试
 * @description : 计票统计
 * @date : 2021-01-02 21:31
 **/
//-------------------------------Map + List--------------------------------
//对输入数据的处理：
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            int nc = scanner.nextInt() ;
            HashMap<String , Integer> map = new HashMap<>() ;
            ArrayList<String> list = new ArrayList<>() ;
            int valid = 0 ;
            for(int i = 0 ; i < nc ; i++){
                String cur = scanner.next() ;
                list.add(cur) ;
                map.put(cur , 0) ;
            }
            int nv = scanner.nextInt() ;
            int[] vote = new int[nv] ;
            for(int i = 0 ; i < nv ; i++){
                String cur = scanner.next() ;
                if (map.containsKey(cur)){
                    map.put(cur , map.get(cur) + 1) ;
                }else{
                    valid++ ;
                }
            }
            for(int i = 0 ; i < nc ; i++){
                String s = list.get(i) ;
                int cnt = map.get(s) ;
                System.out.println(s + " : " + cnt) ;
            }
            System.out.println("Invalid : " + valid) ;
        }
        scanner.close() ;
    }
}
//---------------------------------------------------------------------