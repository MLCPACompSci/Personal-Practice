import java.util.*;

public class Bingo {

	public static void Practice(ArrayList<Integer> arrli) {
		for (int i = 0; i < 5; i++) {
			arrli.add(i);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rando = new Random();
		ArrayList<String> calledNums = new ArrayList<String>();
		String Bingo = "";
		int calledNum;
		ArrayList<Integer> checkDupes = new ArrayList<Integer>();

		while (!Bingo.equals("confirm")) {
			while (!Bingo.equals("bingo")) {
				calledNum = rando.nextInt(75) + 1;
				if (!checkDupes.contains(calledNum)) {
					checkDupes.add(calledNum);
					if (calledNum <= 15)
						calledNums.add("B-" + calledNum);
					else if (calledNum <= 30)
						calledNums.add("I-" + calledNum);
					else if (calledNum <= 45)
						calledNums.add("N-" + calledNum);
					else if (calledNum <= 60)
						calledNums.add("G-" + calledNum);
					else
						calledNums.add("O-" + calledNum);
					System.out.println(calledNums.get(calledNums.size() - 1));
					System.out.println("Continue? Type \"bingo\" if there's \na bingo!");
					Bingo = input.nextLine();
				}
			}
			Collections.sort(calledNums);
			System.out.println(calledNums);
			System.out.println("Type \"confirm\" if it's a bingo!");
			Bingo = input.nextLine();
		}
		System.out.println("We've got a bingo!");
		input.close();
	}
}
