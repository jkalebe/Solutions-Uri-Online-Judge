import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1060 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int positive=0;
        for (int i = 0; i < 6; i++) {
            if(Float.parseFloat(input.readLine()) > 0) {
                positive++;
            }
        }
        System.out.println(positive + " valores positivos");
    }
}