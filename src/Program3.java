class LinkedList_Duplicate {
    // A class to represent node in linkedlist
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Initially the head and tail of the linked list set to null
    public Node head = null;
    public Node tail = null;

    // add a new node to the linkedlist
    public void addNode(int data) {
        // Create new node
        Node newNode = new Node(data);

        // If list is empty set head and tail to new node
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            // add newNode after the tail
            tail.next = newNode;
            // newNode is now the tail or last element
            tail = newNode;
        }
    }

    // scans the linkedlist and removes duplicate nodes
    public void removeDuplicateNodes() {
        // Head is the current node
        Node current = head, index = null, temp = null;
        // head = null means list is empty
        if (head == null) {
            return;
        }
        // traverse through the list
        else {
            while (current != null) {
                // temp node points to previous node to index.
                temp = current;
                // Index will point to node next to current
                index = current.next;
                while (index != null) {
                    // Check if current node's data is equal to index node's data
                    if (current.data == index.data) {
                        // since node is duplicate skip index and point to next node
                        temp.next = index.next;
                    } else {
                        // Temp will point to previous node of index.
                        temp = index;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    // print the linked list
    public void print() {
        // Node current will point to head
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            // Print each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void add(int data) {
        // Create new node
        Node newNode = new Node(data);
        // check if list is empty
        if (head == null) {
            // head and tail point to same node if list is empty
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            // tail points to new node if list is not empty
            tail.next = newNode;
            // New node becomes new tail.
            tail = newNode;
            // tail points back to head
            tail.next = head;
        }
    }

    // Display the nodes in circular linked list
    public void displayList() {
        Node current = head;
        if (head == null) {
            System.out.println("The List is empty");
        } else {
            System.out.println("Circular linked list nodes: ");
            do {
                // Print each node of the linked list
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }
}

public class Program3 {
    public static void main(String[] args) {
        LinkedList_Duplicate l_List = new LinkedList_Duplicate();

        // Add data to the list
        l_List.addNode(1);
        l_List.addNode(1);
        l_List.addNode(2);
        l_List.addNode(3);
        l_List.addNode(5);
        l_List.addNode(2);
        l_List.addNode(1);
        l_List.addNode(1);
        // print the original list
        System.out.println("Original Linkedlist: ");
        l_List.print();

        // Removes duplicate nodes
        l_List.removeDuplicateNodes();
        // print the altered list without duplicates
        System.out.println("LinkedList after removing duplicates: ");
        l_List.print();
        // create a CircularLinkedList LinkedList_Duplicate object
        LinkedList_Duplicate c_list = new LinkedList_Duplicate();
        // Add data to the list
        c_list.add(10);
        c_list.add(20);
        c_list.add(30);
        c_list.add(40);
        // Display the nodes in circular linked list
        c_list.displayList();
    }
}