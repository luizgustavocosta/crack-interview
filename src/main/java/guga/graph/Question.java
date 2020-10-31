package guga.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static java.util.Objects.nonNull;

public class Question {

    public static void main(String a[]) {
        Graph graph = createNewGraph();
        Node[] nodes = graph.getNodes();
        Node start = nodes[0]; //NAV
        Node end = nodes[5]; // GRU
//        Node end = nodes[7]; // GRU
        final List<String> route = search(graph, start, end);
        System.out.println("Has route from .: "+start +", to.: "+ end+" ?");
        if (route.isEmpty()) {
            System.out.println("Doesn't have, please try another route");
        } else {
            System.out.println(route);
        }
    }

    public static Graph createNewGraph() {
        final int numberOfNodes = 8;
        Graph graph = new Graph(numberOfNodes);
        Node[] temp = new Node[numberOfNodes];

        temp[0] = new Node("CGH", 3);
        temp[1] = new Node("SJP", 1);
        temp[2] = new Node("BSB", 0);
        temp[3] = new Node("NAV", 1);
        temp[4] = new Node("SDU", 1);
        temp[5] = new Node("GRU", 0);
        temp[6] = new Node("MCU", 0);
        temp[7] = new Node("BCN", 0);

        temp[0].addAdjacent(temp[1]); // CGH -> SJP
        temp[0].addAdjacent(temp[2]); // CGH -> BSB
        temp[0].addAdjacent(temp[3]); // CGH -> NAV

        temp[3].addAdjacent(temp[4]); // NAV -> SDU

        temp[4].addAdjacent(temp[5]); // SDU -> GRU

        temp[1].addAdjacent(temp[7]); // SDU -> GRU

        for (Node node : temp) {
            graph.addNode(node);
        }
//        for (int i = 0; i < 6; i++) {
//            graph.addNode(temp[i]);
//        }
        return graph;
    }

    public static List<String> search(Graph graph, Node start, Node end) {

        final State unvisited = State.Unvisited;
        final State visiting = State.Visiting;
        final State visited = State.Visited;

        start.state = visiting;

        for (Node node : graph.getNodes()) {
            node.state = unvisited;
        }

        LinkedList<Node> queue = new LinkedList<>();
        queue.add(start);
        Node element; //airport

        List<String> completeRoute = new ArrayList<>();

        while (!queue.isEmpty()) {
            element = queue.removeFirst();

            completeRoute.add(element.toString());

            if (nonNull(element)) {
                for (Node adjacent : element.getAdjacent()) {
                    if (adjacent.state == unvisited) {
                        if (adjacent == end) {
                            completeRoute.add(element.toString());
                            completeRoute.add(adjacent.toString());
                            return completeRoute;
                        } else {
                            adjacent.state = visiting;
                            queue.add(adjacent);
                        }
                    }
                }
                element.state = visited;
            }
        }
        return Collections.emptyList();
    }
}
