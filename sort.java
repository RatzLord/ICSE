import java.util.*;
class sort
{
    int n;
    int a[];
    void input()
    {
        int i;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of array");
        for(i=0;i<n;i++)
        a[i]=in.nextInt();
    }
    void arrange()
    {
        int i,j,t,p;
        for(i=0;i<n-1;i++)
        {
            p=i;
            for(j=i+1;j<n;j++)
            {
                if(a[p]>a[j])
                p=j;
            }
            t=a[p];
            a[p]=a[i];
            a[i]=t;
        }
    }
    void display()
    {
        int i;
        System.out.println("Arranged array=");
        for(i=0;i<n;i++)
        System.out.println(a[i]);
    }
    public static void main()
    {
        sort ob=new sort();
        ob.input();
        ob.arrange();
        ob.display();
    }
}