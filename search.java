import java.util.*;
class search
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,l,l1,c=0;
        String s,w,w1;
        System.out.println("Enter a sentence in lower case");
        s=in.nextLine();
        System.out.println("Enter search word");
        w=in.next();
        l=s.length();
        l1=w.length();
        for(i=0;i<=(l-l1);i++)
        {
            w1=s.substring(i,i+l1);
            if(w.equals(w1))
            c++;
        }
        System.out.println("Frequency="+c);
    }
}