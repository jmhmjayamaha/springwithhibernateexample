/**
 * 
 *  @author Harshana Madusanka Jayamaha
 */

package lk.harshana.service.def;

import java.util.List;

import lk.harshana.model.Person;

/**
 * The Interface PersonService.
 */
public interface PersonService {
	
	/**
	 * Adds the person.
	 *
	 * @param person the person
	 * @return true, if successful
	 */
	boolean addPerson(final Person person);
	
	/**
	 * Gets the all persons.
	 *
	 * @return the all persons
	 */
	List<Person> getAllPersons();
	
	/**
	 * Gets the person.
	 *
	 * @param pid the pid
	 * @return the person
	 */
	Person getPerson(final int pid);
	
	/**
	 * Update person.
	 *
	 * @param person the person
	 */
	void updatePerson(final Person person);
	
	/**
	 * Delete person.
	 *
	 * @param person the person
	 */
	void deletePerson(final int pid);
}
