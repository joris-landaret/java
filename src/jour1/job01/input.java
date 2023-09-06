package jour1.job01;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        System.out.println("java HelloWorld");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez entrer votre nom : ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
