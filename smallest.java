import java.util.*;
class smallest
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a,b,c,min;
        System.out.println("Enter the 3 numbers");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if(a<b && a<c)
        {
            min=a;
        }
        else if(b<c && b<a)
        {
            min=b;
        }
        else
        {
            min=c;
        }
        System.out.println("Smallest number="+min);
    }
}        