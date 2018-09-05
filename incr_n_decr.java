class incr_n_decr
{
    public static void main()
    {
        int a=5,b;
        b=a++ + --a + a-- + a;
        System.out.println(a);
        System.out.println(b);
    }
}
