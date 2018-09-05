import java.util.*;
class small
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 3 numbers");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if(a<b && a<c)
        {
            System.out.println("Smallest number is "+a);
        }
        else if(b<a && b<c)
        {
            System.out.println("Smallest number is "+b);
        }
        else
        {
            System.out.println("Smallest number is "+c);
        }
    }
}