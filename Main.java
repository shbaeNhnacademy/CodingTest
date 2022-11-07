import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = scanner.nextInt();
        }
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            int start = scanner.nextInt() - 1;
            int end = scanner.nextInt() - 1;
            int sum = 0;
            boolean isStart = false;
            for (int j = 0; j < ints.length; j++) {
                if (j == start) {
                    isStart = true;
                } else if (j == end) {
                    sum += ints[j];
                    break;
                }
                
                if (isStart) {
                    sum += ints[j];
                }

            }
            sb.append(sum + "\n");
        }

        System.out.println(sb.toString());
    }

}