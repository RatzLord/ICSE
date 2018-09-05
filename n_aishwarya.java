import java.util.*;
class n_aishwarya
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,j,t,c,n;
        System.out.println("Enter no. of values of array");
        n=in.nextInt();
        int k[]={n/2,n/2-1,n/2+1};
        int a[]=new int[n];
        System.out.println("Enter the values");
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<(n-1);i++)
        {
            for(j=0;j<(n-1-i);j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(i=(n-1),c=0;i>=(n-3);c++,i--)
        {
            t=a[i];
            a[i]=a[k[c]];
            a[k[c]]=t;
        }
        System.out.println("Sequencial order is");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}