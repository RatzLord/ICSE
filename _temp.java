import java.util.*;
class _temp
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,j,c=0,x=0;
        int a[]=new int[10];
        int b[]=new int[10];
        System.out.println("Enter values");
        for(i=0;i<10;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<10;i++)
        {
            for(j=(i+1);j<10;j++)
            {
                if(a[i]==a[j])
                c++;
            }
            if(c==0)
            {
                b[x]=a[i];
                x++;
            }
            c=0;
        }
        System.out.println("values are");
        for(i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
    }
}