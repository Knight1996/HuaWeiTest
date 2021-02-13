/**
 * @author : Knight
 * @program : 华为机试
 * @description : 删除字符串中出现次数最小的字符
 * @date : 2021-01-02 16:51
 **/
//------------------------hashMap：记最小次数---------------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            String str = scanner.next() ;
            // 放入哈希表：
            HashMap<Character , Integer> map = new HashMap<>() ;
            for(char c : str.toCharArray()){
                map.put(c , map.getOrDefault(c ,0) + 1) ;
            }
            // 遍历得到最小次数：
            int min = Integer.MAX_VALUE; ;
            for(Integer cnt : map.values()){
                min = Math.min(cnt , min) ;
            }
            //
            for(int i = 0 ; i < str.length() ; i++){
                char c = str.charAt(i) ;
                if(map.get(c) != min){
                    System.out.print(c) ;
                }
            }
            System.out.println("") ;
        }
        scanner.close() ;
    }
}
//----------------------------------------------------------------------

//------------------------------数组：记最小次数-------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            String s = scanner.nextLine() ;
            String ans = "" ;
            int[] arr = new int[26] ;
            char[] chars = s.toCharArray() ;
            int min = Integer.MAX_VALUE;
            for(char c : chars){
                arr[c - 'a']++ ;
                min = Math.min(min , arr[c - 'a']) ;
            }

            for(char c : chars){
                if(arr[c - 'a'] > min){
                    System.out.print(c) ;
                }
            }
            System.out.println() ;
        }
        scanner.close() ;
    }
}
//----------------------------------------------------------------------