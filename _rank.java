import java.util.*;
class _rank
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,i,j,t,c=0;
        String s;
        System.out.println("Enter no. of students");
        n=in.nextInt();
        String a[]=new String[n];
        int b[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter name");
            a[i]=in.next();
            System.out.println("Enter total");
            b[i]=in.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(b[j]<b[j+1])
                {
                    t=b[j];
                    b[j]=b[j+1];
                    b[j+1]=t;
                    s=a[j];
                    a[j]=a[j+1];
                    a[j+1]=s;
                }
            }
        }
        System.out.println("****RANKS****");
        for(i=0;i<n;i++)
        {
            System.out.println("NAME:"+a[i]);
            System.out.println("TOTAL:"+b[i]);
            if(i!=(n-1))
            {
                for(j=i;j<(n-1);j++)
                {
                    if(b[j]==b[j+1])
                    {
                System.out.println("RANK:"+(i+1));
                System.out.println("NAME:"+a[j+1]);
                System.out.println("TOTAL:"+b[j+1]);
                System.out.println("RANK:"+(i+1));
                c++;
            }
            else
            System.out.println("RANK:"+(i+1));
        }
    }
}
}
}