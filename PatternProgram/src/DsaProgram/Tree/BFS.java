package DsaProgram.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        int n = 4;
        List<List<Integer>> bfsNode = new ArrayList<>();
        for(int i = 0; i<n; i++) {
            bfsNode.add(new ArrayList<>());
        }

        bfsNode.get(0).add(1);
        bfsNode.get(0).add(2);
        bfsNode.get(1).add(0);
        bfsNode.get(1).add(3);
        bfsNode.get(2).add(0);
        bfsNode.get(3).add(1);

        bfsNodeTranversal(0,bfsNode);
    }

    private static void bfsNodeTranversal(int start, List<List<Integer>> bfsNode) {
        boolean[] visited = new boolean[bfsNode.size()];
        Queue<Integer> bfsQueue = new LinkedList<>();
        bfsQueue.add(start);
        visited[start] = true;
        System.out.println("\n");
        while(!bfsQueue.isEmpty()) {
            int node = bfsQueue.poll();
            System.out.print(node + " ");

            for(int neighbour : bfsNode.get(node)){
                if(!visited[neighbour]) {
                    visited[neighbour] = true;
                    bfsQueue.add(neighbour);
                }
            }
        }
    }
}
