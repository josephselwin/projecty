package com.selwin.projecty;

import javax.sql.DataSource;

public interface CustomerDAO {
    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     */
    public void setDataSource(DataSource ds);

    /**
     * This is the method to be used to create
     * a record in the Student table.
     */
    //public void create(String fname, String lname, String email, String dob);

    /**
     * This is the method to be used to list down
     * a record from the Student table corresponding
     * to a passed student id.
     */
    public Customer getCustomer(String email);

    /**
     * This is the method to be used to list down
     * all the records from the Student table.
     */
    //public List<Customer> listCustomer();

}
