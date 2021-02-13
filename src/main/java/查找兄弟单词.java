/**
 * @author : Knight
 * @program : 华为机试
 * @description : 查找兄弟单词
 * @date : 2021-02-13 15:57
 **/
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            int n = scanner.nextInt() ;
            String[] arr = new String[n] ;
            for(int i = 0 ; i < n ; i++){
                arr[i] = scanner.next() ;
            }
            String target = scanner.next() ;
            int index = scanner.nextInt() ;
            LinkedList<String> list = new LinkedList<>() ;
            int sum = 0 ;
            for(int i = 0 ; i < n ; i++){
                if(judge(arr[i] , target)){
                    list.add(arr[i]) ;
                    sum++ ;
                }
            }
            Collections.sort(list) ;
            System.out.println(sum) ;
            if(index <= list.size()){
                System.out.println(list.get(index - 1)) ;
            }
        }
        scanner.close() ;
    }

    public boolean judge(String s1 , String s2){
        if(s1.equals(s2)){
            return false ;
        }
        if(s1.length() != s2.length()){
            return false ;
        }
        char[] arr1 = s1.toCharArray() ;
        char[] arr2 = s2.toCharArray() ;
        Arrays.sort(arr1) ;
        Arrays.sort(arr2) ;
        for(int i = 0 ; i < arr1.length ; i++){
            if(arr1[i] != arr2[i]){
                return false ;
            }
        }
        return true ;
    }
}
