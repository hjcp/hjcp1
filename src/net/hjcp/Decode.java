package net.hjcp;

import java.util.ArrayList;
import java.util.List;

public class Decode {

    public static void main(String[] args) {

        Data myDate = new Data();
        int[] myData = myDate.getData();

        ArrayList<Record> decryptedData = Decoder.decryptData(myData, -12);


        Printer.print(decryptedData);


    }

}
