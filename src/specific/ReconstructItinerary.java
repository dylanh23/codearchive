package specific;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 Eulerian path, add to front, sorted by alphabet after position
 */
public class ReconstructItinerary {
    public class Solution{
        HashMap<String, PriorityQueue<String>> map = new HashMap<String, PriorityQueue<String>>();
        LinkedList<String> result = new LinkedList<String>();

        public List<String> findItinerary(String[][] tickets) {
            for (String[] ticket : tickets) {
                if (!map.containsKey(ticket[0])) {
                    PriorityQueue<String> q = new PriorityQueue<String>();
                    map.put(ticket[0], q);
                }
                map.get(ticket[0]).offer(ticket[1]);
            }

            dfs("JFK");
            return result;
        }

        public void dfs(String s) {
            PriorityQueue<String> q = map.get(s);

            while (q != null && !q.isEmpty()) {
                dfs(q.poll());
            }

            result.addFirst(s);
        }
    }

}
