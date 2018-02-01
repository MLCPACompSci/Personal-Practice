import java.util.*;


public class LeftRotation {
	
	public static int[] Rotation(int[]array, int shift) {
		
		int[] newArray = new int[array.length];
		for(int i = 0; i + shift < array.length; i++) {
			newArray[i] = array[i+shift];
			System.out.print(newArray[i] + " ");
		}
		for(int i = (array.length - shift);i < array.length;i++) {
			newArray[i] = array[shift - (array.length-i)];
			System.out.print(newArray[i] + " ");
		}
		return newArray;
	}	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int shift = in.nextInt();
        int array[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            array[a_i] = in.nextInt();
        }
        
        for(int i = 0; i + shift < array.length; i++) {
			System.out.print(array[i+shift] + " ");
		}
		for(int i = (array.length - shift);i < array.length;i++) {
			System.out.print(array[shift - (array.length-i)] + " ");
		}
		in.close();
	}

}
