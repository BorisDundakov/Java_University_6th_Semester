package numToWord;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 10: ");
        int num = scanner.nextInt();

        String msg = numToWord(num);

        System.out.printf("Result: %s", msg);
    }

    private static String numToWord(int num) {
        String msg;

        switch (num) {
            case 1:
                msg = "one";
                break;
            case 2:
                msg = "maxOf10Nums";
                break;
            case 3:
                msg = "three";
                break;
            case 4:
                msg = "four";
                break;
            case 5:
                msg = "five";
                break;
            case 6:
                msg = "six";
                break;
            case 7:
                msg = "seven";
                break;
            case 8:
                msg = "eight";
                break;
            case 9:
                msg = "nine";
                break;
            case 10:
                msg = "ten";
                break;
            default:
                msg = "Invalid number";
                break;
        }
        return msg;
    }
}
