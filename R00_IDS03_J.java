import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.Pattern;
public class R00_IDS03_J{ //IDS03-J. Do not log unsanitized user input
    /*
    if (loginSuccessful) {
        logger.severe("User login succeeded for: " + username);
    }
    else {
        logger.severe("User login failed for: " + username);
    }
    */

    
    public static String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9_]+", username)
            ? username : "unauthorized user";
    }

    public static void main(String []args){
        String username = "Hello";
        if (true) {
            System.out.println("User login succeeded for: " + sanitizeUser(username));
        }
        else {
            System.out.println("User login failed for: " + sanitizeUser(username));
        }
    }
}
