import java.util.*;
public class arrayCount {
	public static int arrayCount9(int[] nums) {
		int count = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 9) {
				count++;
			}
		}
		return count;
	}
	public static boolean array123(int[] nums) {
		  for(int i = 0; i < nums.length - 2; i++) {
			  if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) return true; 
		  }
		  return false;
	}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		
		int[] arr = new int[length];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println(array123(arr));

	}

}
