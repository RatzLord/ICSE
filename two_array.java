import java.util.*;
class two_array
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i;
        int a[]=new int[5];
        int b[]=new int[5];
        System.out.println("Enter values of array a");
        for(i=0;i<5;i++)
        {
            a[i]=in.nextInt();
            b[i]=a[i];
        }
        System.out.println("Values of array a are");
        for(i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Values of array b are");
        for(i=0;i<5;i++)
        {
            System.out.println(b[i]);
        }
    }
}