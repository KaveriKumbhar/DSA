import java.util.*;

public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER TWO NUMBERS : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("\n 1.ADDITION \n 2.SUBSTRAACTION \n 3.MULTIPLICATION \n 4.DIVISION \n5.EXIT");
        System.out.println("ENTER YOUR CHOICE : ");
        int ch = sc.nextInt();

        // while (true) {
            switch (ch) {
                case 1:
                    System.out.println("ADDITION IS : " + (a + b));
                    break;
                case 2:
                    System.out.println("SUBSTRACTION IS : " + (a - b));
                    break;
                case 3:
                    System.out.println("MULTIPLICATION IS : " + (a * b));
                    break;
                case 4:
                    System.out.println("DIVISION IS : " + (a/b));
                    break;

                default:
                    break;
            }
        // }
    }
}
