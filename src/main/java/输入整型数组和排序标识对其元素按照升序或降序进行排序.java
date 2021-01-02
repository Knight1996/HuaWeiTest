/**
 * @author : Knight
 * @program : 华为机试
 * @description : 输入整型数组和排序标识，对其元素按照升序或降序进行排序
 * @date : 2021-01-02 20:19
 **/
//--------------------------调用sort()方法------------------------------
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main solution = new Main();
    }

    public Main() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            Integer[] array = new Integer[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            int flag = scanner.nextInt();
            sortIntegerArray(array, flag);
            for (Integer i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        scanner.close() ;
    }

    public void sortIntegerArray(Integer[] pIntegerArray, int iSortFlag) {
        // 按升序
        if (iSortFlag == 0) {
            Arrays.sort(pIntegerArray, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            });
        }
        // 按降序
        else {
            Arrays.sort(pIntegerArray, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });
        }
    }
}
//---------------------------------------------------------------------