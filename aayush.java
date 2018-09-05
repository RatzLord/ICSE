import java.util.*;
class aayush
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,n1,s,d,k=1;
        System.out.println("Enter a no.");
        n=in.nextInt();
        while(n>9)
        {
            n1=n;
            s=0;
            while(n1>0)
            {
                d=n1%10;
                s=s+d;
                n1=n1/10;
            }
            if(n%s!=0)
            {
                k=0;
                break;
            }
            else
            {
                n=n/s;
            }
        }
        if(k==1)
        {
            System.out.println("Multiple harshad no.");
        }
        else
        {
            System.out.println("Not a Multiple harshad no.");
        }
    }
}