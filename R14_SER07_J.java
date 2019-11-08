import java.io.*;
import java.util.*;
import java.math.*;
import java.security.SecureRandom;

public class R14_SER07_J implements Serializable { //SER07-J. Do not use the default serialized form for classes with implementation-defined invariants

	/*
	public class Lottery implements Serializable {
  		private int ticket = 1;
  		private SecureRandom draw = new SecureRandom();

  		public Lottery(int ticket) {
    		this.ticket = (int) (Math.abs(ticket % 20000) + 1);
  		}

  		public int getTicket() {
    		return this.ticket;
  		}

  		public int roll() {
    		this.ticket = (int) ((Math.abs(draw.nextInt()) % 20000) + 1);
    		return this.ticket;
  		}

  		public static void main(String[] args) {
    		Lottery l = new Lottery(2);
    		for (int i = 0; i < 10; i++) {
      		l.roll();
      		System.out.println(l.getTicket());
    		}
  		}

  		private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
    		in.defaultReadObject();
  		}
	}
	 */

	  private transient int ticket = 1;
	  private transient SecureRandom draw = new SecureRandom();

	  public void Lottery(int ticket) {
	    this.ticket = (int) (Math.abs(ticket % 20000) + 1);
	  }

	  public final int getTicket() {
	    return this.ticket;
	  }

	  public final int roll() {
	    this.ticket = (int) ((Math.abs(draw.nextInt()) % 20000) + 1);
	    return this.ticket;
	  }

	  public static void main(String[] args) {
		  R14_SER07_J l = new R14_SER07_J();
	    for (int i = 0; i < 10; i++) {
	      l.roll();
	      System.out.println(l.getTicket());
	    }
	  }

	  private void readObject(ObjectInputStream in)
	          throws IOException, ClassNotFoundException {
	    in.defaultReadObject();
	    this.draw = new SecureRandom();
	    roll();
	  }
}
