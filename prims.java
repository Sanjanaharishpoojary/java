
import java.util.*;

public class prims {
    public static void main(String args[]) {
        int v = 0, u = 0, sum = 0, flag = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of nodes");
        int n = in.nextInt();
        int sol[] = new int[n];
        int w[][] = new int[n][n];
        System.out.println("enter the weighted graph");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                w[i][j] = in.nextInt();
        System.out.println("enter source");
        int s = in.nextInt();
        sol[s] = 1;
        int k = 1;
        while (k <= n - 1) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    if (sol[i] == 1 && sol[j] == 0 )if( i != j &&min> w[i][j]) {
                        min = w[i][j];
                        u = i;
                        v = j;
                    }
            sol[v] = 1;
            sum += min;
            k++;
            System.out.println(u + "->" + v + "=" + min);
        }

        for (int i = 0; i < n; i++)
            if (sol[i] == 0)
                flag = 1;
        if (flag == 1)
            System.out.println("no spanning tree");
        else
            System.out.println("cost=" + sum);
    }
}
