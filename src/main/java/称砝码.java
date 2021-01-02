/**
 * @author : Knight
 * @program : 华为机试
 * @description : 称砝码
 * @date : 2021-01-02 16:15
 **/
//----------------------------set + 三重循环-------------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextInt()){
            int n = scanner.nextInt() ;
            int[] weight = new int[n] ;
            int[] number = new int[n] ;
            for(int i = 0 ; i < n ; i++){
                weight[i] = scanner.nextInt() ;
            }
            for(int i = 0 ; i < n ; i++){
                number[i] = scanner.nextInt() ;
            }
            System.out.println(helper(weight , number , n)) ;
        }
        scanner.close() ;
    }

    public int helper(int[] weight , int[] number , int n){
        // set 去重：
        Set<Integer> set = new HashSet<>();
        //只用第一个砝码可以称出的重量
        for(int j = 0 ; j <= number[0] ; j++){
            set.add(weight[0] * j) ;
        }
        // 累加求和
        for(int i = 1 ; i < n ; i++){
            List<Integer> list = new ArrayList<>(set);
            for(int j = 0 ; j <= number[i] ; j++){
                for(int k = 0 ; k < list.size() ; k++){
                    set.add(list.get(k) + j * weight[i]);
                }
            }
        }
        return set.size();
    }
}
//-------------------------------------------------------------------------