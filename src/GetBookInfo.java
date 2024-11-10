import Interfaces.BookStructureData;
import CustomSystem.SystemGetInfo;

public class GetBookInfo {
    private String code;
    private BookStructureData bookStructureData;

    public GetBookInfo(
        String code
    ) {
        this.code = code;
        this.structureData();
    }

    private void getCode() {
        if (code != null) {
            return;
        }

        final SystemGetInfo codeOfBook = new SystemGetInfo("What is the code of the book " + (code) + "?");
        code = codeOfBook.getResponse();
    }


    private String getTitle() {
        final SystemGetInfo titleOfBook = new SystemGetInfo("What is the name of the book " + code + "?");
        return titleOfBook.getResponse();
    }

    private String getAuthor() {
        final SystemGetInfo author = new SystemGetInfo("Who is the author of the book " + code + "?");
        return author.getResponse();
    }

    private String getSubjectMatter() {
        final SystemGetInfo subjectMatter = new SystemGetInfo("What is the subject matter of the book " + code + "?");
        return subjectMatter.getResponse();
    }

    private String getNumberOfPage() {
        final SystemGetInfo numberOfPage = new SystemGetInfo("How many pages does " + code + " book have ?");
        return numberOfPage.getResponse();
    }

    private void structureData() {
        getCode();
        bookStructureData = new BookStructureData(getTitle(), getAuthor(), getSubjectMatter(), getNumberOfPage(), code);
    }

    public BookStructureData getBook() {
        return bookStructureData;
    }
}