import java.util.*;
class tri
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a,b,c;
        double s,area;
        System.out.println("Enter the sides");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        s=(a+b+c)/2.0;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area="+area);
    }
}