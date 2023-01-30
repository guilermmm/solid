package SingleReponsability;

public class InventoryView {

  private Book book;

  public InventoryView(Book book) {
    this.book = book;
  }

  public void searchBook() {
    System.out.println("Searching for book: \n" + book.getTitle() + " by " + book.getAuthor());
  }
}
