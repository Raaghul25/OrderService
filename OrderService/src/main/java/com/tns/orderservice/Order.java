package com.tns.orderservice;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Order {
	@Id
	@Column(name="orderid")
	private int orderid;
	
	@Column(name="custname")
	private String custname;
	
	@Column(name="address")
	private String address;
	
	@Column(name="email")
	private String email;
	
	@Column(name="ostatus")
	private String ostatus;
	
	@Column(name="payment")
	private double payment;
	
	//Generate getter setter
	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOstatus() {
		return ostatus;
	}

	public void setOstatus(String ostatus) {
		this.ostatus = ostatus;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public Order(int orderid, String custname, String address, String email, String ostatus, double payment) {
		super();
		this.orderid = orderid;
		this.custname = custname;
		this.address = address;
		this.email = email;
		this.ostatus = ostatus;
		this.payment = payment;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", custname=" + custname + ", address=" + address + ", email=" + email
				+ ", ostatus=" + ostatus + ", payment=" + payment + "]";
	}
	
	
}
	
	
	