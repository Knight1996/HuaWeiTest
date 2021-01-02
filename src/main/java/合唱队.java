/**
 * @author : Knight
 * @program : 华为机试
 * @description : 合唱队
 * @date : 2021-01-02 14:05
 **/
//----------------------------最长上升子序列:动态规划---------------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            int cnt = scanner.nextInt() ;
            int[] arr = new int[cnt] ;
            for(int i = 0 ; i < cnt ; i++){
                arr[i] = scanner.nextInt() ;
            }
            int[] leftArr = new int[cnt] ;
            int[] rightArr = new int[cnt] ;
            leftArr[0] = 1 ;
            rightArr[cnt - 1] = 1 ;
            // 从左遍历，最长上升子序列
            for(int i = 0 ; i < cnt ; i++){
                leftArr[i] = 1 ;
                for(int j = 0 ; j < i ; j++){
                    if(arr[i] > arr[j]){
                        leftArr[i] = Math.max(leftArr[j] + 1 , leftArr[i]) ;
                    }
                }
            }
            // 从右遍历，最长上升子序列
            for(int i = cnt - 1 ; i >= 0 ; i--){
                rightArr[i] = 1 ;
                for(int j = cnt - 1 ; j > i ; j--){
                    if(arr[i] > arr[j]){
                        rightArr[i] = Math.max(rightArr[j] + 1 , rightArr[i]) ;
                    }
                }
            }

            int[] res = new int[cnt];
            for (int i = 0; i < cnt; i++) {
                //两个都包含本身
                res[i] = leftArr[i] + rightArr[i] - 1;
            }

            int max = 1;
            for (int i = 0; i < cnt ; i++) {
                if (res[i] > max) {
                    max = res[i];
                }
            }
            System.out.println(cnt - max) ;
        }
    }
}
//-----------------------------------------------------------------------------