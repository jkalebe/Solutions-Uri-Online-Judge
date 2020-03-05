import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1168 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(input.readLine());
            int[] leds = {6,2,5,5,4,5,6,3,7,6};
            int count;
            char [] c1;
            while(N-- > 0){
                c1 = input.readLine().toCharArray();
                count=0;
                for (char c : c1) {
                    count+= leds[Integer.parseInt(String.valueOf(c))];
                }
                System.out.println(count + " leds");
            }
    }
}