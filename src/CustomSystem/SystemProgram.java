package CustomSystem;

public class SystemProgram {
  public SystemProgram() {
    System.out.println("Book Information System");
    System.out.println("Welcome to the book information system.");
    System.out.println("This system will help you to get information about the book.");
  }

  public int Run(){
    System.out.println("What do you want to do?");
    System.out.println("1. List all books");
    System.out.println("2. Get book by code");
    System.out.println("3. Sort books by code");
    System.out.println("4. Sort books by author");
    System.out.println("5. Add a book");
    System.out.println("6. update a book");
    System.out.println("7. Delete a book");
    System.out.println("8. Exit");

    final SystemGetInfo systemGetInfo = new SystemGetInfo("Enter the number of the action you want to perform");
    final String action = systemGetInfo.getResponse();
    final int actionNumber = Integer.parseInt(action);

    return actionNumber;
  }
}
