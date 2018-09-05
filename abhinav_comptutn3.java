import java.util.*;
class abhinav_comptutn3
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,l;
        char ch;
        String s,s1="",w="";
        System.out.println("Enter a string");
        s=in.nextLine();
        s=s+" ";
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            w=ch+w;
            else
            {
                s1=s1+w+" ";
                w="";
            }
        }
        System.out.println("New string="+s1);
    }
}