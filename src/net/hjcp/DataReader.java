package net.hjcp;

import net.hjcp.Exceptions.ReadDataException;
import net.hjcp.Exceptions.ReadLineException;

import java.util.ArrayList;

public class DataReader {

    private final int RECORD_LENGTH = 48;    //One line is 48 bytes

    private int[] data;
    private ArrayList<Record> decodedData;

    public DataReader(int[] data) {
        this.data = data;
        decodedData = new ArrayList<Record>();
    }

    public void ReadData() throws ReadDataException {

        if (data.length % RECORD_LENGTH > 0)
            throw new ReadDataException(Constants.ARRAY_SIZE_EXCEPTION);

        try {
            for (int i = 0; i < data.length / RECORD_LENGTH; i++)
                ReadLine(i);
        }
        catch (Exception e) {
            throw new ReadDataException(e);
        }
    }

    public int getNumberOfRecords() {
        return decodedData.size();
    }

    public Record getRecord(int recordNumber) {
        return recordNumber < decodedData.size() ? decodedData.get(recordNumber) : null;
    }

    public void PrintRecords() {
        new DataShower(decodedData);
    }

    private void ReadLine(int index) throws ReadLineException {
        Record rec = new Record();

        if (index < 0 || index > data.length - RECORD_LENGTH)
            throw new ReadLineException(Constants.OUT_OF_RANGE_EXCEPTION);

        int lineOffset = RECORD_LENGTH * index;
        int currentOffset = lineOffset;

        //Read Privilege
        if (data[currentOffset] >= Constants.PRIVILEGE_OPERATOR && data[currentOffset] <= Constants.PRIVILEGE_SUPERVISOR)
            rec.setPrivilege(data[currentOffset]);
        else
            throw new ReadLineException(Constants.PRIVILEGE_EXCEPTION);

        //Read Username
        currentOffset = lineOffset + Constants.PRIVILEGE_LENGTH;
        char[] buf = new char[Constants.USERNAME_LENGTH];
        try {
            for (int i = 0; i < Constants.USERNAME_LENGTH; i++) {
                if (data[currentOffset + i] != 0x0C)
                    buf[i] = (char)data[currentOffset + i];
                else
                    buf[i] = ' ';
            }
        }
        catch (Exception e) {
            throw new ReadLineException(e);
        }

        rec.setUsername(String.copyValueOf(buf));

        //Read Password
        currentOffset += Constants.USERNAME_LENGTH;
        buf = new char[Constants.PASSWORD_LENGTH];
        try {
            for (int i = 0; i < Constants.PASSWORD_LENGTH; i++) {
                if (data[currentOffset + i] != 0x0C)
                    buf[i] = (char)data[currentOffset + i];
                else
                    buf[i] = ' ';
            }
        }
        catch (Exception e) {
            throw new ReadLineException(e);
        }

        rec.setPassword(String.copyValueOf(buf));

        //Read Status
        currentOffset += Constants.PASSWORD_LENGTH;
        if (data[currentOffset] == Constants.STATUS_OK || data[currentOffset] == Constants.STATUS_BLOCK)
            rec.setStatus(data[currentOffset]);
        else
            throw new ReadLineException(Constants.STATUS_EXCEPTION);

        //Read Date - Day
        currentOffset += Constants.STATUS_LENGTH;
        int day;
        try {
            day = data[currentOffset] * 10;
            day += data[currentOffset + 1]; //Day has 2 bytes
        }
        catch (Exception e) {
            throw new ReadLineException(Constants.DATA_CONVERT_EXCEPTION);
        }

        rec.setDay(day);

        //Read Date - Month
        int month;
        try {
            month = data[currentOffset + 2] * 10;
            month += data[currentOffset + 3]; //Month has 2 bytes
        }
        catch (Exception e) {
            throw new ReadLineException(Constants.DATA_CONVERT_EXCEPTION);
        }

        rec.setMonth(month);

        //Read Date - Year
        int year;
        try {
            year = data[currentOffset + 4] * 1000;
            year += data[currentOffset + 5] * 100;
            year += data[currentOffset + 5] * 10;
            year += data[currentOffset + 5];
        }
        catch (Exception e) {
            throw new ReadLineException(Constants.DATA_CONVERT_EXCEPTION);
        }

        rec.setYear(year);

        //Read Note
        //Read Password
        currentOffset += Constants.DATE_LENGTH;
        try {
            buf = new char[Constants.NOTE_LENGTH];
            for (int i = 0; i < Constants.NOTE_LENGTH; i++)
                buf[i] = (char)data[currentOffset + i];
        }
        catch (Exception e) {
            throw new ReadLineException(e);
        }

        rec.setNote(String.copyValueOf(buf));

        decodedData.add(rec);
    }
}
