import java.util.*;
class tuition
{
    public static void main()
    {
    Scanner in=new Scanner(System.in);
    int i,n,s,l,d;
    char ch;
    String st,w="";
    System.out.println("Enter a word");
    st=in.nextLine();
    l=st.length();
    for(i=0;i<l;i++)
    {
        ch=st.charAt(i);
        w=w+(ch-64);
    }
    n=Integer.valueOf(w);
    s=n;
    while(s>9)
    {
        n=s;
        s=0;
        while(n>0)
        {
            d=n%10;
            s=s+d*d;
            n=n/10;
        }
    }
    if(s==1)
    System.out.println("Happy word");
    else
    System.out.println("Not Happy word");
}
}