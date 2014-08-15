package com.bg.task0;

import java.util.LinkedHashMap;
import java.util.LinkedList;

import javax.swing.JFrame;

public class Shower {
	
	private static final int NUMBER_OF_STARS = Decoder.LENGTH_OF_LINE + 22;
	
	public static void show(LinkedList<LinkedHashMap<String, String>> info) {
		
		printStars();
		
		System.out.println(
			" * P *       User      *       Pass       * S *    Date    *   Note  * "
		);
		
		printStars();
		
		for(LinkedHashMap<String, String> map : info) {
			System.out.println(
				" * " + 
				map.get("Priv") + " * " + 
				map.get("User") + " * " + 
				map.get("Pass") + " * " + 
				map.get("Status") + " * " + 
				map.get("Date") + " * " + 
				map.get("Note") + " * "
			);
		}
	}

	private static void printStars() {
		for(int i = 0; i < NUMBER_OF_STARS; i++)
			System.out.print("*");
		System.out.println();
	}
}
