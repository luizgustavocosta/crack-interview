package guga.bfs.grokking;

import java.util.*;

public class BreadthFirstSearch {

    public boolean searchBy(Map<String, List<String>> graph, String elementToFind) {
        throw new UnsupportedOperationException();
    }

    public boolean search(Map<String, List<String>> graph, String name) {
        Queue<String> searchQueue = new ArrayDeque<>(graph.get(name));
        // This list is how you keep track of which people you've searched before.
        List<String> searched = new ArrayList<>();

        while (!searchQueue.isEmpty()) {
            String person = searchQueue.poll();
            // Only search this person if you haven't already searched them
            if (!searched.contains(person)) {
                if (person_is_seller(person)) {
                    System.out.println(person + " is a mango seller!");
                    return true;
                } else {
                    searchQueue.addAll(graph.get(person));
                    // Marks this person as searched
                    searched.add(person);
                }
            }
        }

        return false;
    }

    private static boolean person_is_seller(String name) {
        //Fixme
        return name.equals("thom");
    }
}
