import java.io.*;
import java.util.*;
public class R06_MET01_J { //MET01-J. Never use assertions to validate method arguments
    /*
    public static int getAbsAdd(int x, int y) {
        assert x != Integer.MIN_VALUE;
        assert y != Integer.MIN_VALUE;
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        assert (absX <= Integer.MAX_VALUE - absY);
        return absX + absY;
    }
    //Usage: getAbsAdd(Integer.MIN_VALUE, 1);
     */

    public static int getAbsAdd(int x, int y) {
        if (x ==Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
            throw new IllegalArgumentException();
        }
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        if (absX > Integer.MAX_VALUE - absY) {
            throw new IllegalArgumentException();
        }
        return absX + absY;
    }

    public static void main(String []args) {
        int a;
        int x = 226;
        System.out.println("x is " + x);
        int y = 36;
        System.out.println("y is " + y);
        a = getAbsAdd(x, y);
        System.out.println("a is " + a);
        
        
        x = Integer.MIN_VALUE;
        System.out.println("x is " + x);
        y = Integer.MAX_VALUE;
        System.out.println("y is " + y);
        a = getAbsAdd(x, y);
        System.out.println("a is " + a);
    }
}
