package net.hjcp;

import java.util.ArrayList;
import java.util.List;

public class Decode {

    public static void main(String[] args) {

        Data myDate = new Data();
        int[] myData = myDate.getData();


        for (int i = 0; i < myData.length; i++) {
            System.out.printf("0x%X ", myData[i]);
        }
        System.out.println();

        int[] sw = Decoder.decryptData(myData, 12);
        for (int i = 0; i < sw.length; i++) {
            System.out.print((char) sw[i]);
        }

        System.out.println();

        Printer.print(sw);

    }

}
