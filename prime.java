import java.util.*;
class prime
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,n,c=0;
        System.out.println("Enter a number");
        n=in.nextInt();
        for(i=2;(n%i)==0;i++)
        {
            c++;
        }
        switch(c)
        {
            case 0:
            System.out.println("The number is prime");
            break;
            default:
            System.out.println("The number is not prime");
        }
    }
}