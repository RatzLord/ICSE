import java.util.*;
class Easy_travel
{
    String Name;
    int cust_id,ticket_amt;
    double discount,net_amt;
    Easy_travel()
    {
        Name="";
        cust_id=0;
        ticket_amt=0;
        discount=0.0;
        net_amt=0.0;
    }
    void input()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter name, customer ID and ticket amount");
        Name=in.nextLine();
        cust_id=in.nextInt();
        ticket_amt=in.nextInt();
    }
    void calculate()
    {
        if(ticket_amt<35001)
        {
            discount=(10/100.8)*ticket_amt;
            net_amt=ticket_amt-discount;
        }
        else if(ticket_amt>=35001 && ticket_amt<=55000)
        {
            discount=(12/100.8)*ticket_amt;
            net_amt=ticket_amt-discount;
        }
        else if(ticket_amt>=55001 && ticket_amt<=70000)
        {
            discount=(16/100.8)*ticket_amt;
            net_amt=ticket_amt-discount;
        }
        else if(ticket_amt>70000)
        {
            discount=(18/100.8)*ticket_amt;
            net_amt=ticket_amt-discount;
        }
    }
    void display()
    {
        System.out.println("Name\tCust_id\tTicket charges\tdiscount\tNet amount");
        System.out.println(Name+"\t"+cust_id+"\t"+ticket_amt+"\t"+discount+"\t"+net_amt);
    }
    public static void main()
    {
        Easy_travel ob=new Easy_travel();
        ob.input();
        ob.calculate();
        ob.display();
    }
}