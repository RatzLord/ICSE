import java.util.*;
class str_alph
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        String[] s={"Delhi","Bangalore","Agra","Mumbai","Calcutta"};
        int n=s.length,i,j,f;
        int as[]=new int[n];
        for(i=0;i<n;i++)
        {
            as[i]=(char)s[i].charAt(0);
        }
        String a,t;
        for(i=0;i<(n-1);i++)
        {
             for(j=0;j<(n-i-1);j++)
             {
                 if(as[i]>as[i+1])
                 {
                     t=s[i+1];
                     s[i+1]=s[i];
                     s[i]=t;
                     f=as[i+1];
                     as[i+1]=as[i];
                     as[i]=f;
                 }
             }
        }
        for(i=0;i<n;i++)
        System.out.println(s[i]);
    }
}