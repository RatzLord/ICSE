class output
{ 
    public static void main()
    {
        int k=1,i=12;
        while(++i<18)
        {
            if(i%4>1)
            continue;
            else
            {
                k*=i;
                System.out.println(i+" "+k);
            }
        }
    }
    public static void main2()
    {
        double m=2.5;
        int i=1;
        do
        {
            //char c=(int)(m)+67;
            //System.out.println(c);
            i++;
        }
        while(i<5);
        m++;
        System.out.println("m="+m);
    }
    public static void main3()
    {
        String s="TOWER";
        int i,l=s.length();
        for(i=0;i<l;l--)
        {
            System.out.println(s.substring(i,l));
        }
    }
}