package com.company;
import java.util.*;
/**
 * Created by QuantumSpark on 2016-10-02.
 */
public class Prim {
    public static int inf = Integer.MAX_VALUE;
    public static void solve () {
        Scanner in = new Scanner(System.in);

        int vertices = in.nextInt();
        int edges = in.nextInt();
        int[][] adjMatrix = new int[vertices][vertices];

        boolean[] visited = new boolean[vertices];
        for (int i =0 ; i < vertices;i ++) {
            for (int j =0; j < vertices; j++) {

                    adjMatrix[i][j] = inf;

            }
        }



        int source, destination, weight;
        for (int i = 0; i < edges ; i++) {
            source = in.nextInt();
            destination = in.nextInt();
            weight = in.nextInt();
            adjMatrix[source-1][destination-1] = Math.min(weight, adjMatrix[source-1][destination-1]);
            adjMatrix[destination-1][source-1] = Math.min(weight, adjMatrix[destination-1][source-1]);
        }

        for (int i = 0 ; i < vertices ; i++) {
            visited[i] = false;
        }

        int start = in.nextInt();

        visited[start-1] = true;


        primAlgorithm(adjMatrix, visited, vertices);

    }

    private static void primAlgorithm (int[][] adjMatrix, boolean[] visited, int vertices) {
        int total = 0;
        int k = 0;
        int dest=0;
        while (k < vertices-1) {
            int min = inf;
            for (int i =0; i < vertices; i++) {
                if (visited[i]){
                    for (int j = 0; j < vertices; j++) {
                        if (!visited[j]) {
                            if (min > adjMatrix[i][j]) {
                                min = adjMatrix[i][j];
                                dest = j;
                            }
                        }
                    }

                }
            }
            k++;
            visited[dest] = true;
            total+= min;
        }

        System.out.println(total);
    }

}
