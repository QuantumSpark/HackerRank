package com.company;

import java.util.*;


/**
 * Created by QuantumSpark on 2016-08-01.
 */
// Had Help from Devon Graham, UBC CPSC grad student

class Node implements Comparable<Node> {
    private int id;
    private int distance =  90000;
    Node (int id ) {
        this.id = id;
    }

    public void setDistance (int distance) {
        this.distance = distance;
    }
    public int getDistance () {
        return distance;
    }

    public int getId() {
        return id;
    }


    @Override
    public int compareTo(Node o) {
        return Integer.valueOf(this.distance).compareTo(o.distance);
    }
}

public class Dijkstra {
    public static void solve () {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t ; i++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[][] adjmatrix = new int[n][n];
            Node[] nodes = new Node[n];

            for  (int r = 0 ; r< n ; r++) {
                nodes[r] = new Node(r+1);
            }
            for(int r=0; r< n ; r++)
                for(int c=0; c< n; c++) {
                    adjmatrix[r][c] = 90000;
                }

            for (int j = 0; j < m ; j++ ) {
                int tmp1 = in.nextInt();
                int tmp2 = in.nextInt();
                int tmp3 = in.nextInt();
                adjmatrix[tmp1-1][tmp2-1] = Math.min(tmp3, adjmatrix[tmp1-1][tmp2-1] );
                adjmatrix[tmp2-1][tmp1-1] = Math.min(tmp3, adjmatrix[tmp2-1][tmp1-1] );

            }
            int s = in.nextInt();
            findMinDistance (adjmatrix, nodes ,s, n);
        }
    }

    private static void findMinDistance(int[][] adjmatrix, Node[] nodes, int s, int n) {
        nodes[s-1].setDistance(0);
        PriorityQueue<Node> q = new PriorityQueue<>();
        for (int i =0 ; i < n; i ++) {
            q.add(nodes[i]);
        }
        while (!q.isEmpty()) {
            Node u = q.poll();
            int id = u.getId()-1;
            for (int  v =0; v < n ; v++) {
                if (adjmatrix[id][v] != -1) {
                    int newdist = u.getDistance() + adjmatrix[id][v];
                    if (nodes[v].getDistance() > newdist) {
                        nodes[v].setDistance(newdist);
                        // this emulates decrease in key operation
                        q.remove(nodes[v]);
                        q.add(nodes[v]);
                    }
                }
            }

        }

        for(int j=0; j< n; j++){
            if(nodes[j].getDistance()==90000){
                System.out.print("-1 ");
            }
            else if(nodes[j].getDistance() !=0) {
                System.out.print(nodes[j].getDistance() + " ");
            }
        }
        System.out.println("");

    }


}

