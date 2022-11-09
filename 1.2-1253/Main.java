import java.io.*;
import java.util.*;

/**
 * 투 포인터 문제 - target은 고정되어 있고 포인터 두개가 양쪽에서 범위를 좁혀 들어오면서 target 찾기
 */

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            int target = a[i];
            int startIdx = 0;
            int endIdx = a.length - 1;

            while (startIdx < endIdx) {
                if (a[startIdx] + a[endIdx] == target) {
                    if (i != startIdx && i != endIdx) {
                        count++;
                        break;
                    } else if (i == startIdx) {
                        startIdx++;
                    } else if (i == endIdx) {
                        endIdx--;
                    }
                } else if (a[startIdx] + a[endIdx] > target) {
                    endIdx--;
                } else {
                    startIdx++;
                }
            }
        }
        System.out.println(count);
    }
}
