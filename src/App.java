import OpenClosed.BiographyDiscount;
import OpenClosed.CookbookDiscount;
import OpenClosed.DiscountManager;
import SingleReponsability.Book;
import SingleReponsability.InventoryView;

public class App {
    public static void main(String[] args) throws Exception {
        InventoryView iv = new InventoryView(new Book());
        iv.searchBook();

        DiscountManager dm = new DiscountManager();
        CookbookDiscount cd = new CookbookDiscount();
        BiographyDiscount bd = new BiographyDiscount();
        dm.processBookDiscount(cd);
        dm.processBookDiscount(bd);
    }
}
