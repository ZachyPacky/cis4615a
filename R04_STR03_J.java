import java.io.*;
import java.util.*;
import java.math.*;
public class R04_STR03_J {
    /*
    BigInteger x = new BigInteger("530500452766");
    byte[] byteArray = x.toByteArray();
    String s = new String (byteArray);
    byteArray = s.getBytes()
    x = new BigInteger(byteArray);
     */

    public static void main(String []args) {
        BigInteger x = new BigInteger("530500452766");
        String s = x.toString(); //Valid character data
        byte[] byteArray = s.getBytes();
        String ns = new String(byteArray);
        x = new BigInteger(ns);
    }
}
