/**
 * 
 *  @author Harshana Madusanka Jayamaha
 */

package lk.harshana.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lk.harshana.model.Person;

/**
 * The Class HibernateConfig.
 */
public class HibernateConfig {

	/** The session factory. */
	public static SessionFactory sessionFactory;
	
	static {
		Configuration config = new Configuration();
		config.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
		config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/springwithhibernateexample");
		config.setProperty("hibernate.connection.username", "root");
		config.setProperty("hibernate.connection.password", "harshana");
		config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		
		config.addAnnotatedClass(Person.class);
		
		sessionFactory = config.buildSessionFactory();
	}
}
