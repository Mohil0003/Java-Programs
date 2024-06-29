/*Declare a class called book having author_name as private data member. Extend book class to have two sub classes called 
book_publication & paper_publication. Each of these classes have private member called title. Write a complete program to 
show usage of dynamic method dispatch (dynamic polymorphism) to display book or paper publications of given author.Use 
command line arguments for inputting data
 */

import java.util.Scanner;

class Book {
    private String author_name;

    Book() {
    }

    Book(String author_name) {
        this.author_name = author_name;
        System.out.println("author name is : " + author_name);
    }

}

class Book_Publication extends Book {
    private String title;

    Book_Publication(String title) {
        this.title = title;
        System.out.println("Book Name  is : " + title);
    }
}

class Paper_Publication extends Book {
    private String title;

    Paper_Publication(String title) {
        this.title = title;
        System.out.println("Paper Name is : " + title);
    }

}

public class J0602Book {
    public static void main(String[] args) {

        Book b;
        for (int i = 0; i < 3; i++)
            if (args[i] == args[1] && args[i].equals("book")) {
                Book b2= new Book_Publication(args[i]);
            } else if (args[i] == args[1] && args[i].equals("paper")) {
                Book b1 = new Paper_Publication(args[i]);
            } else if (args[i] == args[0]) {
                b = new Book(args[i]);
            }
    }
}
