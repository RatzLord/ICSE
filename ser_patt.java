import java.util.*;
class ser_patt
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int ch,n;
        double s;
        System.out.println("Enter 1 for series, 2 for pattern");
        ch=in.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Enter no. of terms");
            n=in.nextInt();
            s=series(n);
            System.out.println("Sum of series="+s);
            break;
            case 2:
            System.out.println("Enter no. of terms");
            n=in.nextInt();
            pattern(n);
            break;
            default:
            System.out.println("Wrong choice");
        }
    }
    public static double series(int n)
    {
        int i,a=0,b=1,c=0;
        double s=0.0;
        for(i=1;i<=n;i++)
        {
            a=b;
            b=c;
            c=a+b;
            s=s+b;
        }
        return (s);
    }
    public static void pattern(int n)
    {
        int i,j,k,a=0;
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(k=1;k<=a;k++)
            {
                System.out.print(k);
            }
            System.out.println();
            a++;
        }
    }
}