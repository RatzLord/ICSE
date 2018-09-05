class pat_super
{
    public static void main()
    {
        int i,j,c=1,k=0;
        for(i=1;i<=9;i+=2)
            {
                for(j=1;j<=i;j++)
                {
                    if(j<=k)
                    System.out.print(" ");
                    else
                    {
                        System.out.print(c);
                        c++;
                    }
                }
                System.out.println();
                k++;
            }
        }
    }