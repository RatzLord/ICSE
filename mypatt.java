class mypatt  //rejected
{
    public static void main()
    {
        int i,j,k,n=2,c=0,no;
        long f=1l;
        for(i=1;i<=5;i++)
        {
            for(k=i;k<=5;k++)
            {
                while(true)
                {
                    for(j=1;j<=n;j++)
                    {
                        if(n%j==0)
                        c++;
                    }
                    if(c==2)
                    {
                        no=n;
                        n++;
                        c=0;
                        break;
                    }
                    else
                    {
                        n++;
                        c=0;
                    }
                }
                for(j=1;j<=no;j++)
                {
                    f=f*j;
                }
                System.out.print(f+" ");
                f=1;
            }
            System.out.println();
        }
    }
}