import java.util.*;
class pythagorean
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a,b,c,sum;
        System.out.println("Enter the 3 sides of triangle");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        a=a*a;
        b=b*b;
        c=c*c;
        sum=a+b;
        if(sum==c)
        {
            System.out.println("They are pythagorean triplets");
        }
        else
        {
            System.out.println("They are not pythagorean triplets");
        }
    }
}