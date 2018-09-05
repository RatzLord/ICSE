import java.util.*;
class factors_while
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i=1,n;
        System.out.println("Enter a number");
        n=in.nextInt();
        System.out.println("The factors are : ");
        while(i<n)
        {
            if(n%i==0)
            System.out.println(i+",");
            i++;
        }
    }
}