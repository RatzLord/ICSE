import java.util.*;
class enc
{
    public static void main()
    {
        String a[]={"        ___    ___     _________     __________     _________    __    __   ",
                    "        | |    | |     | _____ |     | |    | |     | |   | |    \\ \\  / /   ",
                    "        | |____| |     | |   | |     | |____| |     | |___| |     \\ \\/ /    ",
                    "        |  ____  |     | |___| |     | |            | |            \\  /     ",
                    "        | |    | |     | |   | |     | |            | |            / /      ",
                    "        |_|    |_|     |_|   |_|     |_|            |_|           /_/       ",
                    "                                                                            ",
                    "           _________    [--]    _______      _________    __    __          ",
                    "           | |----| \\    //     | |  | \\     | _____ |    \\ \\  / /          ",
                    "           | |,___/ /    -      | |   | \\    | |   | |     \\ \\/ /           ",
                    "           | |'---\\ \\           | |    | |   | |___| |      \\  /            ",
                    "           | |    | |           | |   | /    | |   | |      / /             ",
                    "           | |____/ /           | |__| /     |_|   |_|     /_/              ",
                    "                                                                            ",
                    "  ___     ___     ___     ___   ___     ___    ___     ___   __    __   ___ ",
                    "  |  \\   /  |     | |     | |   |  \\   /  |    |  \\   /  |   \\ \\  / /   | | ",
                    "  | |\\\\_//| |     | |     | |   | |\\\\_//| |    | |\\\\_//| |    \\ \\/ /    | | ",
                    "  | | \\_/ | |     | |     | |   | | \\_/ | |    | | \\_/ | |     \\  /     | | ",
                    "  | |     | |     | |_____| |   | |     | |    | |     | |     / /      \\_/ ",
                    "  |_|     |_|     |_________|   |_|     |_|    |_|     |_|    /_/       []  "};
        int i,j;
        char ch;
        for(i=0;i<a.length;i++)
        {
            System.out.print("{");
            for(j=0;j<a[i].length();j++)
            {
                ch=a[i].charAt(j);
                System.out.print((int)(ch)+",");
            }
            System.out.println("},");
        }
    }
}