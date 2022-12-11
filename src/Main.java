import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int nf=1,rf=1,nrf=1;
        int last;
        Scanner inp =new Scanner(System.in);
        System.out.print("Enter the number of elements of set: ");
        int n = inp.nextInt();
        System.out.print("How many members should the groups have: ");
        int r= inp.nextInt();
        for(int i=1; i<=n; i++)
        {
            nf*=i;
        }

        for(int i=1; i<=r; i++)
        {
            rf*=i;
        }
        for(int i=1; i<=n-r; i++)
        {
            nrf*=i;
        }
        System.out.println(nf+" "+rf+" "+nrf);
        last=nf/(rf*nrf);

        System.out.println("C("+n+","+r+")="+last);
        //nf=620, rf=24, nrf=2
    }
}
