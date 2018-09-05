import java.util.*;
class aastha5
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,c,i,j,k;
        System.out.println("Enter no. of elements");
        n=in.nextInt();
        c=n;
        int a[]=new int[n];
        System.out.println("Enter array elements");
        for(i=0;i<n;i++)
        a[i]=in.nextInt();
        for(i=1;i<=c;i++)
        {
            k=c;
            c=0;
            for(j=0;j<k;j=j+i)
            {
                a[c++]=a[j];
            }
        }
        System.out.println("New array elements=");
        for(i=0;i<c;i++)
        System.out.println(a[i]);
    }
}