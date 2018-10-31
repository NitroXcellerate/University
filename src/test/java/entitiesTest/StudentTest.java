package entitiesTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.joda.time.DateTime;
import org.joda.time.Years;
import org.junit.Before;
import org.junit.Test;

import entities.Course;
import entities.Module;
import entities.Student;

/**
 * Test class for Student.java
 * @author Niall Greaney
 * @ID 15479942
 */
public class StudentTest {

	private String defaultName;           
	private int defaultAge;  
	private DateTime defaultDob;
	private int defaultId;
	private Course defaultCourse;           
	private ArrayList<Module> defaultModules;
	
	private Module maths;
	private Module telecomms;
	private Module softEng;
	
	private Student student;
	
	@Before
	public void setup() {
		defaultName = "John Smith";   
		defaultDob = new DateTime(1997, 5, 21, 0, 0); 
		defaultAge = Years.yearsBetween(new DateTime(), defaultDob).getYears();                                                                                                                             
		defaultId = 15489635;                                                                                 
		defaultCourse = new Course("4BP", new DateTime(2018, 9, 3, 0, 0), new DateTime(2019, 5, 17, 0, 0));
		defaultModules = new ArrayList<Module>();                                               
		                                                                                                   
		maths = new Module("Mathematical Methods", "MA385", new ArrayList<Student>(), new ArrayList<Course>());             
		telecomms = new Module("Telecommunication Software Application", "EE453", new ArrayList<Student>(), new ArrayList<Course>());         
		softEng = new Module("Software Engineering III", "CT417", new ArrayList<Student>(), new ArrayList<Course>());           
		
		defaultModules.add(maths);
		defaultModules.add(telecomms);
		defaultModules.add(softEng);
		
		student = new Student(defaultName, defaultDob, defaultId, defaultCourse, defaultModules);
		
	}
	
	
	@Test
	public void testName() {
		// Test default name
		assertEquals(defaultName, student.getName());
		
		String newName = "John J Smith";
		student.setName(newName);
		
		// Test new name
		assertEquals(newName, student.getName());
	}
	
	@Test
	public void testAge() {
		// Test default age
		assertEquals(defaultAge, student.getAge());
	}
	
	@Test
	public void testDOB() {
		// Test default DOB
		assertEquals(defaultDob, student.getDob());
		
		DateTime newDob = new DateTime(1996, 10, 27, 0, 0);
		student.setDob(newDob);
		
		// Test new DOB
		assertEquals(newDob, student.getDob());
	}
	
	@Test
	public void testID() {
		// Test default ID
		assertEquals(defaultId, student.getId());
		
		int newId = 15478875;
		student.setId(newId);
		
		// Test new ID
		assertEquals(newId, student.getId());
	}
	
	@Test
	public void testCourse() {
		// Test default Course
		assertEquals(defaultCourse, student.getCourse());
		
		String newCourseName = "4BP2";
		DateTime newStartDate = new DateTime(2018, 9, 4, 0, 0);
		DateTime newEndDate = new DateTime(2019, 6, 25, 0, 0);
		Course newCourse = new Course(newCourseName, newStartDate, newEndDate);
		student.setCourse(newCourse);
		
		// Test new Course
		assertEquals(newCourse, student.getCourse());
	}
	
	@Test
	public void testModules() {
		// Test default modules
		assertEquals(defaultModules, student.getModules());
		
		// Define new module list
		ArrayList<Module> newModules = new ArrayList<Module>();                                               
        
		// Define new modules to add to the list
		Module physics = new Module("Physics", "PH140", new ArrayList<Student>(), new ArrayList<Course>());             
		Module machLearn = new Module("Machine Learning and Data Mining I", "CT475", new ArrayList<Student>(), new ArrayList<Course>());         
		Module socd1 = new Module("System on Chip Design 1", "EE451", new ArrayList<Student>(), new ArrayList<Course>());   
		
		// Add new modules to the list
		newModules.add(physics);
		newModules.add(machLearn);
		newModules.add(socd1);
		
		// Add module list to student
		student.setModules(newModules);
		
		assertEquals(newModules, student.getModules());
		
	}
	
	@Test
	public void testAddModules() {                                             
        
		// Define new modules to add to the list
		Module dbSys = new Module("Database Systems 1", "CT230", new ArrayList<Student>(), new ArrayList<Course>());              
		
		// Add module to student
		student.addModule(dbSys);
		
		assert(student.getModules().contains(dbSys));
	}
	
	@Test
	public void testRemoveModules() {                                             
        
		// Define new modules to add to the list
		Module modToRemove = student.getModules().get(0);            
		
		// Add module to student
		student.removeModule(modToRemove);
		
		assert(!student.getModules().contains(modToRemove));
	}
	
	@Test
	public void testGetUsername() {                                             
        
		student.setName(defaultName);
		
		String expectedUsername = defaultName + defaultAge;
		
		assertEquals(expectedUsername, student.getUsername());
	}

}
