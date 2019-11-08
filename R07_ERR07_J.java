import java.io.*;
import java.util.*;
import java.math.*;

public class R07_ERR07_J { //ERR07-J. Do not throw RuntimeException, Exception, or Throwable
	
	/*
	boolean isCapitalized(String s) {
  		if (s == null) {
    	throw new RuntimeException("Null String");
  	}
  	if (s.equals("")) {
    	return true;
  	}
  	String first = s.substring(0, 1);
  	String rest = s.substring(1);
  	return (first.equals(first.toUpperCase()) &&
          	rest.equals(rest.toLowerCase()));
	}
	 */
	
	static boolean isCapitalized(String s) {
		if (s == null) {
			throw new NullPointerException();
		}
		if (s.equals("")) {
		  return true;
		}
		String first = s.substring(0, 1);
		String rest = s.substring(1);
		System.out.println(first.equals(first.toUpperCase()) &&
		        rest.equals(rest.toLowerCase()));
		return (first.equals(first.toUpperCase()) &&
		        rest.equals(rest.toLowerCase()));
	}

	public static void main(String[] args) {
	    String s = "hello";
	    String t = "Hi";
	    String u = "";
	    String v = null;
	    System.out.print("s is ");
	    isCapitalized(s);

	    System.out.print("t is ");
	    isCapitalized(t);

	    System.out.println("u is ");
	    isCapitalized(u);

	    System.out.print("v is ");
	    isCapitalized(v);
	}
}
