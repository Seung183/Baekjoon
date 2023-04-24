import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        //9 난쟁이
        int[] height = new int[9];
        for(int i = 0; i<9; i++){
            height[i] = Integer.parseInt(br.readLine());
            sum += height[i];
        }

        for(int i = 0; i < 8; i++){
            for(int j = i + 1; j<9; j++){
                //만약 9난쟁이 총합 - i번째 난쟁이 - j번째 난쟁이 == 100
                if(sum - height[i] - height[j] == 100){
                    // i,j번째 난쟁이의 키를 0으로
                    height[i] = height[j] = 0;
                    Arrays.sort(height);
                    //오름차순 정렬
                    break;
                }
            }
            if(height[0] == 0 && height[1] == 0 )
                break;
        }

        for(int k = 2; k<9; k++){
            System.out.println(height[k]);
        }
    }
}


