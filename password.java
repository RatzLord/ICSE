// to generate n no. of 8 character passwords containing only uppercase alphabets and digits

import java.util.*;
class password
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int i,n,ch=0;
        String st="";
        System.out.println("Enter no. of passwords to be generated");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            while(st.length()<=8)
            {
                while(!((ch>=65 && ch<=90) || (ch>=48 && ch<=57)))
                {
                    ch=(int)(Math.random()*100);
                }
                st=st+(char)ch;
                ch=0;
            }
            System.out.println("Password "+i+" = "+st);
            st="";
        }
    }
    // to find no. of attempts to search a given password
    // DO NOT TRY THIS!!!!!!!
    // I DON'T THINK IT WILL EVER BEABLE TO COUNT. SAVE UR COMP. FROM SLOWING DOWN
    // THIS IS THE REASON WHY IT'S HIDDEN AS A COMMENT
    // TRY AT UR OWN RISK!!
    /*
    public static void search()
    {
        Scanner in=new Scanner(System.in);
        int i,ch=0;
        long c=0l;
        String st="",str;
        System.out.println("Enter an 8-char. password including digits and uppercase letters only");
        str=in.next();
        while(true)
        {
            c++;
            while(st.length()<=8)
            {
                while(!((ch>=65 && ch<=90) || (ch>=48 && ch<=57)))
                {
                    ch=(int)(Math.random()*100);
                }
                st=st+(char)ch;
                ch=0;
            }
            System.out.println("st="+st);
            if(str.equals(st))
            break;
            st="";
        }
        System.out.println("No. of attempts="+c);
    }
    */
}