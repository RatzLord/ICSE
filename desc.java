import java.util.*;
class desc
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,j,t;
        int a[]=new int[10];
        System.out.println("Enter the values");
        for(i=0;i<10;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<9;i++)
        {
            for(j=0;j<(9-i);j++)
            {
                if(a[j]<a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("Descending order is");
        for(i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
    }
}