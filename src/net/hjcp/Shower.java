package com.bg.task0;

import java.util.LinkedHashMap;
import java.util.LinkedList;

import javax.swing.JFrame;

public class Shower {
	
	private static final int NUMBER_OF_STARS = Decoder.LENGTH_OF_LINE + 39;
	
	public static void show(LinkedList<LinkedHashMap<String, String>> info) {
		
		
		
	    System.out.println("       Hexlet Java Community Problems (HJCP)");
        System.out.println("       Problem: #1 (https://github.com/hjcp/hjcp1.git)");
        System.out.println("       Create by: rberla");
        System.out.println("       URL: https://github.com/rberla/hjcp1");
        System.out.println("       Version 1.1");
        
        System.out.println();
		
        printStars();
        
		System.out.println(
			" *  Privilegues  *       User      *       Pass       * Status *    Date    *   Note  * "
		);
		
		printStars();
		
		for(LinkedHashMap<String, String> map : info) {
			System.out.println(
				" * " + 
				map.get("Priv") + " * " + 
				map.get("User") + " * " + 
				map.get("Pass") + " * " + 
				map.get("Status") + "  * " + 
				map.get("Date") + " * " + 
				map.get("Note") + " * "
			);
		}
		
		printStars();
	}

	private static void printStars() {
		for(int i = 0; i < NUMBER_OF_STARS; i++)
			System.out.print("*");
		System.out.println();
	}
}
