import java.util.*;
class asc_desc
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,j,t,k;
        int a[]=new int[10];
        System.out.println("Enter the values");
        for(i=0;i<10;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<9;i++)
        {
            if(i<5)
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
            else
            {
                k=0;
                for(j=5;j<(9-k);j++)
                {
                    if(a[j]<a[j+1])
                    {
                        t=a[j];
                        a[j]=a[j+1];
                        a[j+1]=t;
                    }
                }
                k++;
            }
        }
        System.out.println("Ascending_descending sequences is");
        for(i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
    }
}