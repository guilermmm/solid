package DependencyInversion;

public class Book implements Product {

  @Override
  public void seeReviews() {
    System.out.println("Reviews do livro");
  }

  @Override
  public void getSample() {
    System.out.println("Cópia do livro");
  }
}
