import java.util.ArrayList;
import java.util.Scanner;
class Library{

    Library(){

    }
    public void addBooks(String abook){
        availableBooks.add(abook);
        System.out.println("The available books are :" +availableBooks);


    }

    public void issueBook(String ibook){
        availableBooks.remove(ibook);
        System.out.println("After issuing book %\s the remaining books are:  "+availableBooks);

    }

    public void returnBook(){

    }

    public void showAvailableBooks(){

    }

//    String [] availableBooks={"Physics","Chemistry","Mathematics","English","Urdu"};
//    String [] issuedBooks={};

    ArrayList<String> availableBooks=new ArrayList<String>();






}



public class cwh_51_Exercise04 {
    public static void main(String[] args) {
//        Implement a library using Java class library
//        Methods: addBook, issueBook, returnBook,showAvailableBooks.
//        Properties: Array to store the available Books
//        Array to store the issued Books

        Library lib=new Library();

        Scanner sc=new Scanner(System.in);

        System.out.print("Do you want to add books to Library : ");
        System.out.println("Enter Book name to add in Library: ");
        String abook=sc.next();
        lib.addBooks(abook);

        System.out.println("Enter name of book to be issue: ");
        String ibook=sc.next();
        lib.issueBook(ibook);




    }
}
