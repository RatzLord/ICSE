import java.util.*;
class teenager
{
    public static void main()
    {
        Scanner x=new Scanner(System.in);
        int age;
        System.out.println("Enter your age");
        age=x.nextInt();
        if(age>=13 && age<=19)
        {
            System.out.println("Teenager");
        }
        else
        {
            System.out.println("Not a Teenager");
        }
    }
}