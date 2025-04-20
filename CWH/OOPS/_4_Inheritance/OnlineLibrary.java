package CWH.OOPS._4_Inheritance;

import java.util.ArrayList;

public class OnlineLibrary {
    public static void main(String[] args) {
        Library l = new Library();
        System.out.println(l.showAvailableBooks());

        l.addBook("apple");
        // System.out.println(l.showAvailableBooks());
        // l.addBook(null);
        // System.out.println(l.showAvailableBooks());

        l.addBook("CPP: the great");
        System.out.println(l.showAvailableBooks());

        System.out.println(l.issueBook("apple"));
        System.out.println(l.showAvailableBooks());

        System.out.println(l.showIssuedBooks());

        l.returnBook("apple");
        System.out.println(l.showAvailableBooks());

        System.out.println(l.showIssuedBooks());

    }

}

// YOU have to implement a library using Java Class Library
// Methods: addBook, issueBook, returnBook, showAvailableBooks
// Properties: Array to store the available books,
// Array to store the issued books

class Library {
    String book;
    String[] availableBooks;
    String[] issuedBooks;
    int counter = 0;
    int issued = 0;

    Library() {
        availableBooks = new String[100];
        issuedBooks = new String[100];
    }

    void addBook(String book) {
        if (book != null) {
            availableBooks[counter++] = book;
            System.out.println("Book Added!");
        } else {
            System.err.println("Error: Book Not added! Book cannot be null!");
        }

    }

    String issueBook(String book) {
        String res = "Not Found";
        for (int i = 0; i < counter; i++) {
            if (availableBooks[i].equals(book)) { // edit: used the equal method instead of ==
                issuedBooks[issued++] = book;
                for (int j = i; j < counter; j++) {
                    availableBooks[j] = availableBooks[j + 1];
                }
                counter--;
                return "Book Issued : " + book;
            }
        }
        return res;

    }

    void returnBook(String book) {
        if (book != null) {
            for (int i = 0; i < issued; i++) {
                if (issuedBooks[i].equals(book)) { // edit: used the equal method instead of ==
                    availableBooks[counter++] = book;
                    for (int j = i; j < issued; j++) {
                        issuedBooks[j] = issuedBooks[j + 1];
                    }
                    issued--;
                }
            }
            System.out.println("Book Returned Successfully!");
        } else {
            System.out.println("Error: Can't Find the Book!");
        }

    }

    public String showIssuedBooks() {
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < issued; i++) { // counter represents the count of the books added.
            res.add(issuedBooks[i]);
        }
        if (res.isEmpty()) {
            return "No Books Issued!";
        }
        return "Issued Books : " + String.valueOf(res);
    }

    public String showAvailableBooks() {
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < counter; i++) { // counter represents the count of the books added.
            res.add(availableBooks[i]);
        }
        if (res.isEmpty()) {
            return "Empty : No Books!";

        }
        return "Available Books : " + String.valueOf(res);
    }
}