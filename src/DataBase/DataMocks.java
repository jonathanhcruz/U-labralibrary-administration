package DataBase;

import java.util.ArrayList;
import java.util.Arrays;
import Interfaces.BookStructureData;

public class DataMocks {
    final private ArrayList<BookStructureData> bookStructureData;

    public DataMocks() {
        bookStructureData = new ArrayList<BookStructureData>(Arrays.asList(
            new BookStructureData("Clean Code", "Robert C. Martin", "Software", "256", "A1B2"),
            new BookStructureData("Refactoring", "Martin Fowler", "Software", "448", "C3D4"),
            new BookStructureData("Design Patterns", "Erich Gamma", "Software", "395", "E5F6"),
            new BookStructureData("Effective Java", "Joshua Bloch", "Software", "416", "G7H8"),
            new BookStructureData("The Pragmatic Programmer", "Andrew Hunt", "Software", "352", "I9J0"),
            new BookStructureData("Code Complete", "Steve McConnell", "Software", "960", "K1L2"),
            new BookStructureData("Introduction to Algorithms", "Thomas H. Cormen", "Algorithms", "1312", "M3N4"),
            new BookStructureData("The Mythical Man-Month", "Frederick P. Brooks Jr.", "Software", "322", "O5P6"),
            new BookStructureData("Structure and Interpretation of Computer Programs", "Harold Abelson", "Programming", "657", "Q7R8"),
            new BookStructureData("Clean Architecture", "Robert C. Martin", "Software", "432", "S9T0"),
            new BookStructureData("You Don't Know JS", "Kyle Simpson", "JavaScript", "278", "U1V2"),
            new BookStructureData("JavaScript: The Good Parts", "Douglas Crockford", "JavaScript", "176", "W3X4"),
            new BookStructureData("Head First Design Patterns", "Eric Freeman", "Software", "694", "Y5Z6"),
            new BookStructureData("Patterns of Enterprise Application Architecture", "Martin Fowler", "Software", "533", "A7B8"),
            new BookStructureData("Domain-Driven Design", "Eric Evans", "Software", "560", "C9D0"),
            new BookStructureData("Continuous Delivery", "Jez Humble", "Software", "512", "E1F2"),
            new BookStructureData("The Art of Computer Programming", "Donald E. Knuth", "Algorithms", "3168", "G3H4"),
            new BookStructureData("Working Effectively with Legacy Code", "Michael Feathers", "Software", "456", "I5J6"),
            new BookStructureData("The Clean Coder", "Robert C. Martin", "Software", "256", "K7L8"),
            new BookStructureData("Test-Driven Development", "Kent Beck", "Software", "240", "M9N0"),
            new BookStructureData("Programming Pearls", "Jon Bentley", "Programming", "256", "O1P2"),
            new BookStructureData("The C Programming Language", "Brian W. Kernighan", "Programming", "272", "Q3R4"),
            new BookStructureData("The Elements of Computing Systems", "Noam Nisan", "Computer Science", "344", "S5T6"),
            new BookStructureData("Compilers: Principles, Techniques, and Tools", "Alfred V. Aho", "Compilers", "1009", "U7V8"),
            new BookStructureData("Introduction to the Theory of Computation", "Michael Sipser", "Theory", "504", "W9X0"),
            new BookStructureData("Artificial Intelligence: A Modern Approach", "Stuart Russell", "AI", "1152", "Y1Z2"),
            new BookStructureData("Computer Networks", "Andrew S. Tanenbaum", "Networking", "960", "A3B4"),
            new BookStructureData("Modern Operating Systems", "Andrew S. Tanenbaum", "OS", "1136", "C5D6"),
            new BookStructureData("Database System Concepts", "Abraham Silberschatz", "Databases", "1376", "E7F8"),
            new BookStructureData("Operating System Concepts", "Abraham Silberschatz", "OS", "976", "G9H0"),
            new BookStructureData("The Algorithm Design Manual", "Steven S. Skiena", "Algorithms", "730", "I1J2"),
            new BookStructureData("Introduction to Machine Learning with Python", "Andreas C. Müller", "Machine Learning", "400", "K3L4"),
            new BookStructureData("Deep Learning", "Ian Goodfellow", "Machine Learning", "800", "M5N6"),
            new BookStructureData("Python Crash Course", "Eric Matthes", "Python", "544", "O7P8"),
            new BookStructureData("Fluent Python", "Luciano Ramalho", "Python", "792", "Q9R0"),
            new BookStructureData("Automate the Boring Stuff with Python", "Al Sweigart", "Python", "504", "S1T2"),
            new BookStructureData("Learning Python", "Mark Lutz", "Python", "1648", "U3V4"),
            new BookStructureData("Python Cookbook", "David Beazley", "Python", "706", "W5X6"),
            new BookStructureData("Effective Python", "Brett Slatkin", "Python", "256", "Y7Z8"),
            new BookStructureData("Python for Data Analysis", "Wes McKinney", "Data Science", "544", "A9B0")
        ));
    }

    /*
        * Get all books
        * @return ArrayList<BookStructureData>
     */
    public ArrayList<BookStructureData> collectionOfBooks() {
        return bookStructureData;
    }

    /*
        * Get book by code
        * @param code
        * @return BookStructureData
     */
    public BookStructureData getBookByCode(String code) {
        BookStructureData foundBook = null;
        for (BookStructureData book : bookStructureData) {
            if (!book.getCode().equals(code)) {
                continue;
            }

            foundBook= book;
            break;
        }

        return foundBook;
    }

    /*
        * Delete book by code
        * @param code
        * @return String
     */
    public String deleteBookByCode(String code) {
        for (int i = 0; i < bookStructureData.size(); i++) {
            if (bookStructureData.get(i).getCode().equals(code)) {
                bookStructureData.remove(i);
                System.out.println("Book with code " + code + " has been deleted.");
                return code;
            }
        }

        System.out.println("Book with code " + code + " not found.");
        return null;
    }

    /*
        * Add new book
        * @param newBook
        * @return String
     */
    public String addNewBook(BookStructureData newBook) {
        this.bookStructureData.add(newBook);
        System.out.println("Book with code " + newBook.getCode() + " has been added.");
        return newBook.getCode();
    }

    /*
        * Update book by code
        * @param code
        * @param bookToBeUpdated
        * @return String
     */
    public String updateBookByCode(String code, BookStructureData bookToBeUpdated) {
        for (int i = 0; i < this.bookStructureData.size(); i++) {
            if (this.bookStructureData.get(i).getCode().equals(code)) {
                this.bookStructureData.set(i, bookToBeUpdated);
                return code;
            }
        }

        return null;
    }
}