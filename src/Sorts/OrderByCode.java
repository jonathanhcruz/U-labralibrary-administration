package Sorts;

import Interfaces.BookStructureData;

import java.util.ArrayList;

public class OrderByCode {
  ArrayList<BookStructureData> books;

  public OrderByCode(ArrayList<BookStructureData> books) {
    this.books = books;
    this.sort();
  }

  private void sort() {
    for (int i = 0; i < books.size(); i++) {
      for (int j = 0; j < books.size() - 1; j++) {
        if (books.get(j).getCode().compareTo(books.get(j + 1).getCode()) > 0) {
          BookStructureData temp = books.get(j);
          books.set(j, books.get(j + 1));
          books.set(j + 1, temp);
        }
      }
    }
  }

  public ArrayList<BookStructureData> getBooks() {
    return books;
  }
}
