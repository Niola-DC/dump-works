import org.testng.annotations.Test;
import org.junit.Assert;
//import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Scanner;

import static org.testng.AssertJUnit.assertEquals;

public class Confectionary {
    @Test
    //To get Optional value when there is no snack...
    public void nonexistentProductIdOptional() {
        Bakery bakery = new Bakery();
        String nonExistentSnackId = String.valueOf(105);
        String snack = bakery.findById(nonExistentSnackId)
                .orElse(new Production("100", "bread"))
                .getproductName();
        assertEquals("bread", snack);
        System.out.println(snack);
    }
    @Test
    public void existentProductIdUpperCased() {
        Bakery bakery = new Bakery();
        String upperCasedName = bakery.findById("102")
                .filter(u -> u.getproductName().startsWith("B"))
                .map(u -> u.getproductName().toUpperCase())
                .orElse("");
        assertEquals("BISCUIT", upperCasedName);
        System.out.println(upperCasedName);
    }

    public static void main(String[] args) {
        Confectionary tert = new Confectionary();
        tert.nonexistentProductIdOptional();

        tert.existentProductIdUpperCased();
    }
}
