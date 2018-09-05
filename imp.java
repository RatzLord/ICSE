import java.util.*;
import java.io.*;
class imp implements Runnable
{
    public static void main()
    {
        Thread t=new Thread(new imp());
        t.start();
    }
    public void run()
    {
        try {
        File x=new File("C:\\get.txt");
        Scanner r=new Scanner(x);
    }
    catch(FileNotFoundException e) {
    }
}
}