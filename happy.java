import java.util.*;
class happy
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,l,n,d,s=0;
        char ch;
        String st,s1="";
        System.out.println("Enter a word");
        st=in.next();
        st=st.toUpperCase();
        l=st.length();
        for(i=0;i<l;i++)
        {
            ch=st.charAt(i);
            s1=s1+(ch-64);
        }
        n=Integer.valueOf(s1);
        s=n;
        while(s>9)
        {
            n=s;
            s=0;
            while(n>0)
            {
                d=n%10;
                s=s+d*d;
                n/=10;
            }
        }
        if(s==1)
        System.out.println("Happy word");
        else
        System.out.println("Not Happy word");
    }
}