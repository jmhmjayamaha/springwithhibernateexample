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

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonDAO personDao;
	
	public boolean addPerson(final Person person) {
		personDao.addPerson(person);
		return false;
	}

	public List<Person> getAllPersons() {
		
		return personDao.getAllPersons();
		
	}

	public Person getPerson(final int pid) {
		
		return personDao.getPerson(pid);
	}

	public void updatePerson(final Person person) {
		
		personDao.updatePerson(person);
		
	}

	public void deletePerson(final int pid) {
		
		personDao.deletePerson(pid);
		
	}

	
}
