import java.util.*;
class aastha2
{
    int product(int x)
    {
        int i,p=1;
        for(i=1;i<=x;i++)
        p=p*i;
        return p;
    }
    int sum(int y)
    {
        int i,s=1;
        for(i=1;i<=y;i++)
        s=s+i;
        return s;
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        aastha2 ob=new aastha2();
        int i,n,p,su;
        double s=0.0;
        System.out.println("Enter n");
        n=in.nextInt();
        for(i=2;i<=n;i++)
        {
            p=ob.product(i);
            su=ob.sum(i);
            s=s+((double)p/su);
        }
        System.out.println("Sum="+s);
    }
}