import java.util.*;
import java.lang.*;

public class DictionaryPractice {

	public static void main(String[] args) {
		String key;
		String value;
		Scanner input = new Scanner(System.in);
		// English to Spanish Dictionary
		Map<String,String> englSpanDictionary = new HashMap<String,String>();
		englSpanDictionary.put("Monday", "Lunes");
		englSpanDictionary.put("Tuesday", "Martes");
		englSpanDictionary.put("Wednesday", "Miercoles");
		englSpanDictionary.put("Thursday", "Jueves");
		englSpanDictionary.put("Friday", "Viernes");
		englSpanDictionary.put("Saturday", "Sabado");
		englSpanDictionary.put("Sunday", "Domingo");
		String[] daysEngl = new String[7];
				
		System.out.println(englSpanDictionary.get("Monday"));
		System.out.println(englSpanDictionary.keySet());
		System.out.println(englSpanDictionary.size());
		
		System.out.println();
		System.out.println();
		
		// Shopping List
		Map<String,Boolean> shoppingList = new HashMap<String,Boolean>();
		shoppingList.put("Ham", true);
		shoppingList.put("Bread", true);
		shoppingList.put("Oreos", true);
		shoppingList.put("Eggs", false);
		shoppingList.put("Sugar", false);
		
		System.out.println(shoppingList.get("Ham"));
		System.out.println(shoppingList.get("Bread"));
		
		
		
		
		
		
		
	}

}
