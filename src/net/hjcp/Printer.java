package net.hjcp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Created by stretch on 14.08.14.
 */
public class Printer {
    private static final String PRINT_SIMBOL="*";
    private static final String TOP_HEADER =  "\t\tHexlet Java Community Problems (HJCP)\n\r"+
                                              "\t\tProblem: #1 (https://github.com/hjcp/hjcp1.git)\n\r"+
                                              "\t\tCreate by: Anatoly Yashkin\n\r" +
                                              "\t\tURL: https://github.com/anatolko/hjcp1\n\r" +
                                              "\t\tVersion: 1.0";

    private static final int PRIV_LENGTH = 16;
    private static final int USER_NAME_LENGTH = 16;
    private static final int PASSWORD_LENGTH = 17;
    private static final int STATUS_LENGTH = 7;
    private static final int DATE_LENGTH = 11;
    private static final int NOTE_LENGTH = 7;
    private static final int TABLE_LENGTH = PRIV_LENGTH + USER_NAME_LENGTH + PASSWORD_LENGTH +STATUS_LENGTH +DATE_LENGTH + NOTE_LENGTH + 14;

    public static void print(ArrayList<Record> printData)
    {
        System.out.println(TOP_HEADER);

        System.out.println();
        printSymbol();

        System.out.print(PRINT_SIMBOL + " " + addSpaces("Privilogy",PRIV_LENGTH));
        System.out.print(PRINT_SIMBOL + " " + addSpaces("Username", USER_NAME_LENGTH));
        System.out.print(PRINT_SIMBOL + " " + addSpaces("Password", PASSWORD_LENGTH));
        System.out.print(PRINT_SIMBOL + " " + addSpaces("Status", STATUS_LENGTH));
        System.out.print(PRINT_SIMBOL + " " + addSpaces("Date",DATE_LENGTH));
        System.out.print(PRINT_SIMBOL + " " + addSpaces("Note",NOTE_LENGTH) + " " + PRINT_SIMBOL);



        System.out.println();
        printSymbol();

        for (Record r : printData)
        {
            System.out.print(PRINT_SIMBOL + " " + addSpaces(r.getPriv(),PRIV_LENGTH));
            System.out.print(PRINT_SIMBOL + " " + addSpaces(r.getUserName(), USER_NAME_LENGTH));
            System.out.print(PRINT_SIMBOL + " " + addSpaces(r.getPassword(), PASSWORD_LENGTH));
            System.out.print(PRINT_SIMBOL + " " + addSpaces(r.getStatus(), STATUS_LENGTH));

            DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
            String date = df.format(r.getDate());

            System.out.print(PRINT_SIMBOL + " " + addSpaces(date,DATE_LENGTH));
            System.out.print(PRINT_SIMBOL + " " + addSpaces(r.getNote(),NOTE_LENGTH) + " " + PRINT_SIMBOL);

            System.out.println();
        }
        printSymbol();
    }

    private static String addSpaces(String word, int necessaryLength)
    {
        int needSpaces = necessaryLength - word.length();
        for (int i = 0; i < needSpaces; i++)
            word += " ";

        return word;
    }

    private static void printSymbol()
    {
        for (int i = 0; i< TABLE_LENGTH; i++)
            System.out.print(PRINT_SIMBOL);

        System.out.println();
    }
}
