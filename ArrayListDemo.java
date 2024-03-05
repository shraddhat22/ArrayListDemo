import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Printing the ArrayList
        System.out.println("ArrayList: " + arrayList);

        // Accessing elements by index
        System.out.println("Element at index 1: " + arrayList.get(1));

        // Modifying an element
        arrayList.set(1, "Grapes");
        System.out.println("Modified ArrayList: " + arrayList);

        // Removing an element
        arrayList.remove("Orange");
        System.out.println("ArrayList after removal: " + arrayList);

        // Checking if an element exists
        System.out.println("Contains 'Banana': " + arrayList.contains("Banana"));
        System.out.println("Contains 'Mango': " + arrayList.contains("Mango"));

        // Checking the size of the ArrayList
        System.out.println("Size of ArrayList: " + arrayList.size());

        // Checking if the ArrayList is empty
        System.out.println("Is ArrayList empty? " + arrayList.isEmpty());

        // Clearing the ArrayList
        arrayList.clear();
        System.out.println("ArrayList after clearing: " + arrayList);
        System.out.println("Is ArrayList empty after clearing? " + arrayList.isEmpty());
    }
}
