import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> languages = new ArrayList<>();
	    // Add elements to ArrayList
	    languages.add("Java");
	    languages.add("Python");
	    languages.add("Swift");
	    System.out.println("ArrayList: " + languages);
	    
	    String str = languages.get(1);
	    System.out.print("Element at index 1: " + str);
	    
	    languages.set(2, "JavaScript");
	    System.out.println("Modified ArrayList: " + languages);
	    
	    String str1 = languages.remove(2);
	    System.out.println("Updated ArrayList: " + languages);
	    System.out.println("Removed Element: " + str1);
	    
	    int size = languages.size();
	    System.out.println("Length of ArrayList: " + size);
	    
	    boolean result = languages.isEmpty(); 
        System.out.println("Is the ArrayList empty? " + result);
        
        int position1 = languages.indexOf("Java");
        System.out.println("Index of Java: " + position1);
	    
        System.out.println("SubList: " + languages.subList(0, 1));
        
        languages.clear();
        System.out.println("ArrayList after clear(): " + languages);
	}

}
