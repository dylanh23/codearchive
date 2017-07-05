import java.util.ArrayList;
import java.util.HashSet;

/**
 O(VLogV)
 */
public class Dijkstra {

  class Node {
    int distance, v;
    ArrayList<Node> children = new ArrayList<>();
    ArrayList<Integer> cost = new ArrayList<>();
    Node(int v) {
      this.v = v;
    }
  }

  void shortestPath(Node root) {
    HashSet<Node> nodes = new HashSet<>();
    nodes.add(root);
    int min = Integer.MAX_VALUE;
    Node minVal = null;
    while (!nodes.isEmpty()) {
      for (Node n : nodes) {
        if (n.distance < min) {
          minVal = n;
          min = n.distance;
        }
      }
      if (minVal == null)
        break;
      for (int i = 0; i < minVal.children.size(); i++) {
        Node c = minVal.children.get(i);
        c.distance = minVal.distance + minVal.cost.get(i);
        nodes.add(c);
      }
      nodes.remove(minVal);
    }
  }


  int minDistance(int dist[], Boolean sptSet[], int V)
  {
    // Initialize min value
    int min = Integer.MAX_VALUE, min_index=-1;

    for (int v = 0; v < V; v++)
      if (!sptSet[v] && dist[v] <= min)
      {
        min = dist[v];
        min_index = v;
      }

    return min_index;
  }

  // Funtion that implements Dijkstra's single source shortest path
  // algorithm for a graph represented using adjacency matrix
  // representation
  void dijkstra(int graph[][], int src)
  {
    int V = graph.length;
    int dist[] = new int[V]; // The output array. dist[i] will hold
    // the shortest distance from src to i

    // sptSet[i] will true if vertex i is included in shortest
    // path tree or shortest distance from src to i is finalized
    Boolean sptSet[] = new Boolean[V];

    // Initialize all distances as INFINITE and stpSet[] as false
    for (int i = 0; i < V; i++)
    {
      dist[i] = Integer.MAX_VALUE;
      sptSet[i] = false;
    }

    // Distance of source vertex from itself is always 0
    dist[src] = 0;

    // Find shortest path for all vertices
    for (int count = 0; count < V-1; count++)
    {
      // Pick the minimum distance vertex from the set of vertices
      // not yet processed. u is always equal to src in first
      // iteration.
      int u = minDistance(dist, sptSet, V);

      // Mark the picked vertex as processed
      sptSet[u] = true;

      // Update dist value of the adjacent vertices of the
      // picked vertex.
      for (int v = 0; v < V; v++)

        // Update dist[v] only if is not in sptSet, there is an
        // edge from u to v, and total weight of path from src to
        // v through u is smaller than current value of dist[v]
        if (!sptSet[v] && graph[u][v]!=0 &&
            dist[u] != Integer.MAX_VALUE &&
            dist[u]+graph[u][v] < dist[v])
          dist[v] = dist[u] + graph[u][v];
    }
  }
}
