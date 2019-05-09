import ru.itmo.classes.CatalogStubLoader;
import ru.itmo.exceptions.CatalogLoadException;
import ru.itmo.sync.U1901Bank;

public class Main {

  public static void main(String[] args) {
//        try {
//            new CatalogStubLoader().load();
//        } catch (CatalogLoadException e) {
//            e.printStackTrace();
//        }
    new U1901Bank().calc(100, 2000);

  }
}
