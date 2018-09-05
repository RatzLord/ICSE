import java.util.*;
class shekhar
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,c=0,d,m,n,k=0,c1=0,pal=0,j;
        System.out.println("Enter limit m less than 3000");
        m=in.nextInt();
        System.out.println("Enter limit n less than 3000");
        n=in.nextInt();
        System.out.println("Prime palindrome nos. are");
        for(i=m;i<=n;i++)
        {
            k=i;
            while(k>0)
            {
                d=k%10;
                pal=pal*10+d;
                k=k/10;
            }
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                c++;
            }
            if(pal==i && c==2)
            {
                System.out.print(i+",");
                c1++;
            }
            d=0;
            pal=0;
            c=0;
            k=0;
        }
        System.out.println();
        System.out.println("Frequency="+c1);
    }
}