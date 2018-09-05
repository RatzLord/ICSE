import java.util.*;
class vishal
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,r,s=0,c=0,x;
        System.out.println("Enter a no.");
        n=in.nextInt();
        while(n>0)
        {
            x=n;
            while(n>0)
            {
                r=n%10;
                s=s+r;
                n=n/10;
            }
            n=x/s;
            if(x%s==0)
            c++;
            else
            break;
            s=0;
        }
        if(c==2)
        System.out.println("Multiple harshad");
        else
        System.out.println("Sorry, go try another program");
    }
}