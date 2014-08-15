package net.hjcp;

import java.util.ArrayList;
import java.util.List;


public class Decoder {
    private int[] encryptedData;
    private int[] decryptedData;

    public static ArrayList<Record> decryptData(int[]encryptedData, int offsetSize)
    {
        final int RECORD_LENGTH = 48;
        int recordNumber = 0;

        int messageSize = encryptedData.length;
        ArrayList<Record> decryptedData = new ArrayList<Record>();
        Record tmpRecord = new Record();
        String tmpName = "";
        String tmpPassword = "";
        String tmpDate = "";
        String tmpNote = "";
        for (int i = 0; i < messageSize; i++)
        {
            int currentPosition = i - RECORD_LENGTH * recordNumber;


            if (currentPosition == 0)
            {
                tmpRecord.setPriv(encryptedData[i]);
            }
            else if (currentPosition > 0 && currentPosition < 16)
            {
                if (encryptedData[i] != 0x0C)
                    tmpName += (char)(encryptedData[i] + offsetSize);
            }
            else if (currentPosition >= 16 && currentPosition < 32)
            {
                if (encryptedData[i] != 0x0C)
                    tmpPassword += (char)(encryptedData[i] + offsetSize);
            }
            else if (currentPosition == 32)
            {
                tmpRecord.setStatus(encryptedData[i]);
            }
            else if (currentPosition > 32 && currentPosition < 41)
            {
                if (encryptedData[i] != 0x0C)
                    tmpDate += (char)(encryptedData[i] + offsetSize);

            }
            else if (currentPosition >= 41 && currentPosition < 48)
            {
                if (encryptedData[i] != 0x0C)
                    tmpNote += (char)(encryptedData[i] + offsetSize);

            }

            if (currentPosition == 47) {
                tmpRecord.setUserName(tmpName);
                tmpRecord.setPassword(tmpPassword);
                tmpRecord.setDate(tmpDate);
                tmpRecord.setNote(tmpNote);
                decryptedData.add(tmpRecord);
                recordNumber++;
                tmpRecord = new Record();
                tmpName = "";
                tmpPassword = "";
                tmpDate = "";
                tmpNote = "";
            }
        }
        return decryptedData;
    }


}
