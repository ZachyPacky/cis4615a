import java.io.*;
import java.util.*;
import java.math.*;
public class R05_OBJ01_J { //OBJ01-J. Limit accessibility of fields
    	/*
    public static final String[] items = {/ ... /};
    */

	private static final String[] items = {"pie", "stuff"};

	public static final String getItem(int index) {
	  return items[index];
	}

	public static final int getItemCount() {
	  return items.length;
	}

    public static void main(String []args) {
        int a = 0;
        int b = 1;
        String s;
        String t;
        s = getItem(a);
        System.out.println("Item one is " + s);

        t = getItem(b);
        System.out.println("Item two is " + t);
    }
}
