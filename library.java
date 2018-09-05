import java.util.*;
class library
{
    int acc_num;
    String title,author;
    
    public void input()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter acc. no., title and author");
        acc_num=in.nextInt();
        title=in.next();
        author=in.next();
    }
    public void compute()
    {
        Scanner in=new Scanner(System.in);
        int d,ch;
        System.out.println("Enter no. of days late");
        d=in.nextInt();
        ch=d*2;
        System.out.println("Fine="+ch);
    }
    public void display()
    {
        System.out.println("acc. no.\ttitle\tauthor");
        System.out.println(acc_num+"\t"+title+"\t"+author);
    }
    public static void main()
    {
        library ob=new library();
        ob.input();
        ob.compute();
        ob.display();
    }
}