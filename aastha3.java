import java.util.*;
class aastha3
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,l,l1;
        char ch;
        String s,w,w1,s1="";
        System.out.println("Enter a string and part of word to be removed");
        s=in.nextLine();
        w=in.next();
        l1=w.length();
        for(i=1;i<=l1;i++)
        s=s+" ";
        l=s.length();
        for(i=0;i<(l-l1);i++)
        {
            ch=s.charAt(i);
            w1=s.substring(i,i+l1);
            if(w.equalsIgnoreCase(w1))
            i=i+l1-1;
            else
            s1=s1+ch;
        }
        System.out.println("Final string="+s1);
    }
}