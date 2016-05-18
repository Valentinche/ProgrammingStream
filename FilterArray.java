
import java.util.Arrays;

import java.util.Scanner;


public class FilterArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] someText = input.nextLine().split(" ");
        if (someText.length < 3) {
            System.out.print("(empty)");

            Arrays.stream(someText)
                    .filter(t -> t.length() > 3)
                    .forEach(t -> System.out.print(" " + t));
        }

    }


}

