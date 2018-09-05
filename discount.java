import java.util.*;
class discount
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int p1,p2,p3,tp;
        double dis,pay,save;
        System.out.println("Welcome to BIG DISCOUNT Cash Counter ");
        System.out.println("                                           ");
        System.out.println("*******************************************");
        System.out.println("*          Our DISCOUNT SCHEME is         *");
        System.out.println("*         ************************        *");
        System.out.println("*       TOTAL PRICE      |    DISCOUNT     *");
        System.out.println("*-----------------------------------------*");
        System.out.println("*     below Rs.4000      |       10%      *");
        System.out.println("*   Rs.4000 - Rs.10000   |       20%      *");
        System.out.println("*     above Rs.10000     |       25%      *");
        System.out.println("*******************************************");
        System.out.println("                                           ");
        System.out.println("Please enter the price of your 3 items");
        p1=in.nextInt();
        p2=in.nextInt();
        p3=in.nextInt();
        tp=p1+p2+p3;
        System.out.println("The total price of your 3 items are : Rs."+tp);
        if(tp<4000)
        {
            dis=0.10*tp;
            System.out.println("You are getting 10% discount!!");
        }
        else if(tp>=4000 && tp<=10000)
        {
            dis=0.20*tp;
            System.out.println("You are getting 20% discount!!!!!!!!");
        }
        else
        {
            dis=0.25*tp;
            System.out.println("You are getting 25% discount!!!!!!!!!!!!!");
        }
        pay=tp-dis;
        save=tp-pay;
        System.out.println("Please pay : Rs."+pay);
        System.out.print("You save Rs."+save);
        System.out.println("!!!!");
        System.out.println("Thank You for shopping with us!");
        System.out.println("PLEASE VISIT AGAIN");
    }
}