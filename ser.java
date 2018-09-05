import java.util.*;
class ser
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,ch,a,x;
        double s;
        System.out.println("Enter 1 for first series, 2 for second series");
        ch=in.nextInt();
        ser ob=new ser();
        switch(ch)
        {
            case 1:
            System.out.println("Enter n");
            n=in.nextInt();
            System.out.println("Enter x");
            x=in.nextInt();
            s=ob.series1(n,x);
            System.out.println("Sum="+s);
            break;
            case 2:
            System.out.println("Enter n");
            n=in.nextInt();
            System.out.println("Enter a");
            a=in.nextInt();
            s=ob.series2(n,a);
            System.out.println("Sum="+s);
            break;
            default:
            System.out.println("Wrong Choice");
        }
    }
    double series1(int n,int x)
    {
        int i,k;
        double s=0.0;
        for(i=1,k=1;i<=n;i++,k+=2)
        s=s+k/Math.pow(x,i);
        return s;
    }
    double series2(int n,int a)
    {
        int i,k;
        double s=0.0;
        for(i=1,k=2;i<=n;i++,k+=3)
        s=s+Math.pow(a,k)/Math.pow(a,i);
        return s;
    }
}