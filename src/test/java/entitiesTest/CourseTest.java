package entitiesTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

import entities.Course;
import entities.Module;
import entities.Student;

public class CourseTest {

	
	private String defaultName;
	private ArrayList<Student> defaultStudents;
	private ArrayList<Module> defaultModules;
	private DateTime defaultStartDate;
	private DateTime defaultEndDate;
	private Course course;
	Student testStudent;
	
 	@Before
	public void setUp() throws Exception {
 		defaultName = "Electronic and Computer Engineering";
 		defaultStudents = new ArrayList<Student>();
 		defaultModules = new ArrayList<Module>();
 		defaultStartDate = new DateTime(2018, 9, 3, 0, 0);
 		defaultEndDate = new DateTime(2019, 5, 17, 0, 0);
 		testStudent = new Student("Matt Murdoc", new DateTime(1994, 7, 2, 0, 0), 66666666, course, new ArrayList<Module>());
 		course = new Course(defaultName, defaultStartDate, defaultEndDate, defaultModules, defaultStudents);
	}

	@Test
	public void testName() {
		// Test default name
		assertEquals(defaultName, course.getName());
		
		String newName = "CS and IT";
		course.setName(newName);
		
		// Test new name
		assertEquals(newName, course.getName());
	}
	
	@Test
	public void testAddStudent() {		
		
		course.addStudent(testStudent);
		
		assert(course.getStudents().contains(testStudent));
	}
	
	@Test
	public void testRemoveStudent() {
		course.removeStudent(testStudent);
		assert(!course.getStudents().contains(testStudent));
	}
	
	@Test
	public void testStartDate() {
		assertEquals(defaultStartDate, course.getStartDate());
		
		DateTime newStartDate = new DateTime(2018, 9, 10, 0, 0);
		course.setStartDate(newStartDate);
		
		assertEquals(newStartDate, course.getStartDate());
	}
	
	@Test
	public void testEndDate() {
		assertEquals(defaultEndDate, course.getEndDate());
		
		DateTime defaultEndDate = new DateTime(2019, 6, 24, 0, 0);
		course.setStartDate(defaultEndDate);
		
		assertEquals(defaultEndDate, course.getStartDate());
	}
}
