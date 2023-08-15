import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Bakery {
    private final List<Production> dbProduct = Arrays.asList(new Production("101", "Cake"),
            new Production("102", "Biscuit"),
            new Production("103", "Croissant"));

    public Optional<Production> findById(String id) {
        //If the snack is found, then we return a full Optional(Production)..

        for (Production p : dbProduct) {
            if (p.getproductId().equals(id)) {
                return Optional.of(p);
            }
        }
//Otherwise, we return an empty one..
        return Optional.empty();
    }
    public Optional<Production> findByName(String name) {
        for (Production p : dbProduct) {
            if (p.getproductName().equals(name)) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }
}
