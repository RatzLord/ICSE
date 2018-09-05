class patt_super
{
    public static void main()
    {
        int i,j,l=5;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(j<l)
                System.out.print("@");
                else
                    {
                    if(i%2==0)
                    {
                        if(j%2==0)
                        System.out.print("1");
                        else
                        System.out.print("0");
                    }
                    else
                    {
                        if(j%2==0)
                        System.out.print("0");
                        else
                        System.out.print("1");
                    }
                }
            }
            System.out.println();
            l--;
        }
    }
}