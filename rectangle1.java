/**
 * Program to input length and breadth and find the area
 */
import java.io.*;
class rectangle1
{
    public static void main() throws IOException
    {
        InputStreamReader x=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(x);
        int len,bre,ar;
        System.out.println("Enter length and breadth");
        len=Integer.parseInt(br.readLine());
        bre=Integer.parseInt(br.readLine());
        ar=len*bre;
        System.out.println("Area of rectangle="+ar);
    }
}