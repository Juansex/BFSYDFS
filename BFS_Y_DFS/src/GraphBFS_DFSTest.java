import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class GraphBFS_DFSTest {
    @Test
    public void testBFS() {
        GraphBFS_DFS<Integer> graph = new GraphBFS_DFS<>();
        graph.addVertexToGraph(1);
        graph.addVertexToGraph(2);
        graph.addVertexToGraph(3);
        graph.addVertexToGraph(4);
        graph.addArista(1, 2, true);
        graph.addArista(1, 3, true);
        graph.addArista(2, 4, true);
        graph.addArista(3, 4, true);

        String bfsResult = graph.BFS(1);
        assertEquals("1 2 3 4", bfsResult);
    }

    @Test
    public void testBFS_EmptyGraph() {
        GraphBFS_DFS<Integer> graph = new GraphBFS_DFS<>();

        String bfsResult = graph.BFS(1);
        assertEquals("", bfsResult);
    }

    @Test
    public void testBFS_DisconnectedGraph() {
        GraphBFS_DFS<Integer> graph = new GraphBFS_DFS<>();
        graph.addVertexToGraph(1);
        graph.addVertexToGraph(2);
        graph.addVertexToGraph(3);

        String bfsResult = graph.BFS(1);
        assertEquals("1", bfsResult);
    }

    @Test
    public void testDFS() {
        GraphBFS_DFS<Integer> graph = new GraphBFS_DFS<>();
        graph.addVertexToGraph(1);
        graph.addVertexToGraph(2);
        graph.addVertexToGraph(3);
        graph.addVertexToGraph(4);
        graph.addArista(1, 2, true);
        graph.addArista(1, 3, true);
        graph.addArista(2, 4, true);
        graph.addArista(3, 4, true);

        String dfsResult = graph.DFS(1);
        assertEquals("1 2 4 3", dfsResult);
    }

    @Test
    public void testDFS_EmptyGraph() {
        GraphBFS_DFS<Integer> graph = new GraphBFS_DFS<>();

        String dfsResult = graph.DFS(1);
        assertEquals("", dfsResult);
    }

    @Test
    public void testDFS_DisconnectedGraph() {
        GraphBFS_DFS<Integer> graph = new GraphBFS_DFS<>();
        graph.addVertexToGraph(1);
        graph.addVertexToGraph(2);
        graph.addVertexToGraph(3);

        String dfsResult = graph.DFS(1);
        assertEquals("1", dfsResult);
    }
}
