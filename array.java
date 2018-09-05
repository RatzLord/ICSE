import java.util.*;
class array
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,c=0,t=0,i;
        double add=0.0;
        System.out.println("Enter no.of values");
        n=in.nextInt();
        int a[]=new int[n];
        System.out.println("enter values of array");
        for(i=0;i<a.length;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("The values entered are-");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        for(i=0;i<n;i++)
        {
            if(a[i]>10 && a[i]<100)
            c++;
            if((a[i]%2)!=0)
            {
                add=add+a[i];
                t++;
            }
        }
        System.out.println("No. of 2 digit nos.="+c);
        System.out.println("sum of odd nos.="+add);
        System.out.println("average of odd nos.="+(add/t));
    }
}