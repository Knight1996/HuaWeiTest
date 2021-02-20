/**
 * @author : Knight
 * @program : 华为机试
 * @description : MP3光标位置
 * @date : 2021-02-15 15:50
 **/
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            int num = scanner.nextInt() ;
            String s = scanner.next() ;
            char[] arr = s.toCharArray() ;
            if(num <= 4){
                helper1(num , arr) ;
            }
            else{
                helper2(num , arr) ;
            }
        }
        scanner.close() ;
    }

    public void helper1(int num , char[] arr){
        int cur = 1 ;
        int head = 1 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(cur == 1 && arr[i] == 'U'){
                cur = num ;
            }
            else if(cur == num && arr[i] == 'D'){
                cur = 1 ;
            }
            else{
                if(arr[i] == 'U'){
                    cur-- ;
                }
                else{
                    cur++ ;
                }
            }
        }
        // 输出当前列表：
        for(int i = 0 ; i < num; i++){
            if(i != num - 1)
                System.out.print(head + i + " ");
            else{
                System.out.println(head + i);
            }
        }
        // 输出当前选中歌曲：
        System.out.println(cur);
    }

    public void helper2(int num , char[] arr){
        int cur = 1 ;
        int head = 1 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(cur == 1 && head == 1 && arr[i] == 'U'){
                cur = num ;
                head = num - 3 ;
            }
            else if(cur == num && head == num - 3 && arr[i] == 'D'){
                cur = 1 ;
                head = 1 ;
            }
            else if(cur == head && arr[i] == 'U'){
                cur-- ;
                head-- ;
                continue ;
            }
            else if(cur == head + 3 && arr[i] == 'D'){
                cur++ ;
                head++ ;
            }
            else{
                if(arr[i] == 'U'){
                    cur-- ;
                }
                else{
                    cur++ ;
                }
            }
        }
        // 输出当前列表：
        System.out.println(head + " " + (head + 1) + " " + (head + 2)+ " " + (head + 3));
        // 输出当前选中歌曲：
        System.out.println(cur);
    }
}
