import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Q2667 {
    static int bfs(int[][] graph, int x, int y, boolean[][] visited, int n){
        Queue<Integer> x_queue = new LinkedList<>();
        Queue<Integer> y_queue = new LinkedList<>();

        x_queue.add(x);
        y_queue.add(y);
        
        visited[x][y] = true;
        int house = 0;

        while(!x_queue.isEmpty()){
            x = x_queue.poll();
            y = y_queue.poll();

            house++;

            if(x+1 < n && graph[x+1][y] == 1 && !visited[x+1][y]){
                x_queue.add(x+1);
                y_queue.add(y);
                visited[x+1][y] = true;
            }

            if(x-1 >= 0 && graph[x-1][y] == 1 && !visited[x-1][y]){
                x_queue.add(x-1);
                y_queue.add(y);
                visited[x-1][y] = true;
            }

            if(y+1 < n && graph[x][y+1] == 1 && !visited[x][y+1]){
                x_queue.add(x);
                y_queue.add(y+1);
                visited[x][y+1] = true;
            }

            if(y-1 >= 0 && graph[x][y-1] == 1 && !visited[x][y-1]){
                x_queue.add(x);
                y_queue.add(y-1);
                visited[x][y-1] = true;
            }
        }

        return house;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] graph = new int[n][n];

        for(int i=0; i<n; i++){
            String[] line = br.readLine().split("");

            for(int j=0; j<n; j++){
                if(line[j].equals("1")){
                    graph[i][j] = 1;
                }
            }
        }

        boolean[][] visited = new boolean[n][n];

        int total = 0;
        ArrayList<Integer> houses = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(graph[i][j] == 1 && !visited[i][j]){
                    total++;
                    houses.add(bfs(graph, i, j, visited, n));
                }
            }
        }

        Collections.sort(houses);

        StringBuilder sb = new StringBuilder();
        sb.append(total + "\n");

        for(int house:houses){
            sb.append(house + "\n");
        }

        System.out.print(sb);
    }
}