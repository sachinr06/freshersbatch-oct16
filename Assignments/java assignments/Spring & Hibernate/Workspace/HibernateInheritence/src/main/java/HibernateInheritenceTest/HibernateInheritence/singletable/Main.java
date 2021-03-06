package HibernateInheritenceTest.HibernateInheritence.singletable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configuration =new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	SessionFactory sessionFactory=configuration.buildSessionFactory();
    	Session session =sessionFactory.openSession();
    	Transaction tx=session.beginTransaction();
			Vehicle v=new Vehicle(1000);
			Car c=new Car(1000,"Ford");
			Bike b=new Bike(500,"Kawasaki");
			session.persist(v);
			session.persist(c);
			session.persist(b);
			tx.commit();
			session.close();
	}

}
