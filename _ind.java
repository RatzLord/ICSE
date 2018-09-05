class _ind
{
    public static void main()
    {
        int a=10,b=0,c=10,p=0;  char z='\u0000';
        String s1="TFy!QJu ROo TNn(ROo)SLq SLq ULo+UHs UJq TNn*RPn/QPbEWS_JSWQAIJO^NBELPeHBFHT}TnALVlBLOFAkHFOuFETpHCStHAUFAgcEAelclcn^r^r\\tZvYxXyT|S~Pn SPm SOn TNn ULo0ULo#ULo-WHq!WFs XDt!";
        a=s1.charAt(b);
        while(a!=0)
        {
            if(b<170)
            {
                a=s1.charAt(b);
                b++;
                while(a>64)
                {
                    a--;
                    if (++c=='Z')
                    {
                        c/=9;
                        System.out.print('\n');
                        p=0;
                    }
                    else
                    {
                        z=(char)(94 ^ (b & 0x01));
                        if(z==94)
                        System.out.print(z);
                        else
                        {
                            p++;
                            if(p%2!=0)
                            System.out.print("`");
                            else
                            System.out.print(" ");
                        }
                    }
                }
            }
            else
            break;
        }
    }
}