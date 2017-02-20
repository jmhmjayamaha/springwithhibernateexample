/**
 * 
 *  @author Harshana Madusanka Jayamaha
 */

package lk.harshana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lk.harshana.model.Person;
import lk.harshana.service.def.PersonService;

@RestController
@RequestMapping(value="/person/info")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@RequestMapping(value="/addPerson", method=RequestMethod.POST)
	public void addPerson(@RequestBody Person person) {
		
		personService.addPerson(person);

	}
	
	@RequestMapping(value="persons", method=RequestMethod.GET)
	public List<Person> getAllPersons() {
		
		return personService.getAllPersons();
		
	}
}
