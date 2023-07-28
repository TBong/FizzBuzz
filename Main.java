import java.io.FilterOutputStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(11, 20));
    }

    public static String fizzBuzz(int begin, int end) {
        String out = "";
        for (int i = begin; i <= end; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                out = "FizzBuzz";
            }
            else if (i % 5 == 0) {
                out = "Buzz";
            }
            else if (i % 3 == 0) {
                out = "Fizz";
            }
            else {
                out = Integer.toString(i);
            }
            if (i < end) {
                System.out.println(out);
            }
        }
        return (out);
    }
}
