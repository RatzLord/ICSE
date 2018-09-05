import java.util.*;
class q18
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,j,l,c=0,k=0;
        char ch,ch1,m='\u0000';
        String s;
        System.out.println("Enter a string");
        s=in.nextLine();
        s=s.toLowerCase();
        l=s.length();
        for(i=97;i<=122;i++)
        {
            ch=(char)i;
            for(j=0;j<l;j++)
            {
                ch1=s.charAt(j);
                if(ch==ch1)
                c++;
            }
            if(c>k)
            {
                k=c;
                m=ch;
            }
            c=0;
        }
        System.out.println("Character used max no. of times="+m);
    }
}