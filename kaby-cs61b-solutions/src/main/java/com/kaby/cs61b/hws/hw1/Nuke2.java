/**
Write a program called "Nuke2.java" containing a class called Nuke2 whose main
method reads a string from the keyboard and prints the same string, with its
second character removed.  (That's character number 1, since Java numbers
characters in a string starting from zero.)  In other words, after you run
"java Nuke2", if you type in the string "skin", the program will print "sin".
 */
package com.kaby.cs61b.hws.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author aby
 *
 */
public class Nuke2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		BufferedReader keyboard;
	    String inputLine;

	    keyboard = new BufferedReader(new InputStreamReader(System.in));

	    System.out.print("Please enter a string greater than two characters (no spaces) : ");
	    System.out.flush();        /* Make sure the line is printed immediately. */
	    inputLine = keyboard.readLine();
	    
	    System.out.println("Output string with the second character removed : "+ inputLine.substring(0, 1) + inputLine.substring(2) );

	}

}
