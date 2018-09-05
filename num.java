import java.util.*;
class num
{
    int n,a[];
    num(int s)
    {
        int i;
        n=s;
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=0;
        }
    }
    public void input()
    {
        Scanner in=new Scanner(System.in);
        int i;
        System.out.println("Enter "+n+" values");
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
    }
    public boolean desc(int d)
    {
        int i,n,s=0,d1;
        for(i=9;i>=0;i--)
        {
            n=d;
            while(n>0)
            {
                d1=n%10;
                if(d1==i)
                s=s*10+d1;
                n=n/10;
            }
        }
        if(s==d)
        return true;
        else
        return false;
    }
    public int calculate()
    {
        int i,s=0;
        for(i=0;i<n;i++)
        {
            if(desc(a[i]))
            {
                s=s+a[i];
            }
        }
        return s;
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,s;
        System.out.println("Enter size of array");
        n=in.nextInt();
        num ob=new num(n);
        ob.input();
        s=ob.calculate();
        System.out.println("Sum="+s);
    }
}