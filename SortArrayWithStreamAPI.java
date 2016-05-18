import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String ordernums = input.nextLine();
        Pattern patt=Pattern.compile("([A-Za-z\\.]{3,})\\w+");
        Matcher match=patt.matcher(ordernums);

            while (match.find()){
                System.out.print(match.group());
                System.out.print(" ");
            }

    }
}
