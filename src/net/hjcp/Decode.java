package net.hjcp;

public class Decode {

    public static void main(String[] args) {

        Data myDate = new Data();
        int[] myData = myDate.getData();

        for (int i = 0; i < myData.length; i++) {
            System.out.printf("0x%X ", myData[i]);
        }

    }
}
