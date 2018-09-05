import java.util.*;
class marks
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int m;
        System.out.println("Enter your marks");
        m=in.nextInt();
        if(m<40)
        {
            System.out.println("Grade F");
        }
        else if(m>=40 && m<=60)
        {
            System.out.println("Grade C");
        }
        else if(m>=61 && m<=80)
        {
            System.out.println("Grade B");
        }
        else
        {
            System.out.println("Grade A");
        }
    }
}