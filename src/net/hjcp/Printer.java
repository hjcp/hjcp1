package net.hjcp;

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

    public static void print(int[] data)
    {
        System.out.println(TOP_HEADER);
    }
}
