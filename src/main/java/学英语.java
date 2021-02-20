/**
 * @author : Knight
 * @program : 华为机试
 * @description : 学英语
 * @date : 2021-02-14 16:08
 **/
import java.util.* ;

public class Main{

    public static String[] ones = new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static String[] tens = new String[]{"ten","eleven","twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    public static String[] twenties = new String[]{"zero","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

    public static int[] range = new int[]{(int)1e2, (int)1e3, (int)1e6, (int)1e9, (int)1e12};
    public static String[] ranges = new String[]{"hundred", "thousand", "million", "billion"};

    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNext()){
            long num = scanner.nextLong() ;
            System.out.println(transfer((int)num));
        }
        scanner.close() ;
    }

    public static String transfer(int num){
        if(num <= 9){
            return ones[num];
        }
        if(num <= 19){
            return tens[num % 10];
        }
        if(num <= 99){
            return twenties[num / 10] + (num % 10 == 0 ? "" : " " + ones[num % 10]);
        }
        // 递归调用
        for(int i=0; i<4; i++){
            if(num < range[i + 1]){
                return transfer(num / range[i]) + " " + ranges[i] +
                        (num % range[i] == 0 ? " " : (i != 0 ? " " : " and ") + transfer(num % range[i]));
            }
        }
        return "";
    }
}
