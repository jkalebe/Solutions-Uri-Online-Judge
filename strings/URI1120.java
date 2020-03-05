import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class URI1120 {
    
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = new PrintStream(System.out);

    public static void main(String[] args) throws IOException {
        String input;
        while(!(input = in.readLine()).equals("0 0")){
            String [] string = input.split(" ");
            String D = string[0];
            String N = string[1];
            String r = N.replace(D, "");
            r = r.replaceFirst("0*", "");
            
            System.out.println(r.length()>0 ? r:0);   
        }
        out.close();
        }
}