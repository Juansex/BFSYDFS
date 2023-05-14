import java.util.*;
public class GraphBFS_DFS<T> {
    private Map<T, List<T>> hashMap = new HashMap<>();
    public void addVertexToGraph(T s) {
        hashMap.put(s, new LinkedList<T>());
    }
    public void addArista(T begin, T end, boolean bidirectional) {
        if (!hashMap.containsKey(begin))
            addVertexToGraph(begin);

        if (!hashMap.containsKey(end))
            addVertexToGraph(end);

        hashMap.get(begin).add(end);
        if (bidirectional == true) {
            hashMap.get(end).add(begin);
        }
    }

    public String BFS(T start) {
        Set<T> alreadyVisited = new HashSet<>();
        Queue<T> q = new LinkedList<>();
        String msgToReturn = "";
        alreadyVisited.add(start);
        q.add(start);
        while (!q.isEmpty()) {
            T vertex = q.poll();
            msgToReturn += vertex + " ";
            List<T> neighbors = hashMap.get(vertex);
            for (T neighbor : neighbors) {
                if (!alreadyVisited.contains(neighbor)) {
                    alreadyVisited.add(neighbor);
                    q.add(neighbor);
                }
            }
        }
        return msgToReturn;
    }

    public String DFS(T start) {
        Set<T> visited = new HashSet<>();

        return DFSHLP(start, visited);
    }

    private String DFSHLP(T vrtx, Set<T> vsted) {

        String msg = "";

        vsted.add(vrtx);
        msg += vrtx + " ";

        List<T> neighbors = hashMap.get(vrtx);

        for (T adj : neighbors) {
            if (!vsted.contains(adj)) {
                DFSHLP(adj, vsted);
            }
        }

        return msg;
    }
}