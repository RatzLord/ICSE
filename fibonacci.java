import java.util.*;
class fibonacci
{
    private static int terms()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no. of terms");
        int n=in.nextInt();
        return (n);
    }
    public static void old_method()
    {
        int n=terms(),a=0,b=1,c,i;
        System.out.print(a+" "+b+" ");
        for(i=1;i<=n-2;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    public static void old_method_sum()
    {
        int n=terms(),a=0,b=1,c,i,s=0;
        s=s+a+b;
        for(i=1;i<=n-2;i++)
        {
            c=a+b;
            s=s+c;
            a=b;
            b=c;
        }
        System.out.println("Sum="+s);
    }
    public static void old_alt()
    {
        int n=terms(),a=0,b=1,c,i;
        System.out.print(a+" "+b+" ");
        for(i=1;i<=n-2;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(b+" ");
        }
    }
    public static void old_alt_sum()
    {
        int n=terms(),a=0,b=1,c,i,s=0;
        s=s+a+b;
        for(i=1;i<=n-2;i++)
        {
            c=a+b;
            a=b;
            b=c;
            s=s+b;
        }
        System.out.println("Sum="+s);
    }
    
}