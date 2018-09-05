/**
 * Program to input length and breadth and find the area
 */
import java.util.*;
class rectangle0
{
    public static void main()
    {
        Scanner x=new Scanner(System.in);
        int len,bre,ar;
        System.out.println("Enter length and breadth");
        len=x.nextInt();
        bre=x.nextInt();
        ar=len*bre;
        System.out.println("Area of rectangle="+ar);
    }
}