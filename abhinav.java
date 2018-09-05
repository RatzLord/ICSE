import java.util.*;
class abhinav
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,l,p,q,n;
        String s,m;
        System.out.println("Enter a date in dd/mm/yyyy format");
        s=in.next();
        p=s.indexOf('/');
        q=s.lastIndexOf('/');
        m=s.substring(p+1,q);
        n=Integer.valueOf(m);
        switch(n)
        {
            case 1:
            System.out.println("January");
            break;
            case 2:
            System.out.println("February");
            break;
            case 3:
            System.out.println("March");
            break;
            case 4:
            System.out.println("April");
            break;
            case 5:
            System.out.println("May");
            break;
            case 6:
            System.out.println("June");
            break;
            case 7:
            System.out.println("July");
            break;
            case 8:
            System.out.println("August");
            break;
            case 9:
            System.out.println("September");
            break;
            case 10:
            System.out.println("October");
            break;
            case 11:
            System.out.println("November");
            break;
            case 12:
            System.out.println("December");
            break;
        }
    }
}