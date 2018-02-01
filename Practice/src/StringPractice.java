
public class StringPractice {
	// returns the string spelled backwards
	public String reverseString(String str) {
		String newStr = "";
		for (int i = (str.length() - 1); i >= 0; i--) {
			newStr += str.charAt(i);
		}
		return newStr;
	}

	public static String frontBack(String str) {
		return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(frontBack("code"));
	}

}
