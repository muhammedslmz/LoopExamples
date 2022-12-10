import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int sum=0, piece=0;
        System.out.print("Enter a number: ");
        int num=inp.nextInt();

        for(int i=1;i<num;i++) {
            if (i % 12 == 0) {
                sum += i;
                piece++;
            }
        }
        int avg=sum/piece;

        System.out.println(avg);

    }
}
