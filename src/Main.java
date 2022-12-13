import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int t = 1;
        System.out.print("Enter the number whose exponent you want to calculate: ");
        int x=input.nextInt();
        System.out.print("Enter the exponent: ");
        int y =input.nextInt();
        for (int i=1; i<=y;i++)
        {
           t*=x
        }
        System.out.println(x+"^"+y+"= "+t);
    }
}
