import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

/**
 * Created by dhare on 5/30/2017.
 */
public class BellManFord {

    public static void main(String[] args) {
        int[][] edges = {
                {0, -1, 4, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, 0, 3, 2, 2},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, 0, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, 1, 5, 0, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, -3, 0}
        };
        BellmanFord(edges, 0);
        System.out.println();
    }

    // The main function that finds shortest distances from src
    // to all other vertices using Bellman-Ford algorithm.  The
    // function also detects negative weight cycle
    static void BellmanFord(int[][] edges, int src) {
        int V = edges[0].length;
        int dist[] = new int[V];

        // Step 1: Initialize distances from src to all other
        // vertices as INFINITE
        for (int i = 0; i < V; i++)
            dist[i] = Integer.MAX_VALUE;
        dist[src] = 0;

        // Step 2: Relax all edges |V| - 1 times. A simple
        // shortest path from src to any other vertex can
        // have at-most |V| - 1 edges
        // var++ is the value of the variable before incrementing, whereas the result returned by ++var is the value of the variable after the increment is applied.
        for (int i = 1; i < V; i++) {
            for (int j = 0; j < V; j++) {
                for (int k = 0; k < V; k++) {
                    if (j != k && edges[j][k] != Integer.MAX_VALUE) {
                        int weight = edges[j][k];
                        if (dist[j] != Integer.MAX_VALUE && dist[j] + weight < dist[k])
                            dist[k] = dist[j] + weight;
                    }
                }
            }
        }

        // Step 3: check for negative-weight cycles.  The above
        // step guarantees shortest distances if graph doesn't
        // contain negative weight cycle. If we get a shorter
        //  path, then there is a cycle.
        for (int j = 0; j < V; j++) {
            for (int k = 0; k < V; k++) {
                if (j != k && edges[j][k] != Integer.MAX_VALUE) {
                    int weight = edges[j][k];
                    if (dist[j] != Integer.MAX_VALUE && dist[j] + weight < dist[k])
                        System.out.println("Graph contains negative weight cycle");
                }
            }
        }
        System.out.println();
    }
}
