import java.util.*;

public class Staircase {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int steps = input.nextInt();
		for(int i = 1; i <= steps; i++) {
			for(int j = 0; j < steps-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++) {
				System.out.print("#");
			}
			System.out.println();
		}
		input.close();
	}
}