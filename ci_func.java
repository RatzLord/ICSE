import java.util.*;
class ci_func
{
    private static double amt(int p,int r,int t)
    {
        double a=p*Math.pow((1.0+r/100.0),t);
        return a;
    }
    private static double compint(double a,int p)
    {
        double ci=a-p;
        return ci;
    }
    private static int principle()
    {
        String p1;
        char ch;
        int p;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter principle");
        p1=in.next();
        ch=p1.charAt(0);
        if(Character.isLetter(ch))
        return 0;
        else
        {
            p=Integer.valueOf(p1);
            return p;
        }
    }
    private static int rate()
    {
        String r1;
        char ch;
        int r;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter rate");
        r1=in.next();
        ch=r1.charAt(0);
        if(Character.isLetter(ch))
        return 0;
        else
        {
            r=Integer.valueOf(r1);
            return r;
        }
    }
    private static int time()
    {
        String t1;
        char ch;
        int t;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter time");
        t1=in.next();
        ch=t1.charAt(0);
        if(Character.isLetter(ch))
        return 0;
        else
        {
            t=Integer.valueOf(t1);
            return t;
        }
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int p,r,t;
        double ci,a;
        do
        {
            p=principle();
            if(p==0)
            break;
            r=rate();
            if(r==0)
            break;
            t=time();
            if(t==0)
            break;
            a=amt(p,r,t);
            ci=compint(a,p);
            System.out.println("Amount="+a);
            System.out.println("CI="+ci);
        }
        while(true);
        System.out.println("Program terminated");
    }
}