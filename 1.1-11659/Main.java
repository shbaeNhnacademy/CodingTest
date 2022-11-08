import java.io.*;
import java.util.*;

public class Main {
    private static String space = " ";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = br.readLine().split(space);

        int n = Integer.parseInt(str1[0]);
        int m = Integer.parseInt(str1[1]);

        String[] str2 = br.readLine().split(space);

        int[] accInts = new int[n + 5];
        accInts[0] = 0;
        for (int i = 1; i <= str2.length; i++) {
            accInts[i] = accInts[i - 1] + Integer.parseInt(str2[i-1]);
        }
        
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String[] str3 = br.readLine().split(space);
            int start = Integer.parseInt(str3[0])-1;
            int end = Integer.parseInt(str3[1]);
            int sum = accInts[end] - accInts[start];
            sb.append(sum + "\n");
        }
        System.out.println(sb.toString());
    }

}