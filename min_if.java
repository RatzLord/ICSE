import java.util.*;
class min_if
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,i,min;
        System.out.println("Enter no.of values");
        n=in.nextInt();
        int a[]=new int[n];
        System.out.println("enter values of array");
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        min=a[0];
        for(i=0;i<n;i++)
        {
            if(a[i]<min)
            min=a[i];
        }
        System.out.println("The minimum value of array="+min);
    }
}