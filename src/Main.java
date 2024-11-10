import CustomSystem.SystemProgram;
import DataBase.DataMocks;
import Interfaces.BookStructureData;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    final DataMocks dataMocks = new DataMocks(); // This is simulated database
    final Actions actions = new Actions();

    SystemProgram systemProgram = new SystemProgram();
    executeAction(systemProgram, dataMocks, actions);
    System.gc(); // Garbage collector to free up memory
  }

  public static void executeAction(SystemProgram systemProgram, DataMocks dataMocks, Actions actions) {
    final int actionNumber = systemProgram.Run();

    System.out.println('\n');
    System.out.println('\n');

    if (actionNumber == 8) {
      System.out.println("Goodbye");
      return;
    }

    switch (actionNumber) {
      case 1:
        System.out.println("List all books");
        ArrayList<BookStructureData> books = dataMocks.collectionOfBooks();
        actions.listAllBooks(books);
        break;
      case 2:
        System.out.println("Get book by code");
        actions.getBookByCode(dataMocks, null);
        break;
      case 3:
        System.out.println("Sort books by code");
        actions.orderByCode(dataMocks.collectionOfBooks());
        break;
      case 4:
        System.out.println("Sort books by author");
        actions.orderByAuthor(dataMocks.collectionOfBooks());
        break;
      case 5:
        System.out.println("Add a book");
        actions.addBook(dataMocks);
        break;
      case 6:
        System.out.println("Update a book");
        actions.updateBook(dataMocks);
        break;
      case 7:
        System.out.println("Delete a book");
        actions.deleteBook(dataMocks);
        break;
      default:
        System.out.println("Invalid action");
    }

    System.out.println('\n');
    System.out.println('\n');
    System.gc(); // Garbage collector to free up memory
    executeAction(systemProgram, dataMocks, actions);
  }
}