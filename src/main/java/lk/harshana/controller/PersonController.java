/**
 * 
 *  @author Harshana Madusanka Jayamaha
 */

package lk.harshana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lk.harshana.model.Person;
import lk.harshana.service.def.PersonService;

/**
 * The Class PersonController.
 */
@RestController
@RequestMapping(value = "/person/info")
public class PersonController {

	/** The person service. */
	@Autowired
	private PersonService personService;

	/**
	 * Adds the person.
	 *
	 * @param person the person
	 */
	@RequestMapping(value = "/addPerson", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void addPerson(@RequestBody Person person) {

		personService.addPerson(person);

	}

	/**
	 * Gets the all persons.
	 *
	 * @return the all persons
	 */
	@RequestMapping(value = "/persons", method = RequestMethod.GET)
	public List<Person> getAllPersons() {

		return personService.getAllPersons();

	}

	/**
	 * Gets the person.
	 *
	 * @param pid the pid
	 * @return the person
	 */
	@RequestMapping(value = "/persons/{pid}", method = RequestMethod.GET)
	public Person getPerson(@PathVariable("pid") final int pid) {

		return personService.getPerson(pid);

	}

	/**
	 * Update person.
	 *
	 * @param person the person
	 */
	@RequestMapping(value = "/updatePerson", method = RequestMethod.PUT)
	public void updatePerson(@RequestBody Person person) {

		personService.updatePerson(person);
	}

	/**
	 * Delete person.
	 *
	 * @param pid the pid
	 */
	@RequestMapping(value = "/deletePerson/{pid}", method = RequestMethod.DELETE)
	public void deletePerson(@PathVariable("pid") int pid) {
		personService.deletePerson(pid);
	}
}
