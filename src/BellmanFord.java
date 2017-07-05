import java.util.ArrayList;

/**
 * O(VE)
 */
public class BellmanFord {

  class Node {
    int distance;
    Node() {

    }
  }

  class Edge {
    Node src, dest;
    int weight;
  }

  ArrayList<Node> nodes = new ArrayList<>();
  ArrayList<Edge> edges = new ArrayList<>();

  void BellmanFord(Node root, int V, int E) {
    int dist[] = new int[V];

    //nodes can just distances array
    //edges can just be 3 int object

    // Step 1: Initialize distances from src to all other
    // vertices as INFINITE
//    for (int i = 0; i < V; ++i)
//      dist[i] = Integer.MAX_VALUE;
//    dist[root.label] = 0;
    for (Node n : nodes) {
      n.distance = Integer.MAX_VALUE;
    }
    root.distance = 0;

    // Step 2: Relax all edges |V| - 1 times. A simple
    // shortest path from src to any other vertex can
    // have at-most |V| - 1 edges
    for (int i = 1; i < V; ++i) {
      for (int j = 0; j < E; ++j) {
        Node u = edges.get(j).src;
        Node v = edges.get(j).dest;
        int weight = edges.get(j).weight;
        if (u.distance != Integer.MAX_VALUE &&
            u.distance + weight < v.distance)
          v.distance = u.distance + weight;
      }
    }

    // Step 3: check for negative-weight cycles.  The above
    // step guarantees shortest distances if graph doesn't
    // contain negative weight cycle. If we get a shorter
    //  path, then there is a cycle.
    for (int j = 0; j < E; ++j) {
      Node u = edges.get(j).src;
      Node v = edges.get(j).dest;
      int weight = edges.get(j).weight;
      if (u.distance != Integer.MAX_VALUE &&
          u.distance + weight < v.distance)
        v.distance = u.distance + weight;
    }
  }

  public static void main(String[] args) {

  }
}
