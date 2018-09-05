import java.util.*;
class consecutive
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,l,n;
        char ch,ch1;
        String s="The child tried to stretch itself.",w;
        System.out.println("Enter any to run");
        w=in.next();
        l=s.length();
        for(i=0;i<l-1;i++)
        {
            ch=s.charAt(i);
            ch1=s.charAt(i+1);
            if(ch-ch1==-1 || ch-ch1==1)
            {
                if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'))
                System.out.print(" "+ch+ch1);
            }
        }
    }
}