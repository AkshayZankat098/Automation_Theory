package Theory;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Character.isDigit;

public class Practice {

        public static void main(String[] args) {

            String str = "a115";

            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                   count = count + Character.getNumericValue(str.charAt(i));
                }
            }

            System.out.println(count);
        }
}

