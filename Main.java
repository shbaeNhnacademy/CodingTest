import java.io.*;

public class Main {
    private static String space = " ";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = br.readLine().split(space);

        int n = Integer.parseInt(str1[0]);
        int m = Integer.parseInt(str1[1]);

        int[] ints = new int[n];
        String[] str2 = br.readLine().split(space);

        for (int i = 0; i < str2.length; i++) {
            ints[i] = Integer.parseInt(str2[i]);
        }
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String[] str3 = br.readLine().split(space);
            int start = Integer.parseInt(str3[0]) - 1;
            int end = Integer.parseInt(str3[1]) - 1;
            int sum = 0;
            for (int j = start; j <= end; j++) {
                sum += ints[j];
            }
            sb.append(sum + "\n");
        }

        System.out.println(sb.toString());
    }

}