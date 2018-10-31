package entities;

import java.util.ArrayList;

import org.joda.time.DateTime;
import org.joda.time.Years;

/**
 * Student - A class which represents a student in the university.
 * @author Niall Greaney
 * @ID 15479942
 */
public class Student {
	
	private String name;
	private int age;
	private DateTime dob;
	private int id;
	private Course course;
	private ArrayList<Module> modules;
	
	/**
	 * Student - A object which represents a student in the college.
	 * @param name - the name of the student.
	 * @param dob - the students date of birth.
	 * @param id - the students's ID.
	 * @param course - the course the student is taking.
	 * @param modules - the list of modules the student is taking.
	 */
	public Student(String name, DateTime dob, int id, Course course, ArrayList<Module> modules) {
		this.name = name;
		this.dob = dob;
		this.id = id;
		this.course = course;
		this.modules = modules;
	}
	
	/**
	 * Student - A student with a blank module list and no course defined.
	 * @param name - the name of the student.
	 * @param dob - the students date of birth.
	 * @param id - the students's ID.
	 */
	public Student(String name, DateTime dob, int id) {
		this(name, dob, id, null, new ArrayList<Module>());
	}
	
	/**
	 * Returns the username of the student.
	 * The username is a concatenation of the students name and their age
	 * @return String - the students username
	 */
	public String getUsername() {
		return name + age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the difference between the Students DoB with the current date
	 * @return the age
	 */
	public int getAge() {
		if (dob != null) {
			return Years.yearsBetween(dob, new DateTime()).getYears();
		}
		return 0;
	}

	/**
	 * @return the dob
	 */
	public DateTime getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(DateTime dob) {
		this.dob = dob;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the course
	 */
	public Course getCourse() {
		return course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(Course course) {
		this.course = course;
	}

	/**
	 * @return the modules
	 */
	public ArrayList<Module> getModules() {
		return modules;
	}

	/**
	 * @param modules the modules to set
	 */
	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}
	
	/**
	 * Adds a module to a list of modules the student is registered for.
	 * @param module - the module to be added.
	 */
	public void addModule(Module module) {
		modules.add(module);
	}
	
	/** 
	 * Removes a module from the list of modules the student is registered for.
	 * @param module - the module to be removed.
	 */
	public void removeModule(Module module) {
		if (modules.contains(module)) {
			modules.remove(module);
		}
	}
}
