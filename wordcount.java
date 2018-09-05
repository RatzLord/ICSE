import java.util.*;
class wordcount
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,c=0;
        char ch,sp=' ';
        String s;
        System.out.println("Enter a string");
        s=in.nextLine();
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch==sp)
            c++;
        }
        System.out.println("No. of words="+(c+1));
    }
}