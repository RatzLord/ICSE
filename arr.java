import java.util.*;
class arr
{
    public void print(int x[])
    {
        int n=x.length,i,s=0,s1=0;
        for(i=0;i<n;i++)
        {
            if(x[i]<10)
            s=s+x[i];
            else if(x[i]>=10 && x[i]<100)
            s1=s1+x[i];
        }
        System.out.println("Sum of single digit nos.="+s);
        System.out.println("Sum of double digit nos.="+s1);
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,n;
        System.out.println("Enter size");
        n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" nos.");
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        arr ob=new arr();
        ob.print(a);
    }
}