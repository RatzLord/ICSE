class sum
{
    private int x,y,z;
    private void getdata()
    {
        x=5;
        y=8;
    }
    void add()
    {
        getdata();
        z=x+y;
    }
    void display()
    {
        System.out.println("Sum="+z);
    }
}