import java.util.Scanner;

public class tsp
{
   static int[][] m;  	
    static int fun(int i, int k, int[][] a) 
    {
        if (k == ((1 << i) | 3))
            return a[1][i];
        if (m[i][k] != 0)
            return m[i][k];

        int res = Integer.MAX_VALUE/2 ; 
        for (int j = 1; j <= a.length; j++)
            if ((k & (1 << j)) != 0 && j != i && j != 1)
                res = Math.min(res, fun(j, k & (~(1 << i)), a) + a[j][i]);
        return m[i][k] = res;
    }
    


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of cities");
        int n = in.nextInt();
        System.out.println("Enter the weighted matrix");
        int[][] a = new int[n + 1][n + 1]; 
        for (int i = 1; i <= n; i++) 
            for (int j = 1; j <= n; j++)
                a[i][j] = in.nextInt();
        m = new int[n + 1][1 << (n + 1)];

        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++)
            ans = Math.min(ans, fun(i, (1 << (n + 1)) - 1, a) + a[i][1]);
        System.out.println("The cost of the most efficient tour = " + ans);
    }
}
