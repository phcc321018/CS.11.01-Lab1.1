import java.util.Scanner;
public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dating Age Rule
        System.out.print("Enter your age: ");

        int age = scanner.nextInt();
        // Book Pages Rule
        int pagesToRead = 100 - age;
        System.out.println(age + "-year olds should read at least " + pagesToRead + " pages before giving up on a book.");


    }
}
