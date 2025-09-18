import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bibliotek {
    public static void main(String[] args) {

        Author a1 = new Author("Adam");
        Author a2 = new Author("Palle");
        Author a3 = new Author("Kevin");


        List<Book> books = new ArrayList<Book>();
        Book book1 = new Book("Inter", a1, "123");
        Book book2 = new Book("Incept", a2, "321");
        Book book3 = new Book("Shutter", a3, "1234");
        books.add(book1);
        books.add(book2);
        books.add(book3);


        List<Borrower> borrowers = new ArrayList<Borrower>();
        Borrower borrower1 = new Borrower("Sture Steffe", "Steffe05", "Stefan");
        Borrower borrower2 = new Borrower("fighter Kevve", "Kevin05", "Kevin");
        Borrower borrower3 = new Borrower("gymJoel", "Joel05", "Joel");
        borrowers.add(borrower1);
        borrowers.add(borrower2);
        borrowers.add(borrower3);


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
                        System.out.println("Choose an option!\n1. Display books\n2. Loan a book\n3. Leave a book back\n4. Find book by isbn\n5. Logout");

                        int option = sc.nextInt();
                        sc.nextLine();  // consume newline

                        switch (option) {
                            case 1:
                                for (Book book : books) {
                                    System.out.println(book);
                                }
                                System.out.println("cant dipslay books yet");
                                break;
                            case 2:
                                System.out.println("What book do you want to loan? (Write title uppercase doesn't matter)");

                            case 3:
                                System.out.println("What book do you want to return? uppercase doesn't matter");

                                break;
                            case 4:
                                System.out.println("Write a isbn number");
                                String isbn = sc.next();
                                for (Book book : books) {
                                    if (book.getIsbn().equals(isbn)) {
                                        System.out.println(book);
                                    }
                                }
                                break;
                            case 5:
                                System.out.println("loggin out");
                                loggedIn = false;
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
