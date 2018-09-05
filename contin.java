import java.util.*;
class contin
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,i;
        for(i=1;i<=10;i++)
        {
            System.out.println("Enter a no.");
            n=in.nextInt();
            if(i%2==0)
            continue;
            System.out.println("The odd no is="+i);
        }
    }
}