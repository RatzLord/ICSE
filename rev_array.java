import java.util.*;
class rev_array
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the size");
        n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the values");
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Reverse order is");
        for(i=(n-1);i>=0;i--)
        {
            System.out.println(a[i]);
        }
        System.out.println("Half-sequencial half-reverse order is");
        for(i=0;i<(n/2.0);i++)
        {
            System.out.println(a[i]);
        }
        for(i=(n-1);i>=(n-(n/2.0));i--)
        {
            System.out.println(a[i]);
        }
    }
}