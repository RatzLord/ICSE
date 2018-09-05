class increment2
{
    public static void main()
    {
        int x=5,y;
        y=x++ + ++x + ++x;
        System.out.println(x);
        System.out.println(y);
    }
}