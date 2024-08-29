package Graph;

public class Basic {
    /*
    It is a non-linear data structure used for storing data .
    It is a set of vertices and a collection of edges that connects a pair of vertices.
    In below example 1,2,3,4,5 are the vertex of graph and each line connecting them is
    called as Edge.

    Applications - Social Network
    Graphs help us implement Social Networking sites such as, Facebook, Twitter etc .
    It can be called as Social Networking graph
    Names of people represent vertices of Graph.
    Friendship between two people can be represented as an Edge of Graph.

    Applications- Web content over the Internet
    Graphs help us organize Web content over the Internet.
    Webpages such as google.com , udemy.com etc. represent vertices of Graph
    A link between two webpages can be represented as an Edge of Graph.

     What is an Undirected Graph ?

     vertex -->  0 --- 1
                 | \    \
                 |  \    2
                 3---4 /
                   ^
                   |
                 undirected edge

        Example - Social Networking Graph is an undirected graph
        If John (vertex) is friend (edge) to Max(vertex) is also friend(edge) to John (vertex)
                    John ------------ Max
                          friendship



          Adjacency Matrix Representation (Undirected Graph )
                                                 0     1      2     3
            0 ----------- 1                  0   0     1      0     1
            |             |                  1   1     0      1     0
            |             |                  2   0     1      0     1
            3 ----------- 2                  3   1     0      1     0
            Undirected graph                         adjacency matrix[][]
                            1
                  row ------------ col



  public class Graph {
  int[][] adjMatrix ;

  public Graph(int nodes) {
          this.adjMatrix = new int[nodes][nodes];
          }

  public void addEdge(int u,int v){
     this.adjMatrix[u][v] = 1;
     this.adjMatrix[v][u] = 1;
    }

    public static void main(String[] args){
    Graph g = new Graph(4);
    g.addEdge(0,1);
    g.addEdge(1,2);
    g.addEdge(2,3);
    g.addEdge(3,0);
       }
     }



         */
}
