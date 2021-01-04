/**
 * @author : Knight
 * @program : 华为机试
 * @description : 合并表记录
 * @date : 2021-01-04 14:01
 **/
//------------------------------TreeMap---------------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            TreeMap<Integer , Integer> map = new TreeMap<>() ;
            int n = scanner.nextInt() ;
            for(int i = 0 ; i < n ; i++){
                int key = scanner.nextInt() ;
                int value = scanner.nextInt() ;
                map.put(key , map.getOrDefault(key , 0) + value) ;
            }

            for(Map.Entry<Integer , Integer> e : map.entrySet()){
                System.out.println(e.getKey() + " " + e.getValue()) ;
            }
        }
        scanner.close() ;
    }
}
//----------------------------------------------------------------------