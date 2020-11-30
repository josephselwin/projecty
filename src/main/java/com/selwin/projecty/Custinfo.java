package com.selwin.projecty;

public class Custinfo {
    private final String first_name;
    private final String last_name;
    private final String email;
    //private final java.sql.Date dob;

    public Custinfo(String first_name, String last_name, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        //this.dob = dob;
        this.email = email;
    }

    public String getFname() {
        return first_name;
    }

    public String getLname() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    /*
    public java.sql.Date getDob() {
        return dob;
    }
    */
}
