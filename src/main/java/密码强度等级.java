/**
 * @author : Knight
 * @program : 华为机试
 * @description : 密码强度等级
 * @date : 2021-01-02 09:56
 **/
//-----------------------------------模拟判断--------------------------------
import java.util.* ;

public class Main{
    public static void main(String[] args){
        Main solution = new Main() ;
    }

    public Main(){
        Scanner scanner = new Scanner(System.in) ;
        while(scanner.hasNextLine()){
            String str = scanner.nextLine() ;

            int score = 0 ;// 最终得分

            int scoreLen = gradeOfLength(str) ;  // 长度分：
            int scoreAlpha = gradeOfAlpha(str) ; // 字母分：
            int scoreNum = gradeOfNumber(str) ;  // 数字分：
            int scoreSym = gradeOfSymbol(str) ;  // 符号分：
            int scoreBonus = 0 ;                        // 奖励分：
            // 奖励：
            if(scoreAlpha > 0 && scoreNum > 0 && scoreSym > 0){
                if(scoreAlpha == 20){
                    scoreBonus = 5 ;
                }else{
                    scoreBonus = 3 ;
                }
            }
            else if(scoreAlpha > 0 && scoreNum > 0 && scoreSym == 0){
                scoreBonus = 2 ;
            }
            score = scoreLen + scoreAlpha + scoreNum + scoreSym + scoreBonus ;
            System.out.println(grade(score)) ;
        }
        scanner.close() ;
    }

    public String grade(int score){
        String s = new String() ;
        if(score >= 90){
            s = "VERY_SECURE" ;
        }
        else if(score >= 80){
            s = "SECURE" ;
        }
        else if(score >= 70){
            s = "VERY_STRONG" ;
        }
        else if(score >= 60){
            s = "STRONG" ;
        }
        else if(score >= 50){
            s = "AVERAGE" ;
        }
        else if(score >= 25){
            s = "WEAK" ;
        }
        else{
            s = "VERY_WEAK" ;
        }
        return s ;
    }

    public int gradeOfLength(String str){
        int score = 0 ;
        if(str.length() <= 4){
            score = 5 ;
        }else if(str.length() >= 8){
            score = 25 ;
        }else{
            score = 10 ;
        }
        return score ;
    }

    public int gradeOfAlpha(String str){
        int score = 0 ;
        int cntUpper = 0 ;
        int cntLowwer = 0 ;
        int cnt = 0 ;
        for(char c : str.toCharArray()){
            if(Character.isLetter(c)){
                cnt++ ;
            }
            if(Character.isLowerCase(c)){
                cntLowwer++ ;
            }
            else if(Character.isUpperCase(c)){
                cntUpper++ ;
            }
        }

        if(cntLowwer + cntUpper == 0){
            score = 0 ;
        }
        else if(cntLowwer == cnt || cntUpper == cnt){
            score = 10 ;
        }
        else{
            score = 20 ;
        }
        return score ;
    }

    public int gradeOfNumber(String str){
        int score = 0 ;
        int cnt = 0 ;
        for(char c : str.toCharArray()){
            if(c >= '0' && c <= '9'){
                cnt++ ;
            }
        }

        if(cnt == 0){
            score = 0 ;
        }
        else if(cnt == 1){
            score = 10 ;
        }
        else{
            score = 20 ;
        }
        return score ;
    }

    public int gradeOfSymbol(String str){
        int score = 0 ;
        int cnt = str.length() ;
        for(char c : str.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                cnt-- ;
            }
        }

        if(cnt == 0){
            score = 0 ;
        }
        else if(cnt == 1){
            score = 10 ;
        }
        else{
            score = 25 ;
        }
        return score ;
    }
}
//----------------------------------------------------------------------------------