package entities;

import java.util.ArrayList;

/**
 * Module - a class which represents a module in the university.
 * @author Niall Greaney
 * @ID 15479942
 */
public class Module {
	private String name;
	private String id;
	private ArrayList<Student> students;
	private ArrayList<Course> courses;
	
	/**
	 * Module Constructor:
	 * @param name - the name of the module.
	 * @param id - the id of the module.
	 * @param students - the list of students registered for the module.
	 * @param courses - the courses the module is apart of.
	 */
	public Module(String name, String id, ArrayList<Student> students, ArrayList<Course> courses) {
		this.name = name;
		this.id = id;
		this.students = students;
		this.courses = courses;
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
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
	 * @return the courses
	 */
	public ArrayList<Course> getCourses() {
		return courses;
	}

	/**
	 * @param courses the courses to set
	 */
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	
	/**
	 * Adds a course to the list of courses the module is apart of.
	 * @param course - the course to be added.
	 */
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	/** 
	 * Removes a course to the list of courses the module is apart of.
	 * @param course - the course to be removed.
	 */
	public void removeCourse(Course course) {
		if (courses.contains(course)) {
			courses.remove(course);
		}
	}
	
	/**
	 * Adds a student to the list of students registered for the module.
	 * @param student - the student to be added.
	 */
	public void addStudent(Student student) {
		students.add(student);
	}
	
	/** 
	 * Removes a student from the list of students registered for the module.
	 * @param student - the student to be removed.
	 */
	public void removeStudent(Student student) {
		if (students.contains(student)) {
			students.remove(student);
		}
	}
	
	
}
