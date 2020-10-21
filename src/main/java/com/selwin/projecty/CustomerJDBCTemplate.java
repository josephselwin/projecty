package com.selwin.projecty;

import java.util.Map;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class CustomerJDBCTemplate implements CustomerDAO{

    private DataSource dataSource;
    private SimpleJdbcCall jdbcCall;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcCall =  new SimpleJdbcCall(dataSource).withProcedureName("GET_CUSTOMER");
    }

    public Customer getCustomer(String email) {
        System.out.println("In getCustomer - JDBCTemplate:- " + email);
        SqlParameterSource in = new MapSqlParameterSource().addValue("pr_email", email);
        Map<String, Object> out = jdbcCall.execute(in);

        Customer customer = new Customer();
        customer.setEmail(email);
        customer.setFname((String) out.get("pr_o_fname"));
        customer.setLname((String) out.get("pr_o_lname"));
        customer.setDob((java.sql.Date) out.get("pr_o_dob"));

        return customer;
    }
}
