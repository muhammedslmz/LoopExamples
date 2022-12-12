import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int z=0;
        int t = 0;
        System.out.print("Enter the number whose exponent you want to calculate: ");
        int x=input.nextInt();
        System.out.print("Enter the exponent: ");
        int y =input.nextInt();
        for (int i=1; z<=y;i*=x)
        {
            t=i;
            z++;
        }
        System.out.println(x+"^"+y+"= "+t);
    }
}
