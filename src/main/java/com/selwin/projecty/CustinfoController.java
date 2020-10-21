package com.selwin.projecty;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@RestController
public class CustinfoController {

    @GetMapping("/custinfo")
    public Custinfo custinfo(@RequestParam(value = "email") String email) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        CustomerJDBCTemplate customerJDBCTemplate =
                (CustomerJDBCTemplate)context.getBean("customerJDBCTemplate");
        System.out.println("Parameter Passed: " + email);
        Customer customer = new Customer();
        //customer = customerJDBCTemplate.getCustomer(email);
        customer = customerJDBCTemplate.getCustomer(email);

        //return new Custinfo("Joseph","Selwin", "04-01-1986", "josephselwin@gmail.com");
        return new Custinfo(customer.getFname(), customer.getLname(), customer.getDob(), customer.getEmail());
    }
}
