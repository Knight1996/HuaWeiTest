/**
 * @author : Knight
 * @program : 华为机试
 * @description : 矩阵乘法
 * @date : 2021-01-03 12:39
 **/
//-----------------------------多重循环---------------------------------
//注意顺序：
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            int x = scanner.nextInt() ;
            int y = scanner.nextInt() ;
            int z = scanner.nextInt() ;
            int[][] arr1 = new int[x][y] ;
            int[][] arr2 = new int[y][z] ;
            int[][] ans = new int[x][z] ;
            for(int i = 0 ; i < x ; i++){
                for(int j = 0 ; j < y ; j++){
                    arr1[i][j] = scanner.nextInt() ;
                }
            }
            for(int i = 0 ; i < y ; i++){
                for(int j = 0 ; j < z ; j++){
                    arr2[i][j] = scanner.nextInt() ;
                }
            }
            for(int i = 0 ; i < x ; i++){
                for(int j = 0 ; j < z ; j++){
                    for(int k = 0 ; k < y ; k++){
                        ans[i][j] += arr1[i][k]*arr2[k][j] ;
                    }
                }
            }

            for(int i = 0 ; i < x ; i++){
                for(int j = 0 ; j < z ; j++){
                    System.out.print(ans[i][j] + " ") ;
                }
                System.out.println() ;
            }
        }
        scanner.close() ;
    }
}
//--------------------------------------------------------------------