import java.util.Arrays;

public class TestLinkedList {
    public static void main(String[] args) {
        StateLinkedList list = new StateLinkedList();

        // Adding states with neighbors
        list.addState("California", Arrays.asList("Oregon", "Nevada", "Arizona"));
        list.addState("Nevada", Arrays.asList("California", "Oregon", "Idaho", "Utah"));
        list.addState("Arizona", Arrays.asList("California", "Nevada", "Utah", "New Mexico"));

        // Print all states
        System.out.println("Initial list:");
        list.printStates();

        // Delete a state
        System.out.println("\nDeleting Nevada...");
        list.deleteState("Nevada");

        // Print list after deletion
        System.out.println("\nList after deletion:");
        list.printStates();
    }
}
