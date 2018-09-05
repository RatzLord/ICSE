import java.util.*;
class practice
{
    public static void main1()   // special word
    {
        Scanner in=new Scanner(System.in);
        int i,l,j,l1,f1=0,f2=0;
        char ch,ch1,ch2;
        String st,w="";
        System.out.println("Enter a string");
        st=in.nextLine();
        st=st+" ";
        l=st.length();
        for(i=0;i<l;i++)
        {
            ch=st.charAt(i);
            if(ch!=' ')
            w=w+ch;
            else
            {
                l1=w.length();
                for(j=0;j<l1-1;j++)
                {
                    ch1=w.charAt(j);
                    ch2=w.charAt(j+1);
                    if(ch1<ch2)
                    f1=1;
                    if(ch1>ch2)
                    f2=1;
                }
                if(f1==0 || f2==0)
                {
                    System.out.println("Special word="+w);
                }
                w="";
                f1=0;
                f2=0;
            }
        }
    }
    public static void main2()
    {
        Scanner in=new Scanner(System.in);
        int i,l;
        char ch,ch1;
        String st,st1="";
        System.out.println("Enter a string");
        st=in.nextLine();
        st=" "+st;
        l=st.length();
        for(i=0;i<l-1;i++)
        {
            ch=st.charAt(i);
            ch1=st.charAt(i+1);
            if(ch==' ')
            ch1=Character.toUpperCase(ch1);
            st1=st1+ch1;
        }
        System.out.println("New string="+st1);
    }
    /* prog. to replace all the repeated digits to 0 except 1st digit
     * e.g.  input : 1561523
     *       output : 10000230
     */
    public static void main3()
    {
        Scanner in=new Scanner(System.in);
        int n,n1,c=0,i,d,c1=0,k=1,s=0,p=0;
        System.out.println("Enter a no.");
        n=in.nextInt();
        n1=n;
        while(n1>0)
        {
            c++;
            n1/=10;
        }
        // now c stores the length of no. which is equal to the pos. of 1st digit
        for(i=1;i<=9;i++)
        {
            n1=n;
            while(n1>0)
            {
                d=n1%10;
                if(d==i)
                c1++;
                n1/=10;
            }
            n1=n;
            while(n1>0)
            {
                d=n1%10;
                p++;       // p will have the value of the pos. of digit backwards
                if(d==i)
                {
                    if(c1<2 || p==c)
                    s=d*k+s;
                }
                else
                {
                    s=d*k+s;
                }
                k*=10;
                n1/=10;
            }
            n=s;    // rewriting value of n after removing the duplicate digits(if any)
            s=0;
            c1=0;
            p=0;
            k=1;
        }
        System.out.println("New digit="+n);
    }
}