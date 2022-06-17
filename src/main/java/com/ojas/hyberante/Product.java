package com.ojas.hyberante;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class Product {
	@Id
	@Column(name="PRODUCT_ID")
	private int pid;
	@Column(name="PRODUCT_NAME")
	private String pname;
	@Column(name="PRODUCT_QTY")
	private int qty;
	@Column(name="PRODUCT_PRICE")
	private long price;
	
	public Product() {
		
	}

	public Product(int pid, String pname, int qty, long price) {
	
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	public String toString() {
		return pid +"\t"+pname+"\t"+qty+"\t"+price;
	}

}
