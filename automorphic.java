import java.util.*;
class automorphic
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,no,c=1,sq;
        System.out.println("Enter a no.");
        n=in.nextInt();
        sq=n*n;
        no=n;
        while(no>0)
        {
            c=c*10;
            no/=10;
        }
        if(n==sq%c)
        System.out.println("Automorphic no.");
        else
        System.out.println("Not Automorphic no.");
    }
    public static void diffmeth()
    {
        Scanner in=new Scanner(System.in);
        int n,no,d,k=1,sq,s=0;
        System.out.println("Enter a no.");
        n=in.nextInt();
        sq=n*n;
        no=n;
        while(n>0)
        {
            d=sq%10;
            s=d*k+s;
            k*=10;
            sq/=10;
            n/=10;
        }
        if(s==no)
        System.out.println("Automorphic no.");
        else
        System.out.println("Not Automorphic no.");
    }
}