package entitiesTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

import entities.Course;
import entities.Module;
import entities.Student;

/**
 * Test class for Module.java
 * @author Niall Greaney
 * @ID 15479942
 */
public class ModuleTest {

	private Module module;
	private String defaultName;
	private String defaultId;
	private ArrayList<Student> defaultStudents;
	private ArrayList<Course> defaultCourses;
	
	private Student s1;
	private Student s2;
	private Student s3;
	
	private Course BP;
	private Course BCT;
	
	@Before
	public void setUp() {
		defaultName = "Software Engineering III";
		defaultId = "CT417";
		
		BP = new Course("ECE");
		BCT = new Course("CS and IT");
		
		s1 = new Student("John Smith", new DateTime(1995, 2, 1, 0, 0), 15412345, BP, new ArrayList<Module>());
		s2 = new Student("Mary Berry", new DateTime(1998, 7, 25, 0, 0), 15454321, BP, new ArrayList<Module>());
		s3 = new Student("Peter Parker", new DateTime(1997, 11, 25, 0, 0), 15414325, BCT, new ArrayList<Module>());
		
		defaultStudents = new ArrayList<Student>();
		
		defaultStudents.add(s1);
		defaultStudents.add(s2);
		defaultStudents.add(s3);
		
		defaultCourses = new ArrayList<Course>();
		defaultCourses.add(BCT);
		defaultCourses.add(BP);
		
		module = new Module(defaultName, defaultId, defaultStudents, defaultCourses);
		
	}

	@Test
	public void testName() {
		// Test default name
		assertEquals(defaultName, module.getName());
		
		String newName = "Software Eng IV";
		module.setName(newName);
		
		// Test new name
		assertEquals(newName, module.getName());
	}
	
	@Test
	public void testId() {
		// Test default ID
		assertEquals(defaultId, module.getId());
		
		String newId = "CT412";
		module.setId(newId);
		
		// Test new ID
		assertEquals(newId, module.getId());
	}
	
	@Test
	public void testStudents() {
		assertEquals(defaultStudents, module.getStudents());
		
		Student newStudent1 = new Student("Barry Allen", new DateTime(1995, 12, 2, 0, 0), 15478542, BCT, new ArrayList<Module>());
		Student newStudent2 = new Student("Oliver Queen", new DateTime(1994, 12, 2, 0, 0), 15478542, BP, new ArrayList<Module>());
		
		ArrayList<Student> newStudentList = new ArrayList<Student>();
		newStudentList.add(newStudent1);
		newStudentList.add(newStudent2);
		
		module.setStudents(newStudentList);
		
		assertEquals(newStudentList, module.getStudents());
	}
	
	@Test
	public void testAddStudent() {		
		Student newStudent = new Student("Matt Murdoc", new DateTime(1994, 7, 2, 0, 0), 66666666, BP, new ArrayList<Module>());
		module.addStudent(newStudent);
		
		assert(module.getStudents().contains(newStudent));
	}
	
	@Test
	public void testRemoveStudent() {
		module.removeStudent(s1);
		assert(!module.getStudents().contains(s1));
	}
	
	@Test
	public void testCourses() {
		// Test default Courses
		assertEquals(defaultCourses, module.getCourses());
		
		String newCourseName1 = "4BP2";
		String newCourseName2 = "CSIT";
		Course newCourse1 = new Course(newCourseName1);
		Course newCourse2 = new Course(newCourseName2);
		
		ArrayList<Course> newCourseList = new ArrayList<Course>();
		newCourseList.add(newCourse1);
		newCourseList.add(newCourse2);
		
		module.setCourses(newCourseList);
		// Test the new course list
		assertEquals(newCourseList, module.getCourses());

	}

	@Test
	public void testAddCourse() {		
		Course newCourse = new Course("Undenominated Engineering");
		module.addCourse(newCourse);
		
		assert(module.getCourses().contains(newCourse));
	}
	
	@Test
	public void testRemoveCourse() {
		module.removeCourse(BP);
		assert(!module.getCourses().contains(BP));
	}

}
