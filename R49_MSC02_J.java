import java.io.*;
import java.util.*;
import java.security.SecureRandom;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.math.*;

public class R49_MSC02_J { //MSC02-J. Generate strong random numbers
	/*
	Random number = new Random(123L);
	//...
	for (int i = 0; i < 20; i++) {
  		// Generate another random integer in the range [0, 20]
  		int n = number.nextInt(21);
  		System.out.println(n);
	}
	 */

	public static void main (String args[]) {
		try {
		    SecureRandom number = SecureRandom.getInstanceStrong();
		    // Generate 20 integers 0..20
		    for (int i = 0; i < 20; i++) {
		    	System.out.println(number.nextInt(21));
		    }
		} catch (NoSuchAlgorithmException nsae) {
			// Forward to handler
		}
	}
}
