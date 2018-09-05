import java.util.*;
class vowels
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,l;
        char ch;
        String s,s1="";
        System.out.println("Enter a word");
        s=in.next();
        s=s.toLowerCase();
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            s1=s1+ch;
        }
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'))
            s1=s1+ch;
        }
        System.out.println("New word="+s1);
    }
}