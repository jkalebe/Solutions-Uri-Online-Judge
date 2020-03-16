import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class URI1193 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = new PrintStream(System.out);
        int N = Integer.parseInt(input.readLine());
        for (int i = 0; i < N; i++) {
            String [] line = input.readLine().split(" ");
            System.out.println("Case "+ (i + 1)+":");
            switch(line[1]){
                case "bin":
                    out.println(Integer.parseInt(line[0], 2) + " dec");
                    out.println(Integer.toString(Integer.parseInt(line[0], 2), 16) + " hex");
                    System.out.println();
                    break;
                case "dec":
                    out.println(Integer.toString(Integer.parseInt(line[0]), 16) + " hex");
                    out.println(Integer.toString(Integer.parseInt(line[0]), 2) + " bin");
                    System.out.println();
                    break;
                case "hex":
                    out.println(Integer.parseInt(line[0], 16) + " dec");
                    out.println(Integer.toString(Integer.parseInt(line[0], 16), 2) + " bin");
                    System.out.println();
                    break;
            }

        }
    }
}