import java.util.*;

public class program2 {
    public static void main(String args[]) {
        // create a linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // Add elements to linkedList using various add methods
        l_list.add("B");
        l_list.add("C");
        l_list.addLast("G");
        l_list.addFirst("A");
        l_list.add(3, "D");
        l_list.add("E");
        l_list.add("F");
        // print the linkedList
        System.out.println("Linked list : " + l_list);
        // Create and initialize an ArrayList
        ArrayList<String> aList = new ArrayList<>();
        aList.add("H");
        aList.add("I");
        // add the ArrayList to linkedList using addAll method
        l_list.addAll(aList);
        // print the linkedList
        System.out.println("Linked list after adding ArrayList contents: " + l_list);
        // use various remove methods to remove elements from linkedList
        l_list.remove("B");
        l_list.remove(3);
        l_list.removeFirst();
        l_list.removeLast();
        // print the altered list
        System.out.println("Linked list after deletion: " + l_list);
        // use contains method to check for an element in the linkedList
        boolean ret_value = l_list.contains("G");
        // print the results of contains method
        if (ret_value)
            System.out.println("List contains the element 'G' ");
        else
            System.out.println("List doesn't contain the element 'G'");

        // use size methods to return Number of elements in the linked list
        int size = l_list.size();
        System.out.println("Size of linked list = " + size);

        // Get and set elements from linked list
        Object element = l_list.get(3);
        System.out.println("Element returned by get() : " + element);
        l_list.set(3, "J");
        System.out.println("Linked list after change : " + l_list);

        // convert linkedList to Array using toArray methods
        String[] list_array = l_list.toArray(new String[l_list.size()]);

        System.out.println("Array obtained from linked List:" +
                Arrays.toString(list_array));
        l_list.add("Pune");
        l_list.add("Mumbai");
        l_list.add("Nagpur");
        System.out.println("Linked List : " + l_list);
        System.out.println("Linked List in reverse order:");
        // use descendingIterator method to get a reverse iterator
        Iterator iter = l_list.descendingIterator();
        // traverse the list using iterator and print the elements.
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        l_list.add("Jan");
        l_list.add("Feb");
        l_list.add("Mar");
        l_list.add("Apr");
        l_list.add("May");
        l_list.add("Jun");
        // print original unsorted linkedlist
        System.out.println("Original LinkedList (unsorted): " + l_list);
        // sort LinkedList with Collecitons.sort() method in natural order
        Collections.sort(l_list);
        System.out.println("\nLinkedList (sorted in natural order): " + l_list);
        // sort LinkedList using Collection.sort() and Comparator in Java
        Collections.sort(l_list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });
        System.out.println("LinkedList (sorted using Comparator): " + l_list);
    }
}