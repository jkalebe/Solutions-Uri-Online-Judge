import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URI1052 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String months="";
        switch(Integer.parseInt(input.readLine())){
            case 1: months = "January"; break;
            case 2: months = "February"; break;
            case 3: months = "March"; break;
            case 4: months = "April"; break;
            case 5: months = "May"; break;
            case 6: months = "June"; break;
            case 7: months = "July"; break;
            case 8: months = "August"; break;
            case 9: months = "September"; break;
            case 10: months = "October"; break;
            case 11: months = "November"; break;
            case 12: months = "December"; break;
        }
        System.out.println(months);
    }
}