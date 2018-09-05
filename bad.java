import java.util.*;
class bad
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,j,ch,c=1,k=0,l=5,a;
        System.out.println("Enter 1 or 2");
        ch=in.nextInt();
        switch(ch)
        {
            case 1:
            for(i=1;i<=9;i+=2)
            {
                for(j=1;j<=i;j++)
                {
                    if(j<=k)
                    System.out.print(" ");
                    else
                    {
                        System.out.print(c);
                        c++;
                    }
                }
                System.out.println();
                k++;
            }
            break;
            case 2:
            for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(j<l)
                System.out.print("@");
                else
                    {
                    if(i%2==0)
                    {
                        if(j%2==0)
                        System.out.print("1");
                        else
                        System.out.print("0");
                    }
                    else
                    {
                        if(j%2==0)
                        System.out.print("0");
                        else
                        System.out.print("1");
                    }
                }
            }
            System.out.println();
            l--;
        }
            break;
            default:
            System.out.println("Wrong");
            }
    }
}
