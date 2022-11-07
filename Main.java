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
            for (int j = start; j <= end; j++) {
                sum += ints[j];
            }
            sb.append(sum + "\n");
        }

        System.out.println(sb.toString());
    }

}