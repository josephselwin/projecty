package com.selwin.projecty;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class CustomerMapper implements RowMapper<Customer> {

    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
        Customer customer = new Customer();

        customer.setFname(rs.getString("pr_o_fname"));
        customer.setLname(rs.getString("pr_o_lname"));
        customer.setDob(rs.getDate("pr_o_dob"));
        customer.setEmail(rs.getString("pr_o_email"));

        return customer;
    }
}
