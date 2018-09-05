import java.util.*;
class n_happy
{
    static int sum(int n)
    {
        int s,i,d;
        s=0;
        for(i=n;i!=0;i=i/10)
        {
            d=i%10;
            s=s+d*d;
        }
        return s;
    }
    public static void main()
    {
        Scanner sn=new Scanner(System.in);
        int num,s;
        System.out.println("enter a number");
        num=sn.nextInt();
        s=num;
        while(s>9)
        {
            s=sum(s);
            System.out.println("s="+s);
        }
        
        if(s==1)
        System.out.println(num+" is happy number");
        else
        System.out.println(num+" is not happy number");
    }
}