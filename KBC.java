//KBC program
//coded by Aditya Kumar
import java.util.*;
class KBC
{
    private static String question(int i)
    {
        String q[]=new String[13];
        q[0]="]nu&}gy&znk&loxyz&sgt&ot&yvgikE";
        q[1]="Ut&}noin&kgx&joj&znk&Loxyz&]uxrj&]gx&hkmotE";
        q[2]="]nkt&}orr&znk&Ngrrk-y&iuskz&gvvkgx&tk~zE";
        q[3]="]noin&vuroi&joj&Gjurl&Nozrkx&lurru}E";
        q[4]="]nu&oy&znk&lu{tjkx&ul&]ngzyGvvE";
        q[5]="Ut&}noin&jgzk&joj&Hktozu&S{yyuroto&luxs&znk&mu|kxtsktz&ot&OzgrE";
        q[6]="]nu&}gy&huzn&g&iu3lu{tjkx&gy&}krr&gy&znk&IKU&ul&Uxgirk&IuxvuxgzoutE";
        q[7]="Ot&}noin&ioz&}gy&Rkutgxju&Jg&"+"\\otio&huxtE";
        q[8]="Ot&}noin&vxumxgssotm&rgtm{gmk&oy&Rot{~&vxosgxor&}xozzktE";
        q[9]="]noin&hgtj&}gy&vkxluxsotm&}nkt&znk&OYOY&zkxxuxoyz&gzzgiqkj&znk&g{joktik&ot&Vgxoy&ot&Tu|kshkx&867;E";
        q[10]="]noin&ul&znkyk&Otjogt&otj{yzxogroyzy&yzgxzkj&noy&igxkkx&gy&g&jogsutj&yuxzkx&ot&S{shgoE";
        q[11]="]noin&jg&oy&uhykx|kj&gy&]uxrj&Yzgtjgxjy&JgE";
        q[12]="]ngz&gxk&znk&znxkk&zvky&ul&rgykxE";  
        String s=dec(q[i]);
        return s;
    }
    private static String correct(int i)
    {
        String a[]=new String[13];
        a[0]="_{xo&Mgmgxot";
        a[1]="7?7:";
        a[2]="86<7";
        a[3]="Gtzo3Yksozoys";
        a[4]="Pgt&Qu{s";
        a[5]="96&Uizuhkx&7?88";
        a[6]="Rgxx&Krroyut";
        a[7]="Lruxktik";
        a[8]="I";
        a[9]="Kgmrky&ul&Jkgzn&Skzgr";
        a[10]="Mg{zgs&Gjgto";
        a[11]="Uiz&7:";
        a[12]="Mgy2&Yuroj&yzgzk2&Joujk";
        String s=dec(a[i]);
        return s;
    }
    private static String wrong1(int i)
    {
        String a[]=new String[13];
        a[0]="Kj}gxj&Grjxot";
        a[1]="7?9?";
        a[2]="86;6";
        a[3]="Gtzo3Pk}oys";
        a[4]="Rgxx&Krroyut";
        a[5]="96&Uizuhkx&7?86";
        a[6]="Pgsky&Muyrotm";
        a[7]="Xusk";
        a[8]="I11";
        a[9]="Rotqot&Vgxq";
        a[10]="Qgxygthngo&Vgzkr";
        a[11]="P{tk&8<";
        a[12]="Mgy2&Skzgr&|gvu{x2&Xuiq";
        String s=dec(a[i]);
        return s;
    }
    private static String wrong2(int i)
    {
        String a[]=new String[13];
        a[0]="Tkor&Gxsyzxutm";
        a[1]="7?86";
        a[2]="868:";
        a[3]="Gtzo3Nkhxk}oys";
        a[4]="Sgxq&`{iqkxhkxm";
        a[5]="8>&Uizuhkx&7?88";
        a[6]="Rgxx&Vgmk";
        a[7]="Vgrkyzotk";
        a[8]="Pg|g";
        a[9]="G|ktmkj&Yk|ktlurj";
        a[10]="Sglgzrgr&Mgmgrhngo";
        a[11]="Tu|kshkx&7;";
        a[12]="Vuotzkx2&Joujk&2&IJ";
        String s=dec(a[i]);
        return s;
    }
    private static String wrong3(int i)
    {
        String a[]=new String[13];
        a[0]="Xgqkyn&Yngxsg";
        a[1]="7?:;";
        a[2]="8768";
        a[3]="Gtzo3Yksuzoys";
        a[4]="Ykxmk&Hxot";
        a[5]="96&Ykvzkshkx&7?8:";
        a[6]="Kj&Ugzky";
        a[7]="\\okttg";
        a[8]="Vznut";
        a[9]="GI5JI";
        a[10]="Gos&Vxkspo";
        a[11]="Jkikshkx&8";
        a[12]="Joujk2&Ot|kxzkj2&Vuotzkx";
        String s=dec(a[i]);
        return s;
    }
    private static void rules()
    {
        Scanner in=new Scanner(System.in);
        String s;
        System.out.println("\t*******RULES*******");
        System.out.println("There will be total of 13 questions from 5000 to 5 crore.");
        System.out.println("You have your checkpoint on the 6th question. If you answer this question correctly, you will surely \nget Rs. 1,60,000 even if you go wrong in any question thereafter.");
        System.out.println("Enter only 'a', 'b', 'c' or 'd' for entering your option.");
        System.out.println("You can quit on any question by entering 'q' when you are asked to enter your option. On quitting, \nyou will get the money corresponding to the previous question you answered correctly.");
        System.out.println("You have 4 lifelines to help you in this game - Audience Poll, 50:50, Double-Dip and Expert's Advice.");
        System.out.println("Enter '1' to activate Audience Poll, '2' to activate 50:50, '3' to activate Double-Dip and \n'4' to activate Expert's Advice. You have to enter these when you are asked to enter your option.");
        System.out.println("After entering your option, enter 'yes' to lock it or 'no' to re-enter option.");
        System.out.println("Do you want to continue? (Enter \"Yes\" or \"No\")");
        s=in.next();
        if(s.equalsIgnoreCase("yes"))
        opt(0,1,1,1,1);
        else
        System.out.println("Well, thanks for running this program  :)");
    }
    private static void quiz(int i,String a,String b,String c,String d,int l1,int l2,int l3,int l4)
    {
        System.out.println("\t*****Question "+(i+1)+"*****");
        System.out.println(question(i));
        System.out.println();
        System.out.println("A. "+a+"\tB. "+b);
        System.out.println("C. "+c+"\tD. "+d);
        System.out.println();
        input(i,a,b,c,d,l1,l2,l3,l4);
    }
    private static String dec(String s)
    {
        int i,l=s.length();
        char ch;
        String s1="";
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            ch=(char)(ch-6);
            s1=s1+ch;
        }
        return s1;
    }
    private static void opt(int i,int l1,int l2,int l3,int l4)
    {
        String a="",b="",c="",d="";
        switch(i)
        {
            case 0:
            b=correct(i);
            a=wrong1(i);
            c=wrong2(i);
            d=wrong3(i);
            break;
            case 1:
            b=correct(i);
            a=wrong1(i);
            c=wrong2(i);
            d=wrong3(i);
            break;
            case 2:
            a=correct(i);
            b=wrong1(i);
            c=wrong2(i);
            d=wrong3(i);
            break;
            case 3:
            b=correct(i);
            a=wrong1(i);
            c=wrong2(i);
            d=wrong3(i);
            break;
            case 4:
            c=correct(i);
            a=wrong1(i);
            b=wrong2(i);
            d=wrong3(i);
            break;
            case 5:
            d=correct(i);
            a=wrong1(i);
            c=wrong2(i);
            b=wrong3(i);
            break;
            case 6:
            b=correct(i);
            a=wrong1(i);
            c=wrong2(i);
            d=wrong3(i);
            break;
            case 7:
            a=correct(i);
            b=wrong1(i);
            c=wrong2(i);
            d=wrong3(i);
            break;
            case 8:
            b=correct(i);
            a=wrong1(i);
            c=wrong2(i);
            d=wrong3(i);
            break;
            case 9:
            d=correct(i);
            a=wrong1(i);
            c=wrong2(i);
            b=wrong3(i);
            break;
            case 10:
            c=correct(i);
            a=wrong1(i);
            b=wrong2(i);
            d=wrong3(i);
            break;
            case 11:
            b=correct(i);
            a=wrong1(i);
            c=wrong2(i);
            d=wrong3(i);
            break;
            case 12:
            a=correct(i);
            b=wrong1(i);
            c=wrong2(i);
            d=wrong3(i);
            break;
            default:
        }
        quiz(i,a,b,c,d,l1,l2,l3,l4);
    }
    private static void input(int i,String a,String b,String c,String d,int l1,int l2,int l3,int l4)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your option");
        char o=in.next().charAt(0);
        if(o=='a' || o=='A')
        lock(i,a,a,b,c,d,l1,l2,l3,l4);
        else if(o=='b' || o=='B')
        lock(i,b,a,b,c,d,l1,l2,l3,l4);
        else if(o=='c' || o=='C')
        lock(i,c,a,b,c,d,l1,l2,l3,l4);
        else if(o=='d' || o=='D')
        lock(i,d,a,b,c,d,l1,l2,l3,l4);
        else if(o=='q')
        quit(i,a,b,c,d,l1,l2,l3,l4);
        else if(o=='1')
        lifelock(i,a,b,c,d,1,l1,l2,l3,l4);
        else if(o=='2')
        lifelock(i,a,b,c,d,2,l1,l2,l3,l4);
        else if(o=='3')
        lifelock(i,a,b,c,d,3,l1,l2,l3,l4);
        else if(o=='4')
        lifelock(i,a,b,c,d,4,l1,l2,l3,l4);
        else
        re(i,a,b,c,d,l1,l2,l3,l4);
    }
    private static void re(int i,String a,String b,String c,String d,int l1,int l2,int l3,int l4)
    {
        System.out.println("Please enter correctly");
        input(i,a,b,c,d,l1,l2,l3,l4);
    }
    private static void lock(int i,String q,String a,String b,String c,String d,int l1,int l2,int l3,int l4)
    {
        Scanner in=new Scanner(System.in);
        String s;
        System.out.println("Are you sure you want to lock on "+q+"?");
        s=in.next();
        if(s.equalsIgnoreCase("yes"))
        check(i,q,a,b,c,d,l1,l2,l3,l4);
        else
        input(i,a,b,c,d,l1,l2,l3,l4);
    }
    private static void lifelock(int i,String a,String b,String c,String d,int l,int l1,int l2,int l3,int l4)
    {
        Scanner in=new Scanner(System.in);
        String s,s1="";
        int ch=0;
        switch(l)
        {
            case 1:
            s1="Audience Poll";
            ch=l1;
            break;
            case 2:
            s1="50:50";
            ch=l2;
            break;
            case 3:
            s1="Double Dip";
            ch=l3;
            break;
            case 4:
            s1="Expert's Advice";
            ch=l4;
            break;
            default:
        }
        System.out.println("Are you sure you want to use the lifeline "+s1+"?");
        s=in.next();
        if(s.equalsIgnoreCase("yes"))
        {
            if(ch==0)
            {
                System.out.println("Sorry, you have already used this lifeline before");
                System.out.print("Again, ");
                input(i,a,b,c,d,l1,l2,l3,l4);
            }
            else
            {
                switch(l)
                {
                    case 1:
                    life1(i,a,b,c,d,l1,l2,l3,l4);
                    break;
                    case 2:
                    life2(i,a,b,c,d,l1,l2,l3,l4);
                    break;
                    case 3:
                    life3(i,a,b,c,d,l1,l2,l3,l4);
                    break;
                    case 4:
                    life4(i,a,b,c,d,l1,l2,l3,l4);
                    break;
                    default:
                }
            }
        }
        else
        input(i,a,b,c,d,l1,l2,l3,l4);
    }
    private static void audpoll(int i,String a,String b,String c,String d,int l1,int l2,int l3,int l4,int p,int q,int r,int s)
    {
        System.out.println("+-+AUDIENCE POLL+-+");
        int j;
        System.out.println();
        System.out.println("Option A = "+p+"%");
        for(j=1;j<=p;j++)
        System.out.print("*");
        System.out.println();
        System.out.println("Option B = "+q+"%");
        for(j=1;j<=q;j++)
        System.out.print("*");
        System.out.println();
        System.out.println("Option C = "+r+"%");
        for(j=1;j<=r;j++)
        System.out.print("*");
        System.out.println();
        System.out.println("Option D = "+s+"%");
        for(j=1;j<=s;j++)
        System.out.print("*");
        System.out.println();
        System.out.println();
        System.out.print("Now ");
        input(i,a,b,c,d,l1,l2,l3,l4);
    }
    private static void life1(int i,String a,String b,String c,String d,int l1,int l2,int l3,int l4)     //audience poll
    {
        l1=2;
        int p=0,q=0,r=0,s=0;
        switch(i)
        {
            case 0:
            p=3;
            q=92;
            r=5;
            s=1;
            break;
            case 1:
            p=5;
            q=90;
            r=4;
            s=21;
            break;
            case 2:
            p=91;
            q=4;
            r=1;
            s=4;
            break;
            case 3:
            p=5;
            q=89;
            r=4;
            s=2;
            break;
            case 4:
            p=4;
            q=6;
            r=88;
            s=2;
            break;
            case 5:
            p=6;
            q=4;
            r=11;
            s=79;
            break;
            case 6:
            p=7;
            q=76;
            r=3;
            s=14;
            break;
            case 7:
            p=75;
            q=10;
            r=5;
            s=10;
            break;
            case 8:
            p=20;
            q=68;
            r=8;
            s=4;
            break;
            case 9:
            p=2;
            q=17;
            r=23;
            s=58;
            break;
            case 10:
            p=16;
            q=15;
            r=56;
            s=16;
            break;
            case 11:
            p=14;
            q=44;
            r=28;
            s=14;
            break;
            case 12:
            p=40;
            q=30;
            r=17;
            s=13;
            break;
            default:
        }
        audpoll(i,a,b,c,d,l1,l2,l3,l4,p,q,r,s);
    }
    private static void life2(int i,String a,String b,String c,String d,int l1,int l2,int l3,int l4)     //50:50
    {
        l2=0;
        System.out.println("+-+50:50 ACTIVATED+-+");
        switch(i)
        {
            case 0:
            a="";
            d="";
            break;
            case 1:
            c="";
            d="";
            break;
            case 2:
            c="";
            d="";
            break;
            case 3:
            a="";
            c="";
            break;
            case 4:
            a="";
            d="";
            break;
            case 5:
            c="";
            b="";
            break;
            case 6:
            a="";
            d="";
            break;
            case 7:
            c="";
            d="";
            break;
            case 8:
            a="";
            c="";
            break;
            case 9:
            a="";
            b="";
            break;
            case 10:
            a="";
            d="";
            break;
            case 11:
            a="";
            c="";
            break;
            case 12:
            b="";
            c="";
            break;
            default:
        }
        System.out.println();
        quiz(i,a,b,c,d,l1,l2,l3,l4);
    }
    private static void life3(int i,String a,String b,String c,String d,int l1,int l2,int l3,int l4)     //double dip
    {
        System.out.println("+-+DOUBLE DIP ACTIVATED+-+");
        l3=2;
        input(i,a,b,c,d,l1,l2,l3,l4);
    }
    private static void life4(int i,String a,String b,String c,String d,int l1,int l2,int l3,int l4)     //expert's advice
    {
        l4=2;
        String n="",ad="";
        switch(i)
        {
            case 0:
            n="Abhinav Mahanti";
            ad="I'm sure the first man in space was the Russian cosmonaut, Yuri Gagarin who went outside \nthe Earth's atmosphere on 12 April 1961.";
            break;
            case 1:
            n="Aishwarya Sam";
            ad="No doubt. The First World War started on the 28th of July, 1914 when Austria declared war \non Serbia.";
            break;
            case 2:
            n="Aditya Shekhar";
            ad="The Halley's comet shall be seen once again in mid-2061.";
            break;
            case 3:
            n="Aman Kumar";
            ad="Don't confuse much. The answer is \"Anti-Semitism\" and not \"Anti-Semotism\" or anything \nelse.";
            break;
            case 4:
            n="Prerna Singh";
            ad="Even though Mark Zuckerberg currently owns WhatsApp, it was actually founded by the man, \nJan Koum";
            break;
            case 5:
            n="Aayush Sagar";
            ad="Hmmm. As far as I remember, on 28th October 1922, Benito Mussolini along with his Fascist \nband marched on Rome and just after two days, on 30th, he was invited by the king to form the \ngovernment. So the answer should be 28 October 1922.";
            break;
            case 6:
            n="Anushka Mehta";
            ad="According to me, Ed Oates was there with Larry Ellison and Bob Miner as a co-founder of \nOracle Corporation but he was never the CEO. I think only Larry Ellison was the one who became the \nCEO of the company too. So I think you should go for Larry Ellison.";
            break;
            case 7:
            n="Vishal Sharma";
            ad="Leonardo was an Italian. So Vienna and Palestine are out of consideration. Also, most of \nhis works were done by him in Rome but I think it was Florence where he was born. But I'm not 100% sure.";
            break;
            case 8:
            n="Aleya Sinha";
            ad="Linux was created long before Java and Python was released. So basically he answer should \nbe any one of these two, C or C++. But there are more chances of C being the answer because C++ \nalso came a bit later than C. So you can choose C as your answer.";
            break;
            case 9:
            n="Aaron K. Matthews";
            ad="This is a tricky question! But I'm sure that Linkin Park and Avenged Sevenfold is not the \nanswer. Now we have AC/DC which is a very old Australian rock band, and I think it has never gone \nto Paris for a performance. So, I guess, the answer is Eagles of Death Metal.";
            break;
            case 10:
            n="Aniket Mathur";
            ad="I don't think the answer is Azim Premji or Karsanbhai Patel. I'm guessing the answer to be \nGautam Adani but I'm not sure about it. I have not heard much about  Mafatlal Gagalbhai so I can't \nsay anything about him.";
            break;
            case 11:
            n="Aastha Sah";
            ad="I remember that World Standards Day is celebrated on 14th or 15th of a month. So June and \nDecember are out of consideration. Now it should not be on November because as far as I know, there \nwas no special day so near to Children's day.";
            break;
            case 12:
            n="Aayush Andreas Aind";
            ad="I know that Gas is a type of laser. So your answer is either of the first two options. But, according \nto me, rack shoud not be a type of laser. But still I'm not sure.";
            break;
            default:
        }
        System.out.println("+-+EXPERT'S ADVICE+-+");
        System.out.println("You have "+n+" as your expert.");
        System.out.println("ADVICE : "+ad);
        System.out.println();
        System.out.print("Now ");
        input(i,a,b,c,d,l1,l2,l3,l4);
    }
    private static void check(int i,String q,String a,String b,String c,String d,int l1,int l2,int l3,int l4)
    {
        if(q.equals(correct(i)))
        win(i,l1,l2,l3,l4);
        else if(l3==2)
        {
            l3=0;
            System.out.println("This is the wrong answer. But you are lucky to have the chance to answer once again!");
            input(i,a,b,c,d,l1,l2,l3,l4);
        }
        else
        lose(i);
    }
    private static void quit(int i,String a,String b,String c,String d,int l1,int l2,int l3,int l4)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Are you sure you want to quit??");
        String s=in.next();
        if(s.equalsIgnoreCase("yes"))
        quitok(i);
        else
        {
            System.out.print("Then ");
            input(i,a,b,c,d,l1,l2,l3,l4);
        }
    }
    private static void quitok(int i)
    {
        System.out.println("You quitted on question "+(i+1));
        prize(i,1);
    }
    private static void win(int i,int l1,int l2,int l3,int l4)
    {
        System.out.println();
        System.out.println("Right answer!!!!!");
        if(l1==2)
        {
            System.out.println("Thank the audience for helping you!");
            l1=0;
        }
        if(l4==2)
        {
            System.out.println("Thank your expert for his/her advice!");
            l4=0;
        }
        System.out.println("Enter anything to continue");
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println();
        System.out.println();
        System.out.println();
        if(i!=12)
        {
            opt(i+1,l1,l2,l3,l4);
        }
        else
        prize(i,1);
    }
    private static void lose(int i)
    {
        System.out.println("I'm sorry to say that it was the wrong answer.");
        System.out.println("Don't worry, you can restart this game again later. But for this game, you have lost.");
        prize(i,0);
    }
    private static void prize(int i,int t)
    {
        Scanner in=new Scanner(System.in);
        if(t==0)
        {
            if(i<5)
            System.out.println("Sorry to say you have won Rs. 0");
            else
            System.out.println("You have won Rs. 1,60,000");
        }
        else
        {
            String p="";
            switch(i)
            {
                case 0: p="5,000";
                break;
                case 1: p="10,000";
                break;
                case 2: p="20,000";
                break;
                case 3: p="40,000";
                break;
                case 4: p="80,000";
                break;
                case 5: p="1,60,000";
                break;
                case 6: p="3,20,000";
                break;
                case 7: p="6,40,000";
                break;
                case 8: p="12,50,000";
                break;
                case 9: p="25,00,000";
                break;
                case 10: p="50,00,000";
                break;
                case 11: p="1 crore";
                break;
                case 12: p="5 crore";
                break;
                default:
            }
            if(i==12)
            System.out.println("You have answered all the questions correctly");
            System.out.println("Congratulations!!! You have won Rs. "+p);
        }
        System.out.println("Enter anyting to continue");
        String s=in.next();
        credits();
    }
    private static void credits()
    {
        System.out.println("\t*****CREDITS*****");
        System.out.println("\u00A9Copyright. All rights reserved.");
        System.out.println("This program is only for entertainment purpose. No real money is involved in this game.");
        System.out.println("This was programmed by Aditya Kumar from RatzSoft Inc.");
        System.out.println();
        System.out.println("THANKS FOR RUNNING THIS PROGRAM!! :-)");
        System.out.println("HOPE YOU ENJOYED IT.");
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        String s;
        System.out.println("*******WELCOME TO KBC*******");
        System.out.println("Enter anything to start");
        s=in.next();
        rules();
    }
}