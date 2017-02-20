/**
 * 
 *  @author Harshana Madusanka Jayamaha
 */

package lk.harshana.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import lk.harshana.config.HibernateConfig;
import lk.harshana.dao.def.PersonDAO;
import lk.harshana.model.Person;

/**
 * The Class PersonDAOImpl.
 */
@Repository
public class PersonDAOImpl implements PersonDAO {

	/* (non-Javadoc)
	 * @see lk.harshana.dao.def.PersonDAO#addPerson(lk.harshana.model.Person)
	 */
	public boolean addPerson(final Person person) {
		Session session = HibernateConfig.sessionFactory.openSession();
		Transaction t = null;
		
		try {
			t = session.beginTransaction();
			
			session.save(person);
			
			t.commit();
		} catch(HibernateException e) {
			if(t != null) {
				t.rollback();
			}
		} finally {
			session.close();
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see lk.harshana.dao.def.PersonDAO#getAllPersons()
	 */
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see lk.harshana.dao.def.PersonDAO#getPerson(int)
	 */
	public Person getPerson(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see lk.harshana.dao.def.PersonDAO#updatePerson(lk.harshana.model.Person)
	 */
	public void updatePerson(Person person) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see lk.harshana.dao.def.PersonDAO#deletePerson(lk.harshana.model.Person)
	 */
	public void deletePerson(final int pid) {
		// TODO Auto-generated method stub
		
	}

}
