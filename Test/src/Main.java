import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean c = true;
        Scanner scanner = new Scanner(System.in);
        while (c){
            System.out.println("Press \"x\" to exit or \"e\" to repeat");
            char sys = scanner.next().charAt(0);
            switch (sys){
                case 'x':
                    System.out.println("okay break;");
                    c = false;
                    break;
                case 'e':
                    System.out.println("lets go");
                    break;
                default:
                    System.out.println("not supported comand");
                    break;
            }
            System.out.println("okay, not go");
        }
    }
}
