import java.util.Scanner;

public class Meny {
    public static void main(String[] args) {
        while (true) {
            System.out.println("1. login");
            System.out.println("2. Exit");
            Scanner sc = new Scanner(System.in);
            int userInput = sc.nextInt();

            if (userInput == 1) {
                System.out.println("Enter username: ");
                String inputUsername = sc.next();
                System.out.println("Enter password");
                String inputPassword = sc.next();

                if (inputUsername.equalsIgnoreCase("Steffe") && inputPassword.equals("123")) {
                    boolean loggedIn = true;
                    while (loggedIn) {
                        System.out.println("Choose an option!\n1. Display books\n2. Loan a book\n3. Leave a book back\n4. Logout");

                        int option = sc.nextInt();
                        sc.nextLine();  // consume newline

                        switch (option) {
                            case 1:
                                System.out.println("cant dipslay books yet");
                                break;
                            case 2:
                                System.out.println("What book do you want to loan? (Write title uppercase doesn't matter)");

                            case 3:
                                System.out.println("What book do you want to return? uppercase doesn't matter");

                                break;
                            case 4:
                                System.out.println("Logging out...");

                                loggedIn = false;  // Exit from the login menu loop
                                break;
                            default:
                                System.out.println("Invalid option, please try again.");
                        }
                    }
                } else {
                    System.out.println("Wrong password or username");
                }


            } else {
                System.out.println("You choose to exit");
            }

        }
    }
}
