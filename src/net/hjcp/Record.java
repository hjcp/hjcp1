package net.hjcp;

import java.security.InvalidParameterException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class Record {
    private String priv;
    private String userName;
    private String password;
    private String status;
    private Date date;
    private String note;

    public String getPriv() {
        return priv;
    }

    public void setPriv(int priv) {
        switch (priv){
            case 01: this.priv = "Operator";
                break;
            case 02: this.priv = "User";
                break;
            case 03: this.priv = "Administrator";
                break;
            case 04: this.priv = "Supervisor";
                break;
            default: throw new InvalidParameterException();

        }

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(int status) {
        switch (status){
            case 1: this.status = "OK";
                break;
            case 2: this.status = "Block";
                break;
            default: throw new InvalidParameterException();
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(String date) {
        try
        {
            this.date = new SimpleDateFormat("ddMMyyyy", Locale.ENGLISH).parse(date);
        }
        catch (ParseException e){
            e.printStackTrace();
        }

    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
