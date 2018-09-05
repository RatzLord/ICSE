import java.util.*;
class selsort
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,i,j,p,t;
        System.out.println("Enter n");
        n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" values");
        for(i=0;i<n;i++)
        a[i]=in.nextInt();
        for(i=0;i<n-1;i++)
        {
            p=i;
            for(j=i+1;j<n;j++)
            {
                if(a[j]<a[p])
                p=j;
            }
            t=a[p];
            a[p]=a[i];
            a[i]=t;
        }
        System.out.println("Descending order=");
        for(i=0;i<n;i++)
        System.out.println(a[i]);
    }
}