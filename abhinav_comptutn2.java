import java.util.*;
class abhinav_comptutn2
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,k=0;
        char ch;
        String a[]=new String[10];
        String b[]=new String[5];
        String c[]=new String[15];
        System.out.println("Enter 10 names");
        for(i=0;i<10;i++)
        {
            a[i]=in.next();
        }
        System.out.println("Enter 5 names");
        for(i=0;i<5;i++)
        {
            b[i]=in.next();
        }
        for(i=0;i<10;i++)
        {
            ch=a[i].charAt(0);
            if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u')
            {
                c[k]=a[i];
                k++;
            }
        }
        for(i=0;i<5;i++)
        {
            ch=b[i].charAt(b[i].length()-1);
            if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u')
            {
                c[k]=b[i];
                k++;
            }
        }
        System.out.println("3rd array=");
        for(i=0;i<k;i++)
        {
            System.out.println(c[i]);
        }
    }
}