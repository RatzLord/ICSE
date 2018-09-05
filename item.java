import java.util.*;
class item
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,n,item,c=0,k=0,t,temp;
        System.out.println("Enter size");
        n=in.nextInt();
        int x[]=new int[n+1];
        System.out.println("Enter values");
        for(i=0;i<n;i++)
        x[i]=in.nextInt();
        System.out.println("Enter value to be searched");
        item=in.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]==item)
            {
                c++;
                k=i;
                n--;
                break;
            }
        }
        if(c==1)
        {
            t=x[0];
            x[0]=x[k];
            for(i=k;i>=2;i--)
            {
                x[i]=x[i-1];
            }
            x[1]=t;
        }
        else
        x[n]=item;
        System.out.println("Values are");
        for(i=0;i<(n+1);i++)
        System.out.println(x[i]);
    }
}