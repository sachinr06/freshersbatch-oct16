package HibernateCachingTest.HibernateCaching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main_caching_2_level {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		Configuration configuration =new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	SessionFactory sessionFactory=configuration.buildSessionFactory();
    	Session session =sessionFactory.openSession();
    	Transaction tx=session.beginTransaction();
    	Employee emp=new Employee("Sachin",10000);
    	session.persist(emp);
    	Employee emp_2=session.get(Employee.class, emp.getId());
    	//session.evict(emp);
    	Employee emp_3=session.get(Employee.class, emp.getId());
    	tx.commit();
    	session.close();
    //
    	//sessionFactory.getCache().evictEntity(Employee.class, emp.getId());
    	//Thread.sleep(10000);
    	
    	Session session2 =sessionFactory.openSession();
    	Transaction tx2=session2.beginTransaction();
    	Employee emp_4=session2.get(Employee.class, emp.getId());
    	//emp_4.setSalary(20000);
    	tx2.commit();
    	session2.close();

	}

}
