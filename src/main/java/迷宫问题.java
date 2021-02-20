/**
 * @author : Knight
 * @program : 华为机试
 * @description : 迷宫问题
 * @date : 2021-02-13 21:01
 **/
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            int m = scanner.nextInt() ;
            int n = scanner.nextInt() ;
            int[][] arr = new int[m][n] ;
            for(int i = 0 ; i < m ; i++){
                for(int j = 0 ; j < n ; j++){
                    arr[i][j] = scanner.nextInt() ;
                }
            }
            //预先探测迷宫一遍，将走不通的路置1
            helper1(arr , 0 , 0) ;
            //正式走迷宫:
            System.out.println(helper2(arr , 0 , 0)) ;
        }
        scanner.close() ;
    }

    public int helper1(int[][] arr , int x , int y){
        // 在右下角的出口：
        if(x == arr.length - 1 && y == arr[0].length - 1){
            return 1 ;
        }
        // 在可行的路上
        if(x < arr.length && y < arr[arr.length - 1].length && arr[x][y] == 0){
            // 下一步往右往下都走不通，就把此处封死：
            if(helper1(arr , x + 1 , y) == -1 && helper1(arr , x , y + 1) == -1){
                arr[x][y] = 1 ;
                return -1 ;
            }
            else{
                return 1 ;
            }
        }
        // 当前位置不是路：
        else{
            return -1 ;
        }
    }

    public String helper2(int[][] arr , int x , int y){
        // 在右下角的出口：
        if(x == arr.length - 1 && y == arr[0].length - 1){
            return "(" + x + "," + y + ")";
        }
        // 在可行的路上:
        if(x < arr.length && y < arr[arr.length - 1].length && arr[x][y] == 0){
            return "(" + x + "," + y + ")" + "\n" +
                    helper2(arr, x + 1, y) +
                    helper2(arr, x, y + 1);
        }
        else{
            return "" ;
        }
    }
}
