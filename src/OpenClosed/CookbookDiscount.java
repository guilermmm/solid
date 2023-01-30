package OpenClosed;

public class CookbookDiscount implements BookDiscount {
  public CookbookDiscount() {
  }

  @Override
  public String getBookDiscount() {
    return "Cookbook Discount: 10%";
  }
}
