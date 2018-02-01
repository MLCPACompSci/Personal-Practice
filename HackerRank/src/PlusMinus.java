import java.util.*;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ArrLength = input.nextInt();
		int[] array = new int[ArrLength];
		for(int i = 0; i < ArrLength; i++) {
			array[i] = input.nextInt();
		}
		input.close();
		
		double positive = 0;
		double zero = 0;
		double negative = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] > 0) {
				positive++;
			}
			else if (array[i] < 0) {
				negative++;
			}
			else {
				zero++;
			}
		}
		
		System.out.println(positive/array.length);
		System.out.println(negative/array.length);
		System.out.println(zero/array.length);
	}

}
