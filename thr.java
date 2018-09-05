import java.util.*;
class thr extends Thread
{
    public static void main()
    {
        Thread a[]=new Thread[10];
        //for(int i=1;i<=10;i++) { a[i]=Integer.toString(i);}
        int b=Thread.enumerate(a);
        System.out.println(Thread.currentThread());
    
    }
}