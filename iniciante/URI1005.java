import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1005 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double A = Double.parseDouble(input.readLine());
        double B = Double.parseDouble(input.readLine());
        double media = (A*3.5+B*7.5)/(3.5+7.5);
        System.out.printf("MEDIA = %.5f\n", media);

    }
}