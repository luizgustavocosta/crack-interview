package guga.bfs;

import java.util.Stack;

public class BFS {

    public boolean search(final Graph g, final Graph.Node start, final Graph.Node end) {
        final Stack<Graph.Node> q = new Stack<>();
        for (final Graph.Node u : g.getNodes()) {
            u.state = Graph.State.Unvisited;
        }
        start.state = Graph.State.Visiting;
        q.add(start);
        Graph.Node u;
        while (!q.isEmpty()) {
            u = q.pop();
            if (u != null) {
                for (final Graph.Node v : u.getAdjacent()) {
                    if (v.state == Graph.State.Unvisited) {
                        if (v == end) {
                            return true;
                        } else {
                            v.state = Graph.State.Visiting;
                            q.add(v);
                        }
                    }
                }
                u.state = Graph.State.Visited;
            }
        }
        return false;
    }
}