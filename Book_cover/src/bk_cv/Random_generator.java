package bk_cv;
import java.util.Random;

public class Random_generator {

	public static final String ANSI_RED = "\u001B[31m"; //format output to red
	public static final String ANSI_RESET = "\u001B[0m"; //reset output to black

	public static void main (String[] args) {

		Random generator = new Random();
		Random generator2 = new Random();
		Random generator3 = new Random();

		int l=generator3.nextInt(2499);//place the title somewhere in the top half
		int m=generator2.nextInt(4999); //for placing the name in the second half of the page

		//ensure it is not out of bounds
		if(m<2500) {
			m=m+generator2.nextInt(1500);
		}

		//now start the loop to print 5000 random 1s and 0s
		for(int i=0; i<5000; i++) {
			System.out.print(generator.nextInt(2));

			System.out.print(" ");

			if(i==l) {
				System.out.print(ANSI_RED + "+ " + "Is Technology Killing Humanity " + "+ " + ANSI_RESET); //print the title
			}

			if (i==m) {
				System.out.print(ANSI_RED + "+ " + "Baraa Al Haj Ali " + "+ " + ANSI_RESET);//print the author
			}
		}
	}
}