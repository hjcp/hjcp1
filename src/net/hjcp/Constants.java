package net.hjcp;

public class Constants {
    public final static int PRIVILEGE_OPERATOR = 1;
    public final static int PRIVILEGE_USER = 2;
    public final static int PRIVILEGE_ADMINISTRATOR = 3;
    public final static int PRIVILEGE_SUPERVISOR = 4;
    public final static int STATUS_OK = 1;
    public final static int STATUS_BLOCK = 2;

    public final static int PRIVILEGE_LENGTH = 1;
    public final static int USERNAME_LENGTH = 15;
    public final static int PASSWORD_LENGTH = 16;
    public final static int STATUS_LENGTH = 1;
    public final static int DATE_LENGTH = 8;
    public final static int NOTE_LENGTH = 7;

    public final static String OPERATOR = "Operator";
    public final static String USER = "User";
    public final static String ADMIN = "Administrator";
    public final static String SUPERVISOR = "Supervisor";
    public final static String OK = "OK";
    public final static String BLOCK = "Block";
    public final static String UNKNOWN = "Unknown";

    public final static String DATA_CONVERT_EXCEPTION = "Error while converting data.";
    public final static String ARRAY_SIZE_EXCEPTION = "Array length is not correct";
    public final static String OUT_OF_RANGE_EXCEPTION = "The index is out of range.";
    public final static String PRIVILEGE_EXCEPTION = "Unknown privilege.";
    public final static String STATUS_EXCEPTION = "Unknown status.";

    public final static String PROBLEM_NAME = "Hexlet Java Community Problems (HJCP)";
    public final static String PROBLEM_URL = "Problem: #1 (https://github.com/hjcp/hjcp1.git)";
    public final static String AUTHOR = "Create by: Sergey Gaberer";
    public final static String SOLVE_URL = "URL: https://github.com/domiso/hjcp1.git";
    public final static String SOLVE_VERSION = "Version: 1.0";

    //Table header
    public final static String HEADER_PRIVILEGY = "Privilegy";
    public final static String HEADER_USERNAME = "Username";
    public final static String HEADER_PASSWORD = "Pasword";
    public final static String HEADER_STATUS = "Status";
    public final static String HEADER_DATE = "Date";
    public final static String HEADER_NOTE = "Note";
}
