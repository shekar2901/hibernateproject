package com.ojas.hyberante;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertProduct {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
	    Transaction tx=s.beginTransaction();
	    Product p1=new Product();
	    p1.setPid(101);
	    p1.setPname("harsha");
	    p1.setQty(49);
	    p1.setPrice(452);
	    s.save(p1);
	    tx.commit();
	    s.close();
	    sf.close();
	    
		
	}

}
