import java.util.*;
class factors_dowhile
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i=1,n;
        System.out.println("Enter a number");
        n=in.nextInt();
        System.out.println("The factors are : ");
        do
        {
            if(n%i==0)
            System.out.println(i+",");
            i++;
        }
        while(i<n);
    }
}