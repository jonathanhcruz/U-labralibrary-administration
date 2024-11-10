import DataBase.DataMocks;
import Interfaces.BookStructureData;

import java.util.ArrayList;

import CustomSystem.SystemGetInfo;
import Sorts.OrderByAuthor;
import Sorts.OrderByCode;


public class Actions {

  public void listAllBooks(ArrayList<BookStructureData> books) {
    for (BookStructureData book : books) {
      ShowBookInfo.print(book);
    }
  }

  public void getBookByCode (ArrayList<BookStructureData> books, String code) {
    String NewCode = code;
    if (NewCode == null) {
      SystemGetInfo systemGetInfo = new SystemGetInfo("Enter the code of the book");
      NewCode = systemGetInfo.getResponse();
    }


    System.out.println('\n');
    System.out.println(NewCode);

    BookStructureData foundBook = null;

    for (BookStructureData book : books) {
      if (!book.getCode().equals(NewCode)) {
        continue;
      }

      foundBook= book;
      break;
    }

    if (foundBook == null) {
      System.out.println("Book with code " + NewCode + " not found.");
      return;
    }

    ShowBookInfo.print(foundBook);
  }

  public void orderByCode(ArrayList<BookStructureData> books) {
    OrderByCode orderBy = new OrderByCode(books);
    listAllBooks(orderBy.getBooks());
  }

  public void orderByAuthor(ArrayList<BookStructureData> books) {
    OrderByAuthor orderBy = new OrderByAuthor(books);
    listAllBooks(orderBy.getBooks());
  }

  public void addBook(DataMocks dataMocks) {
    GetBookInfo getBookInfo = new GetBookInfo(null);
    BookStructureData book = getBookInfo.getBook();
    final String codeOfNewBook = dataMocks.addNewBook(book);

    getBookByCode(dataMocks.collectionOfBooks(), codeOfNewBook);
  }

  public void deleteBook(DataMocks dataMocks) {
    SystemGetInfo systemGetInfo = new SystemGetInfo("Enter the code of the book you want to delete");
    final String code = systemGetInfo.getResponse();

    dataMocks.deleteBookByCode(code);
  }
}
