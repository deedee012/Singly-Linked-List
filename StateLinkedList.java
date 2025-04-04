public class StateLinkedList {
    private Node head;

    // Add a new state to the list
    public void addState(String stateName, List<String> neighbors) {
        Node newNode = new Node(stateName, neighbors);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Delete a state from the list
    public void deleteState(String stateName) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.stateName.equals(stateName)) {
            head = head.next;
            return;
        }

        Node current = head;
        Node previous = null;

        while (current != null && !current.stateName.equals(stateName)) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("State not found.");
            return;
        }

        previous.next = current.next;
    }

    // Print the list of states and their neighbors
    public void printStates() {
        Node temp = head;
        while (temp != null) {
            System.out.println("State: " + temp.stateName + ", Neighbors: " + temp.neighbors);
            temp = temp.next;
        }
    }
}
