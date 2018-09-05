class pat
{
    public static void main()
    {
        int i,j;
        for(i=5;i>=1;i--)
        {
            for(j=1;j<=5;j++)
            {
                if(j>=i)
                System.out.print("a");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}