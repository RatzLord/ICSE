class testing
{
    public static void main()
    {
        print ob=new print();
        ob.Sop("Byte=");
        ob.Sopln((byte)5);
        ob.Sop("Short=");
        ob.Sopln((short)500);
        ob.Sop("Integer=");
        ob.Sopln(500000000);
        ob.Sop("Long=");
        ob.Sopln(500000000000000000L);
        ob.Sop("Character=");
        ob.Sopln('b');
        ob.Sop("Float=");
        ob.Sopln(50000.7687f);
        ob.Sop("Double=");
        ob.Sopln(6575765.567567523);
        ob.Sop("String=");
        ob.Sopln("This is working!!!");
    }
}