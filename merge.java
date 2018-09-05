import java.util.*;
class merge
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,c=0;
        int x[]=new int[5];
        int y[]=new int[5];
        int z[]=new int[10];
        System.out.println("Enter of x");
        for(i=0;i<5;i++)
        {
            x[i]=in.nextInt();
        }
        System.out.println("Enter of y");
        for(i=0;i<5;i++)
        {
            y[i]=in.nextInt();
        }
        for(i=0;i<5;i++)
        {
            if(x[i]<0)
            {
                z[c]=x[i];
                c++;
            }
            if(y[i]<0)
            {
                z[c]=y[i];
                c++;
            }
        }
        for(i=0;i<5;i++)
        {
            if(x[i]>=0)
            {
                z[c]=x[i];
                c++;
            }
            if(y[i]>=0)
            {
                z[c]=y[i];
                c++;
            }
        }
        System.out.println("Values of z");
        for(i=0;i<10;i++)
        {
            System.out.println(z[i]);
        }
    }
}