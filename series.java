import java.util.*;
class series
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,n;
        String s="1";
        System.out.println("Enter n");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            s=s+"1";
            System.out.print('s'+",");
        }
    }
}