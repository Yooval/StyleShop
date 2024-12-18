package com.itbulls.learnit.javacore.oop.exam.onlineshop;

import com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.Menu;
import com.itbulls.learnit.javacore.oop.exam.onlineshop.menu.impl.MainMenu;

// This file serves as the application's entry point, initializing and running the main menu.

public class Main {

	public static final String EXIT_COMMAND = "exit";
	
	public static void main(String[] args) {
		Menu mainMenu = new MainMenu();
		mainMenu.start();
	}
	
}
