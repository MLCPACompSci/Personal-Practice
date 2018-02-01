import java.util.*;

public class BeautifulTriplets {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int d = input.nextInt();
        int beautiful = 0;
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        input.close();
        
        for(int i = 0; i < arr.length - 2; i++){
            for(int j = i + 1; j < arr.length - 1; j++){
                for(int k = j + 1; k < arr.length; k++){
                    if(arr[k] - arr[j] == d && arr[j] - arr[i] == d){
                        beautiful++;
                    }
                }
            }
        }
        System.out.println(beautiful);
    }
}