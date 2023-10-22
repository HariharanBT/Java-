package homework;
import java.util.*;
public class Questions1 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        Map<String, List<String>> fatherToChildren = new HashMap<>();

	        String[][] relationships = {
	            {"luke", "shaw"},
	            {"wayne", "rooney"},
	            {"rooney", "ronaldo"},
	            {"shaw", "rooney"}
	        };

	        for (String[] relationship : relationships) {
	            String child = relationship[0];
	            String father = relationship[1];

	            fatherToChildren.computeIfAbsent(father, k -> new ArrayList<>()).add(child);
	        }

	        System.out.print("Enter a Father's name: ");
	        String inputName = scanner.nextLine();
	        
	        List<String> children = fatherToChildren.get(inputName);
	        int totalGrandchildren = 0;

	        if (children != null) {
	            for (String child : children) {
	                List<String> grandchildren = fatherToChildren.get(child);
	                if (grandchildren != null) {
	                    totalGrandchildren += grandchildren.size();
	                }
	            }
	        }

	        System.out.println("The number of grandchildren for " + inputName + " is: " + totalGrandchildren);
	    }
	}


