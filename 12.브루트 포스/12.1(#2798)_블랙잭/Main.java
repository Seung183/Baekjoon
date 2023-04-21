import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        //카드 갯수
        int numOfCard = Integer.parseInt(st.nextToken());
        //숫자(number) , 넘지 않는 최대한 가까운 카드 3장의 합을 구하기 위함
        int number = Integer.parseInt(st.nextToken());

        //카드숫자를 저장할 배열
        int[] arrayCard = new int[numOfCard];

        st = new StringTokenizer(br.readLine());
        // 카드숫자 저장
        for(int i = 0; i<numOfCard; i++){
            arrayCard[i] = Integer.parseInt(st.nextToken());
        }

        // 오름차순 정렬
        Arrays.sort(arrayCard);

        //특정 숫자를 넘지 않는 최댓값
        int max = 0;

        //순서대로 전부 조회
        for(int i = 0; i < numOfCard-2; i++){
            for(int j = i+1; j < numOfCard-1; j++){
                for(int k = j+1; k < numOfCard; k++){
                    // 특정 숫자를 넘지 않는다면
                    if(arrayCard[i] + arrayCard[j] + arrayCard[k] <= number){
                        //가장 큰 숫자는 카드 세개를 더한값과 max의 최대값
                        max = Math.max(arrayCard[i] + arrayCard[j] + arrayCard[k],max);
                    }
                }
            }
        }
        
        System.out.print(max);
    }
}


