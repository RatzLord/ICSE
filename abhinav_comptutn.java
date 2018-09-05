/*
 * Pattern=
 * aaaab
 * aaab
 * aab
 * ab
 * b
 */
class abhinav_comptutn
{
    public static void main()
    {
        int i,j;
        for(i=5;i>=1;i--)
        {
            for(j=1;j<i;j++)
            {
                System.out.print("a");
            }
            System.out.print("b");
            System.out.println();
        }
    }
}