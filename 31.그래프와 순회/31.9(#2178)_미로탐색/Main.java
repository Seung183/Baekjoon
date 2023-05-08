import java.io.*;
import java.util.*;
public class Main {

    private static int N; //vertex
    private static int M; //edge
    private static int R; //시작 vertex
    private static boolean[] visited; // 방문 여부
    private static ArrayList<Integer>[] A; //그래프 생성
    private static int[] check; //몇번째 방문인지 노드별로 나타낼 배열
    private static int count; //방문순서
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];

        A = new ArrayList[N+1];

        check = new int[N+1];

        for(int i = 1; i<N+1; i++){
            A[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            A[start].add(end);
            A[end].add(start);
        }

        for(int i = 1; i<N+1; i++){
            Collections.sort(A[i]);
        }

        check[R] = 1;
        visited[R] = true;
        count = 2;
        DFS(R);

        for(int i = 1; i< N+1; i++){
            bw.write(check[i]+"\n");
        }
        bw.flush();
        bw.close();
    }

    private static void DFS(int v) {
        for(int k : A[v]){
            if(!visited[k]){
                check[k] = count++;
                visited[k] = true;
                DFS(k);
            }
        }
    }
}
//무방향 그래프