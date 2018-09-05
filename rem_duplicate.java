import java.util.*;
class rem_duplicate
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,j,l,c=0;
        char ch,ch1;
        String s,s1="",w="",w1="";
        System.out.println("Enter a sentence");
        s=in.nextLine();
        s=s+' ';
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            w=w+ch;
            else
            {
                for(j=0;j<l;j++)
                {
                    ch1=s.charAt(j);
                    if(ch1!=' ')
                    w1=w1+ch1;
                    else
                    {
                        if(w.equalsIgnoreCase(w1))
                        {
                            if(c==0)
                            s1=s1+w1+' ';
                            c=1;
                        }
                        else
                        s1=s1+w1+' ';
                        w1="";
                    }
                }
                c=0;
                s=s1;
                l=s.length();
                s1="";
                w="";
            }
        }
        System.out.println("String after removing all duplicate words="+s);
    }
}