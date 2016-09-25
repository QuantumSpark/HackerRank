package com.company;
import java.util.*;

/**
 * Created by QuantumSpark on 2016-08-07.
 */

class eNode {
    private int id;
    private List<eNode> children = new LinkedList<>();

    public eNode (int id) {
        this.id = id;
    }

    public void addChild (eNode node) {
        children.add(node);
    }

    public List<eNode> getChildren() {
        return children;
    }
}

public class EvenTree {

    public static void solve () {
        Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int m = in.nextInt();
            eNode[] nodes = new eNode[n];

            for  (int r = 0 ; r< n ; r++) {
                nodes[r] = new eNode(r+1);
            }

            for (int j = 0; j < m ; j++) {
                int idOfChildNode = in.nextInt();
                int idOfParentNode = in.nextInt();
                nodes[idOfParentNode-1].addChild(nodes[idOfChildNode-1]);
            }

            removeEdges(nodes, n);


    }

    private static void removeEdges(eNode[] nodes, int n) {
       int result = -1;
        for (int i =0 ; i< n; i++) {
            int size=  count(nodes[i])-1;
           if (size %2 != 0) {
                result++;
           }
       }

       System.out.println(result);
    }

    private static int count(eNode node) {
        int num = 1;
        for (eNode enode : node.getChildren()){
            num += count(enode);
        }

        return num;
    }


    private static int dfs (eNode node) {
        return 0;
    }

}
