package net.hjcp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stretch on 14.08.14.
 */
public class Decoder {
    private int[] encryptedData;
    private int[] decryptedData;

    public static int[] decryptData(int[]encryptedData, int offsetSize)
    {
        final int RECORD_LENGTH = 48;
        int recordNumber = 0;


        int messageSize = encryptedData.length;
        int[] decryptedData = new int[messageSize];


        for (int i = 0; i < messageSize; i++)
        {
            int currentPosition = i - RECORD_LENGTH * recordNumber;

            if (currentPosition == 0)
                decryptedData[i] = encryptedData[i];
            else if (currentPosition > 0 && currentPosition < 20)
            {
                if (encryptedData[i] != 0x0C)
                    decryptedData[i] = encryptedData[i] - offsetSize;
                else
                    decryptedData[i] = ' ';
            }
            else if (currentPosition == 20)
                decryptedData[i] = encryptedData[i];
            else if (currentPosition > 20 && currentPosition < 48)
            {
                if (encryptedData[i] != 0x0C)
                    decryptedData[i] = encryptedData[i] - offsetSize;
                else
                    decryptedData[i] = ' ';
            }

            if (currentPosition == 47)
                recordNumber++;
        }
        return decryptedData;
    }

    public static ArrayList<Record> parseToArrayList(int[] data){

        ArrayList<Record> recordList = new ArrayList<Record>();

        return recordList;
    }
}
