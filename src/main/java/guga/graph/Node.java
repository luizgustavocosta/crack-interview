package guga.graph;

class Node {
    private Node adjacent[];
    public int adjacentCount;
    private String vertex;
    public State state;
    public Node(String vertex, int adjacentLength) {
        this.vertex = vertex;
        adjacentCount = 0;
        adjacent = new Node[adjacentLength];
    }

    public void addAdjacent(Node x) {
        if (adjacentCount < 30) {
            this.adjacent[adjacentCount] = x;
            adjacentCount++;
        } else {
            System.out.print("No more adjacent can be added");
        }
    }
    public Node[] getAdjacent() {
        return adjacent;
    }

    @Override
    public String toString() {
        return vertex;
    }

    public String vertex() {
        return vertex;
    }
}
