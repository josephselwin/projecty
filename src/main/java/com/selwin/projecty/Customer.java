package com.selwin.projecty;


public class Customer {
    private String first_name;
    private String last_name;
    private String email;
    //private java.sql.Date dob;

    public String getFname() {
        return first_name;
    }

    public void setFname(String first_name) {
        this.first_name = first_name;
    }

    public String getLname() {
        return last_name;
    }

    public void setLname(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //public java.sql.Date getDob() {return dob;}

    //public void setDob(java.sql.Date dob) {this.dob = dob;    }
}
