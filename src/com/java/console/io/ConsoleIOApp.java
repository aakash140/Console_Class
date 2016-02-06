package com.java.console.io;

import java.io.Console;

public class ConsoleIOApp {

	public static void main(String[] args) {
		String name;
		char[] pass;
		Console console = System.console();
		name = console.readLine("Enter your name: ");
		pass = console.readPassword("Enter Password: ");
		console.printf("\n" + name);
		for (char c : pass)
			console.printf("%c", c);
	}
}