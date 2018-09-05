import java.util.*;
class aishwarya2
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,n,k=1,j,c=0,s;
        System.out.println("Enter no. of terms");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            while(true)
            {
                for(j=1;j<=k;j++)
                {
                    if(k%j==0)
                    c++;
                }
                if(c==2)
                break;
                c=0;
                k++;
            }
            s=i+k;
            System.out.print(s+",");
        }
    }
}