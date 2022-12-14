import java.util.*;

public class Program1 {
    public static void main(String[] args) {

        // create a LinkedList object and initialize it with Array elements converted to
        // list
        LinkedList<Integer> intList = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
        // print the LinkedList just created
        System.out.println("Contents of first LinkedList: " + intList);

        // create an empty list
        LinkedList<String> colorsList = new LinkedList<>();

        // add elements to the linkedList using add method.
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Blue");
        colorsList.add("Cyan");
        colorsList.add("Magenta");

        // print the LinkedList
        System.out.println("\nContents of second LinkedList: " + colorsList);

        // Using for loop,print the contents of the LinkedList
        System.out.println("LinkedList elements using for loop:");
        for (int i = 0; i < colorsList.size(); i++) {
            System.out.print(colorsList.get(i) + " ");
        } 
        
        // Using forEach loop,print the contents of the LinkedList
        System.out.println("LinkedList elements using forEach loop:");
        for (String color : colorsList) {
            System.out.print(color + " ");
        } 
        
        // declare an iterator for the LinkedList
        Iterator<String> itr = colorsList.iterator();
        System.out.println("The contents of Linked List:"); 
        
        // Iterate through the LinkedList using Iterator and print
        // its elements
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        } 
        
        // convert List to stream &amp; print it
        System.out.println("The contents of LinkedList:");
        colorsList.stream().forEach(System.out::println);
    }
}