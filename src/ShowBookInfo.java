import Interfaces.BookStructureData;

public class ShowBookInfo {
    public static void print(BookStructureData book) {
      System.out.println("Title of Book: " + book.getTitle());
      System.out.println("Author of Book: " + book.getAuthor());
      System.out.println("Subject Matter of Book: " + book.getSubjectMatter());
      System.out.println("Number of Page of Book: " + book.getNumberOfPage());
      System.out.println("Code of Book: " + book.getCode());

      System.out.println('\n');
    }
}
