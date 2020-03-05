
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1024{
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int N= Integer.parseInt(input.readLine()), length, metade;
        char [] c1;
        char temp;
        while (N-- > 0) {
            
            c1 = input.readLine().toCharArray();
            length = c1.length;
            if(length>=1 && length <= 1000){
                metade = length/2;
                
                for (int i=0; i<length;i++) {
                    if(Character.isLetter(c1[i]))
                        c1[i] = (char)((int) c1[i]+3);
                }
                for (int i = 0; i < metade; i++) {
                    temp=c1[i];
                    c1[i] = c1[c1.length - i - 1];
                    c1[c1.length - i - 1] = temp;
                }
    
                for (int i = metade; i < length; ++i) {
                    c1[i] = (char)((int)c1[i]-1);
                }
                System.out.println(String.valueOf(c1));
            }
        }
        input.close();        
    }
}