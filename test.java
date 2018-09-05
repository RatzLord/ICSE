import java.util.*;
class test
{
    public static void code1()
    {
        double n[]={1.5,2.22,3.54,78.56,26.43};
        int i,r,c;
        for(i=0,c=0;i<n.length;i++)
        {
            r=(int)(n[i]);
            if(n[i]-r>0.50)
            System.out.println(n[i]*2+(c+2));
        }
    }
    public static void code2()
    {
        System.out.println("Math.rint(-9.56)="+Math.rint(-9.56));
        System.out.println("Math.round(-9.56)="+Math.round(-9.56));
        System.out.println("Math.abs(-9.56)="+Math.abs(-9.56));
        System.out.println("Math.ceil(-9.56)="+Math.ceil(-9.56));
        System.out.println("Math.floor(-9.56)="+Math.floor(-9.56));        
    }
    public static void code3()
    {
        int i=2,j=3;
        float f=4.0f;
        double d=5.0;
        System.out.println("Output of (int)(i+f)/(j*d)="+(int)(i+f)/(j*d));
    }
    public static void code4()
    {
        int i,l,l1;
        char ch;
        String s,w,w1,s1="";
        //input of s and w to be done here
        s="Rdayadayviday dayidays grdayedayat";
        w="day";
        l1=w.length();
        for(i=1;i<=l1;i++)
        s=s+" ";
        l=s.length();
        for(i=0;i<(l-l1);i++)
        {
            ch=s.charAt(i);
            w1=s.substring(i,i+l1);
            if(w.equalsIgnoreCase(w1))
            i=i+l1-1;
            else
            s1=s1+ch;
        }
        System.out.println("Final string="+s1);
    }
    public static void code5()
    {
        /* Printing the following series-
         * 7  14  17  21  27  28 .... n terms
         */
        Scanner in=new Scanner(System.in);
        int i,n,a=2,b=0;
        System.out.println("Enter no. of terms");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            System.out.print((7*a++)+"  ");
            else
            {
                System.out.print((7+b)+"  ");
                b+=10;
            }
        }
    }
    public static void code6()
    {
        /* After getting some info., it is found that the series in code5 is called printing 
         * all BUZZ nos.(nos. which are either divisible by 7 or end with 7.
         * Also, if the logic in code5 is used, the 7th term(37) will be more than the 8th term(35)
         * Thus, the following logic should be used
         */
        Scanner in=new Scanner(System.in);
        int n,k=1,c=0;
        System.out.println("Enter no. of terms");
        n=in.nextInt();
        while(c<=n)
        {
            if(k%7==0 || k%10==7)
            {
                System.out.print(k+"  ");
                c++;
            }
            k++;
        }
    }
    public static void code7() throws Exception
    {
        /* program for testing exeptional ways of printing an arrays of different data types
         * made it as a menu driven program for ease
         */
        Scanner in=new Scanner(System.in);
        int ch;
        byte b[]={1,2,3,4,5};
        short s[]={1,2,3,4,5};
        int i[]={1,2,3,4,5};
        long l[]={1,2,3,4,5};
        char c[]={'A','B','C','D','E'};
        float f[]={1.0f,2.0f,3.0f,4.0f,5.0f};
        double d[]={1.0,2.0,3.0,4.0,5.0};
        boolean bl[]={true,false,true,false,true};
        String st[]={"This ","is ","a ","test ","program."};
        System.out.println("****MENU****");
        System.out.println("1 = System.out.println(b);");
        System.out.println("2 = System.out.println(b[]);");
        System.out.println("3 = System.out.println(s);");
        System.out.println("4 = System.out.println(s[]);");
        System.out.println("5 = System.out.println(i);");
        System.out.println("6 = System.out.println(i[]);");
        System.out.println("7 = System.out.println(l);");
        System.out.println("8 = System.out.println(l[]);");
        System.out.println("9 = System.out.println(c);");
        System.out.println("10 = System.out.println(c[]);");
        System.out.println("11 = System.out.println(f);");
        System.out.println("12 = System.out.println(f[]);");
        System.out.println("13 = System.out.println(d);");
        System.out.println("14 = System.out.println(d[]);");
        System.out.println("15 = System.out.println(st);");
        System.out.println("16 = System.out.println(st[]);");
        System.out.println("17 = System.out.println(bl);");
        System.out.println("18 = System.out.println(bl[]);");
        System.out.println("Enter your choice");
        System.out.println("You can enter many times; enter 0 to end");
        while(true)
        {
            try {
            ch=in.nextInt();
            if(ch==0)
            break;
            switch(ch)
            {
                case 1 : System.out.println(b);     break;
                case 2 : //System.out.println(b[]);   <--it is giving error!!
                System.out.println("Not possible!!");  break;
                case 3 : System.out.println(s);     break;
                case 4 : //System.out.println(s[]);
                System.out.println("Not possible!!");  break;
                case 5 : System.out.println(i);     break;
                case 6 : //System.out.println(i[]);
                System.out.println("Not possible!!");  break;
                case 7 : System.out.println(l);     break;
                case 8 : //System.out.println(l[]);
                System.out.println("Not possible!!");  break;
                case 9 : System.out.println(c);     break;
                case 10 : //System.out.println(c[]);
                System.out.println("Not possible!!");  break;
                case 11 : System.out.println(f);     break;
                case 12 : //System.out.println(f[]);
                System.out.println("Not possible!!");  break;
                case 13 : System.out.println(d);     break;
                case 14 : //System.out.println(d[]);
                System.out.println("Not possible!!");  break;
                case 15 : System.out.println(st);     break;
                case 16 : //System.out.println(st[]);
                System.out.println("Not possible!!");  break;
                case 17 : System.out.println(bl);     break;
                case 18 : //System.out.println(bl[]);
                System.out.println("Not possible!!");  break;
                default : System.out.println("Wrong choice");
            }
            System.out.println("Enter once again");   }
            catch(Exception e)
            {
                System.out.println("ERROR!!\nError code:"+e);
            }
        }
        System.out.println("Program end successful");
    }
    public static void code8()
    {
        int x=45;
        double r=x*Math.PI/180.0;
        System.out.println("Math.tan(x)="+Math.tan(x));
        System.out.println("Math.atan(x)="+Math.atan(x));
        System.out.println("Math.tan(r)="+Math.tan(r));
        System.out.println("Math.atan(r)="+Math.atan(r));
        System.out.println("Math.tan(x*Math.PI/180.0)="+Math.tan(x*Math.PI/180.0));
        System.out.println("Math.atan(x*Math.PI/180.0)="+Math.atan(x*Math.PI/180.0));
    }
    public static void code9()
    {
        for(int i=1;i<=10;i++)
        System.out.println(Math.random()*100);
    }
    public static void code10()
    {
        System.out.println(Math.PI);
    }
}