import java.util.*;
class anagram
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int a,b,e=0,i,j,max;
        char ch,ch3;
        String st,st2;
        System.out.println("Enter the first word : ");
        st=in.nextLine();
        System.out.println("Enter the second word : ");
        st2=in.nextLine();
        a=st.length();
        b=st2.length();
        max=Math.max(a,b);
        char ch1[]=new char[a];
        char ch2[]=new char[b];
        for(i=0;i<a;i++)
        {
            ch=st.charAt(i);
            ch1[i]=ch;
        }
        for(i=0;i<b;i++)
        {   
            ch=st2.charAt(i);
            ch2[i]=ch;
        }
        for(i=0;i<a;i++)
        {
            ch=ch1[i];
            for(j=0;j<b;j++)
            {
                ch3=ch2[j];
                if(ch==ch3)
                e++;
            }
        }
        if(e==max)
        System.out.print(st2+" is the Anagram of "+st);
        else
        System.out.print(st2+" is not the Anagram of "+st);
    }
}