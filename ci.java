import java.util.*;
class ci
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int p,r,t;
        String p1,r1,t1;
        char ch;
        double ci,a;
        do
        {
            System.out.println("Enter principle");
            p1=in.next();
            ch=p1.charAt(0);
            if(Character.isLetter(ch))
            break;
            p=Integer.valueOf(p1);
            System.out.println("Enter rate");
            r1=in.next();
            ch=r1.charAt(0);
            if(Character.isLetter(ch))
            break;
            r=Integer.valueOf(r1);
            System.out.println("Enter time");
            t1=in.next();
            ch=t1.charAt(0);
            if(Character.isLetter(ch))
            break;
            t=Integer.valueOf(t1);
            a=p*Math.pow((1.0+r/100.0),t);
            ci=a-p;
            System.out.println("Amount="+a);
            System.out.println("CI="+ci);
        }
        while(true);
        System.out.println("Program terminated");
    }
}