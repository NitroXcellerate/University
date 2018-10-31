package entities;

import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 * Course - a class which represents a course in the university.
 * @author Niall Greaney
 * @ID 15479942
 */
public class Course {
	private String name;
	private ArrayList<Module> modules;
	private ArrayList<Student> students;
	private DateTime startDate;
	private DateTime endDate;
	
	/**
	 * Course Constructor:
	 * Creates a course object
	 * @param name - the name of the course (e.g. 4BP)
	 * @param startDate - the date the course starts
	 * @param endDate - the date the course finishes
	 * @param modules - the list of modules the course provides
	 * @param students - the list of students enrolled in the course
	 */
	public Course(String name, DateTime startDate, DateTime endDate, ArrayList<Module> modules, ArrayList<Student> students) {
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.modules = modules;
		this.students = students;
	}
	
	/**
	 * Course Constructor:
	 * Creates a course object with an empty list for the modules and students.
	 * @param name - the name of the course (e.g. 4BP)
	 * @param startDate - the date the course starts
	 * @param endDate - the date the course finishes
	 */
	public Course(String name, DateTime startDate, DateTime endDate) {
		this(name, startDate, endDate, new ArrayList<Module>(), new ArrayList<Student>());
	}
	
	/**
	 * Course Constructor:
	 * Creates a course object where the start date is the 01/01/2000, the end date is 31/12/2000 
	 * and an empty list for the modules and students
	 * @param name - the name of the course (e.g. 4BP)
	 */
	public Course(String name) {
		this(name, new DateTime(2000, 1, 1, 0, 0), new DateTime(2000, 12, 31, 0, 0));
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
	 * @return the students
	 */
	public ArrayList<Student> getStudents() {
		return students;
	}

	/**
	 * @param students the students to set
	 */
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	/**
	 * @return the startDate
	 */
	public DateTime getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public DateTime getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
	
	/**
	 * Adds a module to a list of modules the course provides.
	 * @param module - the module to be added.
	 */
	public void addModule(Module module) {
		modules.add(module);
	}
	
	/** 
	 * Removes a module from the list of modules the course provides.
	 * @param module - the module to be removed.
	 */
	public void removeModule(Module module) {
		if (modules.contains(module)) {
			modules.remove(module);
		}
	}
	
	/**
	 * Adds a student to a list of students registered for the course.
	 * @param student - the student to be added.
	 */
	public void addStudent(Student student) {
		students.add(student);
	}
	
	/** 
	 * Removes a student from the list of students registered for the course.
	 * @param student - the student to be removed.
	 */
	public void removeStudent(Student student) {
		if (students.contains(student)) {
			students.remove(student);
		}
	}
}
