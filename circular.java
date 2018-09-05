import java.util.*;
class circular
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,i,m,p,c=0,no,d,k=1,s1=0;
        System.out.println("Enter a no.");
        n=in.nextInt();
        m=n;
        while(n>0)
        {
            c++;
            n=n/10;
        }
        p=(int)Math.pow(10,(c-1));
        for(i=1;i<=c;i++)
        {
            n=m;
            while(n>9)
            {
                k*=10;
                d=n%10;
                s1=d*k+s1;
                n=n/10;
            }
            k=1;
            no=m/p+s1;
            m=no;
            s1=0;
            System.out.println(no);
        }
    }
}