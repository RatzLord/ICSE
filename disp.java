import java.util.*;
class disp
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int x,term=0,i;
        System.out.println("Enter value of x");
        x=in.nextInt();
        for(i=1;i<=10;i++)
        {
            term=(2*x)+2;
            if(term%4==0)
            break;
            System.out.println("Term="+term);
        }
    }
}