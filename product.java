import java.util.*;
class product
{
    public static void main()
    {
        Scanner x=new Scanner(System.in);
        int cp,sp,profit,loss;
        System.out.println("Enter cost price and selling price");
        cp=x.nextInt();
        sp=x.nextInt();
        if(sp>=cp)
        {
            profit=sp-cp;
            System.out.println("Profit is made of Rs."+profit);
        }
        else
        {
            loss=cp-sp;
            System.out.println("Loss is made of Rs."+loss);
        }
    }
}