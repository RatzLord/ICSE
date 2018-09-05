import java.util.*;
class pos_array
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,n,no;
        System.out.println("Enter the size");
        n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the values");
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Enter the no. to be searched");
        no=in.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==no)
            {
                System.out.println("The pos. of no. entered is="+(i+1));
                break;
            }
        }
    }
}