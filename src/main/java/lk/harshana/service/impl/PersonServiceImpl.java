/**
 * 
 *  @author Harshana Madusanka Jayamaha
 */

package lk.harshana.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.harshana.dao.def.PersonDAO;
import lk.harshana.model.Person;
import lk.harshana.service.def.PersonService;

/**
 * The Class PersonServiceImpl.
 */
@Service
public class PersonServiceImpl implements PersonService{

	/** The person dao. */
	@Autowired
	private PersonDAO personDao;
	
	/* (non-Javadoc)
	 * @see lk.harshana.service.def.PersonService#addPerson(lk.harshana.model.Person)
	 */
	public boolean addPerson(final Person person) {
		personDao.addPerson(person);
		return false;
	}

	/* (non-Javadoc)
	 * @see lk.harshana.service.def.PersonService#getAllPersons()
	 */
	public List<Person> getAllPersons() {
		
		return personDao.getAllPersons();
		
	}

	/* (non-Javadoc)
	 * @see lk.harshana.service.def.PersonService#getPerson(int)
	 */
	public Person getPerson(final int pid) {
		
		return personDao.getPerson(pid);
	}

	/* (non-Javadoc)
	 * @see lk.harshana.service.def.PersonService#updatePerson(lk.harshana.model.Person)
	 */
	public void updatePerson(final Person person) {
		
		personDao.updatePerson(person);
		
	}

	/* (non-Javadoc)
	 * @see lk.harshana.service.def.PersonService#deletePerson(int)
	 */
	public void deletePerson(final int pid) {
		
		personDao.deletePerson(pid);
		
	}

	
}
