import java.util.*;
class bin
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a[]={4,7,10,13,16};
        int n,c=0,l=0,u=a.length,m=0;
        System.out.println("Enter no. to be searched");
        n=in.nextInt();
        while(l<=u)
        {
            m=(l+u)/2;
            if(n==a[m])
            {
                System.out.println("Found");
                c++;
                break;
            }
            else if(n>a[m])
            l=m+1;
            else if(n<a[m])
            u=m-1;
        }
        if(c==0)
        System.out.println("Not found");
    }
}