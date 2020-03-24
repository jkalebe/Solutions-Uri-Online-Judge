import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


public class URI1212 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = new PrintStream(System.out);

        String line;
        int carry;
        int oper1;
        int oper2;
        String [] split;
        int a,b;
        int r;
        while(!(line = input.readLine()).equals("0 0")){
            split = line.split(" ");
            a = Integer.parseInt(split[0]);
            b = Integer.parseInt(split[1]);
            carry=0;
            r=0;
            while (true) {
                oper1 = a % 10;
                oper2 = b % 10;
                
                a /=10;
                b /=10;
                
                if((oper1+oper2+r) > 9){
                    r=1;
                    carry++;
                }
                else{
                    r=0;
                }

                if(a==0 && b==0){
                    break;
                }
                
            }
            out.println(carry != 0 ?  (carry == 1 ? (carry + " carry operation."):(carry + " carry operations.")) : ("No carry operation."));           
        }
    }
}