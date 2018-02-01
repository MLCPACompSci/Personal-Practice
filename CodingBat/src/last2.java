
public class last2 {
	
	public static int lastCount(String str) {
		if (str.length() > 2) {
			String char2 = str.substring(str.length() - 2, str.length());
			int count = 0;
			for (int i = 0; i < str.length() - 1; i++) {
				if (str.substring(i, i + 2).contains(char2)) {
					count++;
				}
			}
			return count - 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		System.out.println(lastCount("hixxhi"));
		
	}

}
