package net.hjcp;

import java.util.ArrayList;

public class DataShower {
    private final String PRINT_SYMBOL = "*";
    private final int LINE_LENGTH = 86;

    //Column width
    private final int PRIVILEGE_WIDTH = 14;
    private final int USERNAME_WIDTH = 16;
    private final int PASSWORD_WIDTH = 17;
    private final int STATUS_WIDTH = 7;
    private final int DATE_WIDTH = 11;
    private final int NOTE_WIDTH = 8;

    private ArrayList<Record> data;

    public DataShower(ArrayList<Record> data) {
        this.data = data;

        PrintHeader();
        PrintTable();
    }

    private void PrintHeader() {
        System.out.println(FillSpace(7) + Constants.PROBLEM_NAME);
        System.out.println(FillSpace(7) + Constants.PROBLEM_URL);
        System.out.println(FillSpace(7) + Constants.AUTHOR);
        System.out.println(FillSpace(7) + Constants.SOLVE_URL);
        System.out.println(FillSpace(7) + Constants.SOLVE_VERSION);
        System.out.println();
    }

    private void PrintTable() {
        PrintTableHeader();
        for (Record aData : data) PrintRecord(aData);
        PrintLine(PRINT_SYMBOL, LINE_LENGTH);
    }

    public void PrintTableHeader() {
        PrintLine(PRINT_SYMBOL, LINE_LENGTH);
        System.out.println(" " + PRINT_SYMBOL + " " + Constants.HEADER_PRIVILEGY + FillSpace(PRIVILEGE_WIDTH - Constants.HEADER_PRIVILEGY.length()) + PRINT_SYMBOL + " " +
                Constants.HEADER_USERNAME + FillSpace(USERNAME_WIDTH - Constants.HEADER_USERNAME.length()) + PRINT_SYMBOL + " " +
                Constants.HEADER_PASSWORD + FillSpace(PASSWORD_WIDTH - Constants.HEADER_PASSWORD.length()) + PRINT_SYMBOL + " " +
                Constants.HEADER_STATUS + FillSpace(STATUS_WIDTH - Constants.HEADER_STATUS.length()) + PRINT_SYMBOL + " " +
                Constants.HEADER_DATE + FillSpace(DATE_WIDTH - Constants.HEADER_DATE.length()) + PRINT_SYMBOL + " " +
                Constants.HEADER_NOTE + FillSpace(NOTE_WIDTH - Constants.HEADER_NOTE.length()) + PRINT_SYMBOL);
        PrintLine(PRINT_SYMBOL, LINE_LENGTH);
    }

    private void PrintRecord(Record record) {

        System.out.println(" " + PRINT_SYMBOL + " " + record.getPrivilege() + FillSpace(PRIVILEGE_WIDTH - record.getPrivilege().length()) + PRINT_SYMBOL + " " +
                record.getUsername() + FillSpace(USERNAME_WIDTH - record.getUsername().length()) + PRINT_SYMBOL + " " +
                record.getPassword() + FillSpace(PASSWORD_WIDTH - record.getPassword().length()) + PRINT_SYMBOL + " " +
                record.getStatus() + FillSpace(STATUS_WIDTH - record.getStatus().length()) + PRINT_SYMBOL + " " +
                record.getYear() + "/" + record.getMonth() + "/" + record.getDay() + " " + PRINT_SYMBOL + " " +
                record.getNote() + " " + PRINT_SYMBOL);
    }

    private void PrintLine(String symbol, int length) {
        System.out.print(" ");
        for (int i = 0; i < length; i++)
            System.out.print(symbol);
        System.out.print("\n");
    }

    private String FillSpace(int count){
        String str = " ";

        for (int i = 0; i < count - 1; i++)
            str += " ";

        return str;
    }
}
