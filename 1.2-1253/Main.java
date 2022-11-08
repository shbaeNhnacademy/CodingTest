import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] strs1 = br.readLine().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < strs1.length; i++) {
            a[i] = Integer.parseInt(strs1[i]);
        }

        Arrays.sort(a);

        // int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                continue;
            }
            // System.out.println("###" + a[i]);
            for (int j = 0; j < a.length; j++) {
                if (a[j] >= a[i]) {
                    break;
                }
                // System.out.println("#### " + a[j]);
                for (int z = j + 1; z < a.length; z++) {
                    if (set.contains(a[i])) {
                        break;
                    }
                    // System.out.println(a[j] + " + " + a[z] + " = " + a[i]);
                    // count++;
                    if (a[j] + a[z] == a[i] && a[j] != a[z]) {
                        set.add(a[i]);
                        break;
                    }
                }
            }
        }
        // System.out.println(count);
        // System.out.println(set);

        System.out.println(set.size());
    }
}
