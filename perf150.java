class perf150
{
    public static void main()
    {
        int i,j,s;
        System.out.print("The perfect nos. are=");
        for(i=1;i<100;i++)
            {
                s=0;
                for(j=1;j<i;j++)
                {
                    if(i%j==0)
                    s=s+j;
                }
                if(s==i)
                System.out.print(i+",");
            }
    }
}