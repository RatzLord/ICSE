import java.util.*;
class n_aastha3
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,l;
        char ch;
        String s,w="day",w1,s1="";
        System.out.println("Enter a string");
        s=in.nextLine();
        s1=s.replace(w,"");
        System.out.println("New string="+s1);
    }
}