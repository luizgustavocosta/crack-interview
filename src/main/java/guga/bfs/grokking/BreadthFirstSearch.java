package guga.bfs.grokking;

import java.util.*;

public class BreadthFirstSearch {

    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("you", Arrays.asList("alice", "bob", "claire"));
        graph.put("bob", Arrays.asList("anuj", "peggy"));
        graph.put("alice", Collections.singletonList("peggy"));
        graph.put("claire", Arrays.asList("thom", "jonny"));
        graph.put("anuj", Collections.emptyList());
        graph.put("peggy", Collections.emptyList());
        graph.put("thom", Collections.emptyList());
        graph.put("jonny", Collections.emptyList());
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        System.out.println(bfs.searchBy(graph, "you", "thom"));
//        System.out.println(bfs.search(graph, "you"));
    }

    public Set<Object> searchBy(Map<String, List<String>> graph, String startNode, String lookingFor) {
        List<String> route = new ArrayList<>();
        Queue<String> queue = new ArrayDeque<>(graph.get(startNode));

        // This list is how you keep track of which people you've searched before.
        List<String> searched = new ArrayList<>();

        while (!queue.isEmpty()) {
            String person = queue.poll();
            // Only search this person if you haven't already searched them
            route.add(person);
            if (!searched.contains(person)) {
                if (person.equals(lookingFor)) {
                    route.add(person);
                    return new LinkedHashSet<>(route);
                } else {
                    queue.addAll(graph.get(person));
                    // Marks this person as searched
                    route.add(person);
                }
            }
        }
        return Collections.emptySet();

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
        System.out.println(name);
        return name.equals("thom");
    }
}
