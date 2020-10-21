package com.selwin.projecty;

public class Custinfo {
    private final String fname;
    private final String lname;
    private final String email;
    private final java.sql.Date dob;

    public Custinfo(String fname, String lname, java.sql.Date dob, String email) {
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.email = email;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public java.sql.Date getDob() {
        return dob;
    }

}
