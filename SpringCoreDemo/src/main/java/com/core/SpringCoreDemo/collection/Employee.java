package com.core.SpringCoreDemo.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {

	private String EmployeeName;
	private List<String> phones; // list from collection framework
	private Set<String> addresses; // set from collection framework
	private Map<String, String> courses; // map for collection framework
	private Properties props; // you have to create getter setter for this ,
	

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}


	@Override
	public String toString() {
		return "Employee [EmployeeName=" + EmployeeName + ", phones=" + phones + ", addresses=" + addresses
				+ ", courses=" + courses + ", props=" + props + "]";
	}

	public Employee(String employeeName, List<String> phones, Set<String> addresses, Map<String, String> courses, Properties props) {
		super();
		EmployeeName = employeeName;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
		this.props = props;
	}

	public Employee() {
		super();
	}

}
