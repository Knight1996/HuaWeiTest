/**
 * @author : Knight
 * @program : 华为机试
 * @description : 字符串排序HJ26
 * @date : 2021-02-13 19:51
 **/
//-----------------------------循环--------------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            String s = scanner.nextLine() ;
            char[] arr = s.toCharArray() ;
            StringBuffer ans = new StringBuffer() ;
            //1、英文字母从 A 到 Z 排列，不区分大小写。
            //2、同一个英文字母的大小写同时存在时，按照输入顺序排列。
            for(int i = 0 ; i < 26 ; i++){
                char c = (char)(i + 'A') ;
                for(int j = 0 ; j < s.length() ; j++){
                    if(arr[j] == c || arr[j] == (char)(c + 32)){
                        ans.append(arr[j]) ;
                    }
                }
            }
            //3、非英文字母的其它字符保持原来的位置
            for(int i = 0 ; i < s.length() ; i++){
                if(!Character.isLetter(arr[i])){
                    ans.insert(i , arr[i]) ;
                }
            }
            System.out.println(ans) ;
        }
        scanner.close() ;
    }
}
//-------------------------------------------------------------------------

//---------------------------------排序-------------------------------------

//-------------------------------------------------------------------------