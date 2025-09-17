package com.tnsif.customerservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Customer {

	
    @Id
    @Column(name = "C_id")
    private int c_id;
    @Column(name = "C_name")
    private String c_name;
    @Column(name = "Address")
    private String address;
    
    public Customer() {
    	super();
    }
    
    public Customer(int c_id, String c_name, String address)
    {
    	super();
    	this.c_id = c_id;
    	this.c_name = c_name;
    	this.address = address;	
    }
    public int getC_id() {
    	return c_id;
    }
	

}
