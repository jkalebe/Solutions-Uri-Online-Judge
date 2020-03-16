import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class URI1039 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = new PrintStream(System.out);
    public static void main(String[] args) throws IOException {
        int r1,x1,y1,r2,x2,y2;
        double dAB;
        //!(instancias = input.readLine().split(" "))[0].equals("")
        //obs, sempre use o metodo ready para função de parada
		while(input.ready()){
            String [] instancias = input.readLine().split(" ");
            
            r1 = Integer.parseInt(instancias[0]);
            x1 = Integer.parseInt(instancias[1]);
            y1 = Integer.parseInt(instancias[2]);
            r2 = Integer.parseInt(instancias[3]);
            x2 = Integer.parseInt(instancias[4]);
            y2 = Integer.parseInt(instancias[5]);
            dAB = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
            
            //(r2 + dAB)<=r1  && r1>r2 && dAB<r1
            if((r2 + dAB)<=r1  && r1>r2 && dAB<r1)
                out.println("RICO");
            else
                out.println("MORTO");       
        }
        out.close();
    }
}