import java.util.*;
class AP
{
    private static void functions(int n,int a,int d,int ap[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 1 to find sum");
        System.out.println("Enter 2 to find the value of the nth term");
        System.out.println("Enter 3 to search if a value is present or not");
        int ch=in.nextInt();
        switch(ch)
        {
            case 1:
            sum(n,a,d,ap);
            break;
            case 2:
            term(n,a,d,ap);
            break;
            case 3:
            search(n,a,d,ap);
            break;
            default:
            System.out.println("Wrong choice");
        }
    }
    private static void end(int n,int a,int d,int ap[])
    {
        Scanner in=new Scanner(System.in);
        int u;
        System.out.println("Do you want to try the other functions?(1 for yes, 2 for no)");
        u=in.nextInt();
        switch(u)
        {
            case 1:
            functions(n,a,d,ap);
            break;
            case 2:
            System.out.println("Well, thanks for running this program!!  :)");
            break;
            default:
            System.out.println("Wrong choice");
        }
    }
    private static void sum(int n,int a,int d,int ap[])
    {
        Scanner in=new Scanner(System.in);
        int ch,n1;
        double s;
        System.out.println("Enter 1 to find sum of all terms");
        System.out.println("Enter 2 to find sum till nth term");
        ch=in.nextInt();
        switch(ch)
        {
            case 1:
            s=(n/2.0)*(2*a+(n-1)*d);
            System.out.println("Sum of all terms is "+s);
            break;
            case 2:
            System.out.println("Enter the limit");
            n1=in.nextInt();
            if(n1>n)
            System.out.println("Limit out of range of AP");
            else
            {
                s=(n1/2.0)*(2*a+(n1-1)*d);
                System.out.println("Sum till nth term is "+s);
            }
            break;
            default:
            System.out.println("Wrong choice");
        }
        end(n,a,d,ap);
    }
    private static void term(int n,int a,int d,int ap[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the position");
        int p=in.nextInt();
        if(p>n)
        System.out.println("Position out of range of AP");
        else
        {
            int no=a+(p-1)*d;
            System.out.println("The value of position entered is "+no);
        }
        end(n,a,d,ap);
    }
    private static void search(int n,int a,int d,int ap[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value to be searched");
        int no=in.nextInt();
        int p=0,i,f=0;
        for(i=0;i<n;i++)
        {
            if(no==ap[i])
            {
                p=i+1;
                f=1;
            }
        }
        if(f==1)
        System.out.println("The position of the value entered is "+p);
        else
        System.out.println("Not found");
        end(n,a,d,ap);
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,i,d,d1,a;
        System.out.println("Enter no. of terms of AP");
        n=in.nextInt();
        int ap[]=new int[n];
        System.out.println("Enter first 3 terms of AP");
        for(i=0;i<3;i++)
        ap[i]=in.nextInt();
        d=ap[1]-ap[0];
        d1=ap[2]-ap[1];
        if(d!=d1)
        System.out.println("The list of nos. entered are not in AP!!");
        else
        {
            a=ap[0];
            for(i=3;i<n;i++)
            {
                ap[i]=a+(i*d);
            }
            functions(n,a,d,ap);
        }
    }
}