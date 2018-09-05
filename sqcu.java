import java.util.*;
class sqcu
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,rem=0;
        System.out.println("Enter a number");
        n=in.nextInt();
        while(n>0)
        {
            rem=n%10;
            if(rem/2==0)
            System.out.println(Math.pow(rem,2));
            else
            System.out.println(Math.pow(rem,3));
            n=n/10;
        }
    }
}