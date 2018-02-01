import java.util.*;

public class Hourglass {
	public static int[][] arr = new int[6][6];
	public static int maxSum = -9;

	public static int HGsum(int row, int col) {
		return arr[row][col] + arr[row][col + 1] + arr[row][col + 2] + arr[row + 1][col + 1] + arr[row + 2][col]
				+ arr[row + 2][col + 1] + arr[row + 2][col + 2];
	}

	public static void getSum() {
		for (int r = 0; r < 4; r++) {
			for (int c = 0; c < 4; c++) {
				maxSum = Math.max(HGsum(r, c), maxSum);
			}
		}
	}

	public static void getArray(Scanner input) {
		for (int r = 0; r < 6; r++) {
			for (int c = 0; c < 6; c++) {
				arr[r][c] = input.nextInt();
			}
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		getArray(input);
		input.close();
		getSum();
		System.out.println(maxSum);
	}

}
