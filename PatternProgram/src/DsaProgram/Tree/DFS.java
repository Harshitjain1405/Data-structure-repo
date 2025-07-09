package DsaProgram.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS {
    public static void main(String[] args) {
        int n = 4;
        List<List<Integer>> dfsNode = new ArrayList<>();

        for(int i = 0; i < n; i++ ) {
            dfsNode.add(new ArrayList<>());
        }
        dfsNode.get(0).add(1);
        dfsNode.get(0).add(2);
        dfsNode.get(1).add(0);
        dfsNode.get(1).add(3);
        dfsNode.get(2).add(0);
        dfsNode.get(3).add(1);

        dfsTransversing(0, dfsNode);
    }

    private static void dfsTransversing(int start, List<List<Integer>> dfsNode) {
        boolean[] visited = new boolean[dfsNode.size()];
        Stack<Integer> dfsStack = new Stack<>();
        dfsStack.push(start);

        System.out.println("\n");
        while(!dfsStack.empty()) {
            int node = dfsStack.pop();
            if(!visited[node]) {
                visited[node] = true;
            }
            System.out.print(node+ " ");
            for(int i = dfsNode.get(node).size() - 1; i >= 0; i--) {
                int neighbour = dfsNode.get(node).get(i);

                if(!visited[neighbour]) {
                    dfsStack.push(neighbour);

                }
            }
        }
    }
}
