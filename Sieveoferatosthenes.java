import java.util.*;

public class Sieveoferatosthenes 
{
    public static void sieveOfEratosthenes(int n) 
    {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true); // Initialize all values as true

        for (int p = 2; p * p <= n; p++) 
        {
            if (isPrime[p]) 
            {
                for (int i = p * p; i <= n; i += p) 
                {
                    isPrime[i] = false;
                }
            }
        }

        System.out.printf("Prime numbers up to %d are:%n", n);
        for (int p = 2; p <= n; p++) 
        {
            if (isPrime[p]) 
            {
                System.out.print(p + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the limit");
        n=in.nextInt();
        sieveOfEratosthenes(n);
    }
}
