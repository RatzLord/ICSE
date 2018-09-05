import java.util.*;
class shekhar2
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,l,c=0,m=0;
        char ch;
        String s,w="",wm="";
        System.out.println("Enter a string");
        s=in.nextLine();
        s=s+" ";
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            c++;
            if(ch!=' ')
            w=w+ch;
            else
            {
                if(c>m)
                {
                    m=c;
                    wm=w;
                }
                c=0;
                w="";
            }
        }
        System.out.println("Max vowel word="+wm);
    }
}