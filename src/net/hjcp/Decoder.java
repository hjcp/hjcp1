package com.bg.task0;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Decoder {
	
	public static final int LENGTH_OF_LINE = 48;

	private static String[] lines;
	
	private static LinkedList<LinkedHashMap<String, String>> info = new LinkedList<LinkedHashMap<String, String>>();
	private static LinkedHashMap<String, String> temp = new LinkedHashMap<String, String>();
	private static String priv, user, pass, status, date, note;
	
	public static boolean decoded = false;
	
	public static LinkedList<LinkedHashMap<String, String>> decode (String input) {
		setLines(new String[(int)(input.length() / LENGTH_OF_LINE)]);
		
		
		for(int num_of_line = 0, start_of_sub = 0; num_of_line < lines.length; num_of_line++, start_of_sub += LENGTH_OF_LINE) {
			lines[num_of_line] = input.substring(start_of_sub, start_of_sub + LENGTH_OF_LINE);
		}
		
		
		for(String line : lines) {
			temp = new LinkedHashMap<String, String>();
			
			
			priv = line.substring(0, 1);
			user = removeWhitespaces(line.substring(1, 16));
			pass = removeWhitespaces(line.substring(16, 32));
			status = line.substring(32, 33);
			date = line.substring(33, 35) + "/" + line.substring(35, 37) + "/" + line.substring(37, 41);
			note = removeWhitespaces(line.substring(41, line.length()));
			
			switch(priv) {
				case "1":
					priv = "Operator     ";
					break;
				case "2":
					priv = "User         ";
					break;
				case "3":
					priv = "Administrator";
					break;
				case "4":
					priv = "Supervisor   ";
					break;
				default:
					priv = "Error        ";
			}
			
			switch(status) {
				case "1":
					status = "Ok   ";
					break;
				case "2":
					status = "Block";
					break;
				default:
					status = "Error";
			}
			
			//dev
			//System.out.println("Priv: " + priv + ", user: " + user + ", pass: " + pass + ", status: " + status + ", date: " + date + ", note: " + note);
			///dev
			
			temp.put("Priv", priv);
			temp.put("User", user);
			temp.put("Pass", pass);
			temp.put("Status", status);
			temp.put("Date", date);
			temp.put("Note", note);
			
			info.add(temp);
		}
		return info;
		
	}

	private static String removeWhitespaces(String input) {
		
		//dev
//		String res = new String();
//		char[] chars = input.toCharArray();
//		
//		for(char c:chars) {
//			if((int)c != 0) {
//				res += c;
//			}
//		}
//		return res;
		///dev
		
		return input;
		
		
	}
	
	public static String[] getLines() {
		return lines;
	}

	public static void setLines(String[] lines) {
		Decoder.lines = lines;
	}
	
}
