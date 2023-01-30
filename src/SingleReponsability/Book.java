package SingleReponsability;

public class Book {
  private String title;
  private String author;

  public Book() {
    this.title = "A volta dos que nao foram";
    this.author = "Fulano";
  }

  String getTitle() {
    return title;
  }

  String getAuthor() {
    return author;
  }

  void setTitle(String title) {
    this.title = title;
  }

  void setAuthor(String author) {
    this.author = author;
  }
}