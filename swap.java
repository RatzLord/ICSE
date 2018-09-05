/**WAP to input two numbers and swap their values without using the third variable and the + operator. 
*Print the original values and the changed values. 
 */
import java.util.*;
class swap
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a,b;
        System.out.println("Enter 2 nos.");
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("Nos. before swapping=");
        System.out.println(a);
        System.out.println(b);
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("Nos. after swapping=");
        System.out.println(a);
        System.out.println(b);
    }
}
