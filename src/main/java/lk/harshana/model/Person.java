/**
 * 
 *  @author Harshana Madusanka Jayamaha
 */

package lk.harshana.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Person.
 */
@Entity
@Table(name="person")
public class Person {

	/** The pid. */
	@Id
	@Column(name="pid")
	private int pid;
	
	/** The first name. */
	@Column(name="firstName")
	private String firstName;
	
	/** The last name. */
	@Column(name="lastName")
	private String lastName;
	
	/** The address. */
	@Column(name="address")
	private String address;
	
	/** The age. */
	@Column(name="age")
	private int age;
	
	/** The tel no. */
	@Column(name="telNo")
	private String telNo;
	
	/**
	 * Gets the pid.
	 *
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}
	
	/**
	 * Sets the pid.
	 *
	 * @param pid the new pid
	 */
	public void setPid(final int pid) {
		this.pid = pid;
	}
	
	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(final String address) {
		this.address = address;
	}
	
	/**
	 * Gets the age.
	 *
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Sets the age.
	 *
	 * @param age the new age
	 */
	public void setAge(final int age) {
		this.age = age;
	}
	
	/**
	 * Gets the tel no.
	 *
	 * @return the tel no
	 */
	public String getTelNo() {
		return telNo;
	}
	
	/**
	 * Sets the tel no.
	 *
	 * @param telNo the new tel no
	 */
	public void setTelNo(final String telNo) {
		this.telNo = telNo;
	}
}
