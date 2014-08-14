package net.hjcp;

import net.hjcp.Exceptions.ReadDataException;

public class Decode {

    public static void main(String[] args) throws ReadDataException{

        Data myDate = new Data();
        int[] myData = myDate.getData();

        DataReader reader = new DataReader(myData);
        try {
            reader.ReadData();
        }
        catch (ReadDataException e) {
            System.out.println(e);
        }

        reader.PrintRecords();
    }
}
