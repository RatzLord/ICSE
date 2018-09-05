import java.util.*;
class aman
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,l,p=0;
        char ch;
        String s,w="",w2="",wsl="",wl="";
        System.out.println("enter a String");
        s=in.nextLine();
        s=s+" ";
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            w=w+ch;
            else
            {
                p++;
                if(p==2)
                w2=w;
                wsl=wl;
                wl=w;
                w="";
            }
        }
        if(w2.equalsIgnoreCase(wsl))
        System.out.println("Equal");
        else
        System.out.println("Not Equal");
    }
}
