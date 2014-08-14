package net.hjcp;

public class Decode {

    public static void main(String[] args) {

        Data data = new Data();
        int[] myData = data.getData();

        for (int i = 0; i < myData.length; i++) {
            System.out.printf("0x%X ", myData[i]);
        }

    }
}
