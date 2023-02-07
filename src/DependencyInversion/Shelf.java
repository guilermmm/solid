package DependencyInversion;

public class Shelf {
  public Shelf() {
  }

  public void addProduct(Product product) {
    product.seeReviews();
    product.getSample();
  }

  public void customizeShelf() {
    System.out.println("Shelf customized");
  }
}
