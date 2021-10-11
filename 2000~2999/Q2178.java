import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2178 {
    static int[][] graph;
    static boolean[][] visited;
    static int v1, v2;

    static class Point{
        int x, y, level;
        Point(int x, int y, int level){
            this.x = x;
            this.y = y;
            this.level = level;
        }
    }

    static int bfs(int end_x, int end_y){
        visited[0][0] = true;
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0, 1));

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        int level = 0;

        while(!queue.isEmpty()){
            Point p = queue.poll();
            level = p.level;

            if(p.x == end_x && p.y == end_y){
                break;
            }
            
            for(int i=0; i<4; i++){
                int x = p.x + dx[i];
                int y = p.y + dy[i];
                if(x >= 0 && x <= end_x && y >= 0 && y <= end_y){
                    if(graph[x][y] == 1 && !visited[x][y]){
                        visited[x][y] = true;
                        queue.add(new Point(x, y, level + 1));
                    }
                }
            }
        }

        return level;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // n x m 미로
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // graph 입력
        graph = new int[n][m];
        for(int i=0; i<n; i++){
            String[] line = br.readLine().split("");
            for(int j=0; j<m; j++){
                graph[i][j] = Integer.parseInt(line[j]);
            }
        }

        visited = new boolean[n][m];
        System.out.println(bfs(n-1, m-1));
    }
}
