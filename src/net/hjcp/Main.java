package com.bg.task0;

public class Main {
	
	public static void main(String[] args) {
        Shower.show(Decoder.decode(getInput(-12)));
        
    }
	
	private static String getInput(int displacement) {
		Data myData = new Data();
        int[] codes = myData.getData();
        String seq = new String();
        for (int i = 0; i < codes.length; i++) {
            seq += (char)(codes[i] + displacement);
        }
        return seq;
	}
}
