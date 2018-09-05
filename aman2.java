import java.util.*;
class aman2
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,l,c=0,j,k;
        char ch,ch1;
        String s,w="",s1="",s2="",s3="";
        System.out.println("Enter a string");
        s=in.nextLine();
        s=s+' ';
        l=s.length();
        k=s.indexOf(' ');
        for(i=0;i<k;i++)
        {
            ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            c++;
            else
            s1=s1+ch;
        }
        for(i=1;i<c;i++)
        s2=s2+' ';
        s1=s1+s2;
        s2="";
        c=0;
        for(i=k+1;i<l;i++)
        {
            ch1=s.charAt(i);
            if(ch1!=' ')
            w=w+ch1;
            else
            {
                for(j=0;j<w.length();j++)
                {
                    ch=w.charAt(j);
                    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                    c++;
                    else
                    s3=s3+ch;
                }
                for(j=1;j<=c;j++)
                s2=s2+' ';
                s1=s1+s2+s3;
                c=0;
                w="";
            }
        }
        System.out.println("New string="+s1);
    }
}