 edit
import java.io.*;
import java.util.*;
import java.math.*;
public class R04_STR03_J { //STR03-J. Do not encode noncharacter data as a string
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
        System.out.println("s is " + s);
        byte[] byteArray = s.getBytes();
        String ns = new String(byteArray);
        System.out.println("ns is " + ns);
        x = new BigInteger(ns);
        System.out.println("x is " + x);
    }
}

BigInteger x = new BigInteger("530500452766");
String s = x.toString(); //Valid character data
byte[] byteArray = s.getByte();
String ns = new String(byteArray);
x = new BigInteger(ns);
 master
