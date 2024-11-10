package Sorts;

import Interfaces.BookStructureData;

import java.util.ArrayList;

public class OrderByAuthor {
  ArrayList<BookStructureData> books;

  public OrderByAuthor(ArrayList<BookStructureData> books) {
    this.books = books;
    this.sort();
  }

  private void sort() {
    // i need to shot the books by author by using selection sort

    for (int i = 0; i < books.size(); i++) {
      int minIndex = i;
      for (int j = i + 1; j < books.size(); j++) {
        if (books.get(j).getAuthor().compareTo(books.get(minIndex).getAuthor()) < 0) {
          minIndex = j;
        }
      }

      BookStructureData temp = books.get(i);
      books.set(i, books.get(minIndex));
      books.set(minIndex, temp);
    }
  }

    public ArrayList<BookStructureData> getBooks() {
        return books;
    }
}
