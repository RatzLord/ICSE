import java.util.*;
class asc
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,j,t;
        int a[]=new int[5];
        System.out.println("Enter the values");
        for(i=0;i<5;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<(4-i);j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("Ascending order is");
        for(i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}