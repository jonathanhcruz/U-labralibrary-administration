package Interfaces;

public class BookStructureData {
    final private String title;
    final private String author;
    final private String subjectMatter;
    final private String numberOfPage;
    final private String code;

    public BookStructureData(
        String title,
        String author,
        String subjectMatter,
        String numberOfPage,
        String code
    ) {
        this.title = title;
        this.author = author;
        this.subjectMatter = subjectMatter;
        this.numberOfPage = numberOfPage;
        this.code = code;
    }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public String getSubjectMatter() {
    return subjectMatter;
  }

  public String getNumberOfPage() {
    return numberOfPage;
  }

  public String getCode() {
    return code;
  }
}
