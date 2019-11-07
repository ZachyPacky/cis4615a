import java.io.*;
import java.util.*;
import java.math.*;

public class R01_DCL00_J { //DCL00-J. Prevent class initialization cycles
    /*
    public class R01_DCL00_J {
        private final int balance;
        private static final R01_DCL00_J c = new R01_DCL00_J();
        private static final int deposit = (int) (Math.random() * 100); // Random deposit

        public R01_DCL00_J() {
            balance = deposit - 10; // Subtract processing fee
        }

        public static void main(String[] args) {
            System.out.println("The account balance is: " + c.balance);
        }
    }
     */

    private final int balance;
    private static final int deposit = (int) (Math.random() * 100); // Random deposit
    private static final R01_DCL00_J c = new R01_DCL00_J();  // Inserted after initialization of required fields
    public R01_DCL00_J() {
        balance = deposit - 10; // Subtract processing fee
    }

    public static void main(String[] args) {
        System.out.println("The account balance is: " + c.balance);
    }
}
