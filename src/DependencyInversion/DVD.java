package DependencyInversion;

public class DVD implements Product {

  @Override
  public void seeReviews() {
    System.out.println("Reviews do DVD");
  }

  @Override
  public void getSample() {
    System.out.println("Cópia do DVD");
  }
}
