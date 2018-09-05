import java.util.*;
class triangle
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the angles");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if(a+b+c!=180)
        {
            System.out.println("Please enter the correct angles");
        }
        else if(a==b && b==c && c==a)
        {
            System.out.println("It is an equilateral triangle");
        }
        else if(a==b || b==c || c==a)
        {
            System.out.println("It is an isosceles triangle");
        }
        else
        {
            System.out.println("It is a scalene triangle");
        }
    }
}