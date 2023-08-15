//regex = “^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8, 20}$”
//contains at least 8 characters and at most 20 characters, one digit, least one upper case alphabet, least one lower case alphabet,one special character which includes !@#$%&*()-+=^, doesn’t contain any white space.

// Java program to validate
// the password using ReGex
package userinfo.src;

import java.util.Scanner;
import java.util.regex.*;

import userinfo.src.Designpassword;

class ValidatePassword {
    private static final String PASSWORD_FOR_PATTERN =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>])(?=\\S+$).{8,20}$";

            String nextA = "[a]{3}";
        
            // Compile ReGex..
    private static final Pattern pattern = Pattern.compile(PASSWORD_FOR_PATTERN);

    public static boolean isValid(final String password) {
        
        // If the password is empty return false..
        if (password == null) {
            return false;
        }
        // Pattern class contains matcher() method
        // to find match between user password and regular expression.
        Matcher matcher = pattern.matcher(password);
         // Return if the password matched the ReGex
        return matcher.matches();
    }

    public static void main(String args[]) {
       String str = "usksjw6443@udjA";
       Designpassword dp = new Designpassword();
       String pword = dp.password;
       System.out.println(isValid(pword));

    }
}
