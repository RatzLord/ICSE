import java.util.*;
class duplicate
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,l,j;
        char ch,ch1;
        String s,w="",w1="",s1="";
        System.out.println("Enter a string");
        s=in.nextLine();
        s=s.toUpperCase();
        s=" "+s;
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            w=w+ch;
            else
            {
                for(j=l;j>(i+1);j--)
                {
                    ch1=s.charAt(j);
                    if(ch!=' ')
                    w1=ch1+w1;
                    else
                    {
                        if(w1.equals(w))
                        continue;
                        else
                        s1=s1+w1;
                        w1="";
                    }
                }
                w="";
            }
        }
        System.out.println("New string="+s1);
    }
}