import java.util.*;
class aishwarya
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,j,t,c;
        int k[]={4,3,5};
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
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(i=9,c=0;i>=7;c++,i--)
        {
            t=a[i];
            a[i]=a[k[c]];
            a[k[c]]=t;
        }
        System.out.println("Sequencial order is");
        for(i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
    }
}