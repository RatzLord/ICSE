import java.util.*;
class pap
{
    public static void main1()
    {
        Scanner in=new Scanner(System.in);
        int i,k,l;
        char ch;
        String s;
        System.out.println("Enter ch and s");
        ch=in.next().charAt(0);
        s=in.next();
        l=s.length();
        for(i=l;i>0;i--)
        {
            System.out.print(s.substring(0,i));
            for(k=l;k>i;k--)
            System.out.print(ch);
            System.out.println();
        }
    }
    public static void main2()
    {
        Scanner in=new Scanner(System.in);
        int n,i,j,l;
        char ch;
        String s,s1="";
        System.out.println("Enter n");
        n=in.nextInt();
        s=Integer.toString(n);
        l=s.length();
        for(i=48;i<=57;i++)
        {
            for(j=0;j<l;j++)
            {
                ch=s.charAt(j);
                if(ch==(char)i)
                s1=ch+s1;
            }
        }
        System.out.println("Arranged no.="+s1);
    }
    public static void main3()
    {
        Scanner in=new Scanner(System.in);
        int i,n,l,j,l1;
        char ch;
        String t;
        System.out.println("Enter n");
        n=in.nextInt();
        String a[]=new String[n];
        System.out.println("Enter n names");
        for(i=0;i<n;i++)
        {
            a[i]=in.next();
            a[i]=a[i].toUpperCase();
        }
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                l=a[j].length();
                l1=a[j+1].length();
                if(l>l1)
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
                else if(l==l1)
                {
                    if(a[j].compareTo(a[j+1])>0)
                    {
                        t=a[j];
                        a[j]=a[j+1];
                        a[j+1]=t;
                    }
                }
            }
        }
        System.out.println("Sorted array=");
        for(i=0;i<n;i++)
        System.out.println(a[i]);
    }
}