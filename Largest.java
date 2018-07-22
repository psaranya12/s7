package program;
import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		int n,a,b,c,max=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no.of digits");
		n=in.nextInt();
		System.out.println("Enter the values");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		if (a > b) {
            if (a > c)
                max = a;
            else
                max = c;
        } else {
            if (b > c)
                max = b;
            else
                max = c;
        }
        System.out.println("Largest Number : " + max);
    }
	}


