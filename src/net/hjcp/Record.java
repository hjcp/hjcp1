package net.hjcp;

public class Record {

    private String privilege;
    private String username;
    private String password;
    private String status;
    private int year;
    private int month;
    private int day;
    private String note;

    public Record() {
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(int privilege) {
        switch (privilege) {
            case Constants.PRIVILEGE_OPERATOR:
                this.privilege = Constants.OPERATOR;
                break;

            case Constants.PRIVILEGE_USER:
                this.privilege = Constants.USER;
                break;

            case Constants.PRIVILEGE_ADMINISTRATOR:
                this.privilege = Constants.ADMIN;
                break;

            case Constants.PRIVILEGE_SUPERVISOR:
                this.privilege = Constants.SVISOR;
                break;

            default:
                this.privilege = Constants.UNKNOWN;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username.length() <= Constants.USERNAME_LENGTH)
            this.username = username;
        else
            this.username = null;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() <= Constants.PASSWORD_LENGTH)
            this.password = password;
        else
            this.password = null;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(int status) {
        switch (status) {
            case Constants.STATUS_OK:
                this.status = Constants.OK;
                break;

            case Constants.STATUS_BLOCK:
                this.status = Constants.BLOCK;
                break;

            default:
                this.status = Constants.UNKNOWN;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        if (note.length() <= Constants.NOTE_LENGTH)
            this.note = note;
        else
            this.note = null;
    }
}
