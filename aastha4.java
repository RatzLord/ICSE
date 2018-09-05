import java.util.*;
class aastha4
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,l,j,p=0;
        char ch,ch1;
        String s,s1="";
        System.out.println("Enter a string");
        s=in.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(p==0 && ch==' ')
            {
                s1=s1+ch;
                p=1;
            }
            else if(ch==' ')
            {
            for(j=i+1;j<l;j++)
            {
                ch1=s.charAt(j);
                if(ch1!=' ')
                { p=0;
                break;
            }
                
                    else
                    i++;
                }
            }
            else
            s1=s1+ch;
        }
        System.out.println("New string="+s1);
    }
}