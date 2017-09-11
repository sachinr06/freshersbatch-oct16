package HibernateMappingTest.HibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;





public class MAIN_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration configuration =new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	SessionFactory sessionFactory=configuration.buildSessionFactory();
    	Session session =sessionFactory.openSession();
    	Transaction tx=session.beginTransaction();
    	Address add=new Address(225,"Laxmi Nagar","Nagpur",20);
    	Customer cust=new Customer("Sachin",12345,add);
       	Address add2=new Address(249,"Pratap Nagar","Nagpur",18);
    	Customer cust2=new Customer("Shruti",12545,add2);
    	session.persist(cust);
    	session.persist(cust2);
    	tx.commit();
    	session.close();
    	
    	Session session2 =sessionFactory.openSession();
    	Transaction tx2=session2.beginTransaction();
    	Customer customer=session2.get(Customer.class, 3L);
    	customer.setPhone(122345);
    	customer.getAddress().setArea("RanaPratap Nagar");
    	tx2.commit();
    	session2.close();
    	
    	Session session3 =sessionFactory.openSession();
    	Transaction tx3=session3.beginTransaction();
    	Customer customer2=session3.get(Customer.class, 3L);
    	session3.delete(customer2);
    	tx3.commit();
    	session3.close();

	}

}