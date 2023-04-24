import java.io.*;
import java.util.*;
public class Main {
    static int n;
    static int max = 0;
    static char[][] candy;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        candy = new char[n][n];

        //사탕 입력
        for(int i = 0; i<n; i++){
            String color = br.readLine();
            for(int j = 0; j<n; j++){
                candy[i][j] = color.charAt(j);
            }
        }

        //사탕 가로줄 검사
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-1; j++){
                //사탕의 색이 다른 인접한 가로칸
                if(candy[i][j] != candy[i][j+1]){
                    //사탕의 위치를 바꿔준다.
                    swap(i,j,i,j+1);
                    
                    // 가로,세로 검사
                    checkRow();
                    checkColumn();

                    //다시 원위치
                    swap(i,j,i,j+1);
                }

            }
        }

        //사탕 세로줄 검사
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-1; j++){
                //사탕의 색이 다른 인접한 세로칸
                if(candy[j][i] != candy[j+1][i])
                    swap(j,i,j+1,i);

                    // 가로,세로 검사
                    checkRow();
                    checkColumn();
                    
                    //다시 원위치
                    swap(j,i,j+1,i);
            }
        }
        //최댓값 출력
        System.out.print(max);
    }
    // 사탕의 위치를 바꿔주는 method
    static void swap(int x1, int y1 , int x2 , int y2){
        char temp = candy[x1][y1];
        candy[x1][y1] = candy[x2][y2];
        candy[x2][y2] = temp;
    }
    //가로 검사
    static void checkRow(){
        int count;

        for(int i = 0; i< n; i++){
            // 한줄 검사가 끝나면 count = 1, 즉 1개만 먹을수 있다
            count = 1;
            for(int j = 0; j < n-1; j++){
                //다음 사탕도 같다면 count++
                if(candy[i][j] == candy[i][j+1])
                    count++;
                //달라진다면 다시 1개
                else
                    count = 1;
                
                //최대값 검사
                max = Math.max(max, count);
            }
        }
    }
    //세로 검사
    static void checkColumn(){
        int count;

        for(int i = 0; i< n; i++){
            count = 1;
            for(int j = 0; j < n-1; j++){
                if(candy[j][i] == candy[j+1][i])
                    count++;
                else
                    count = 1;
                max = Math.max(max, count);
            }
        }
    }
}


