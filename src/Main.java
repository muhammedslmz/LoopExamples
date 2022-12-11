import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);


        int num=inp.nextInt();


        for(int i=4;i <num;i*=4)
        {
            if(i==4) System.out.println("0");
            System.out.println(i);
        }

        for(int j=5; j<num;j*=5)
        {
            if(j==5) System.out.println("0");
            System.out.println(j);
        }
    }
}
