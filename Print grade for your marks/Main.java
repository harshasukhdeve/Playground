import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code hereimport java.util.Scanner;

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n>35)
		   System.out.println("A");
		else if(n<=35)
           System.out.println("Fail");
    }
}