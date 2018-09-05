class dec
{
    public static void main()
    {
        int i,j,l;
        char ch;
        String s1="";
        String a[]=new String[15];
        a[0]="Which of these Indian industrialists started his career as a diamond sorter in Mumbai?";
        a[1]="Which day is observed as World Standards Day?";
        a[2]="What are the three types of laser?";
        a[3]="Gautam Adani";
        a[4]="Oct 14";
        a[5]="Gas, Solid state, Diode";
        a[6]="Karsanbhai Patel";
        a[7]="June 26";
        a[8]="Gas, Metal vapour, Rock";
        a[9]="Mafatlal Gagalbhai";
        a[10]="November 15";
        a[11]="Pointer, Diode , CD";
        a[12]="Azim Premji";
        a[13]="December 2";
        a[14]="Diode, Inverted, Pointer";
        for(i=0;i<15;i++)
        {
            l=a[i].length();
            s1="";
            for(j=0;j<l;j++)
            {
                ch=a[i].charAt(j);
                ch=(char)(ch+6);
                s1=s1+ch;
            }
            System.out.println("a["+i+"]=\""+s1+"\";");
        }
    }
}