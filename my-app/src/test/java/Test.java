import static org.junit.Assert.assertEquals;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {

	@org.junit.Test
	public void testUserNameOfStudent() {
		Student emma = new Student("Emma", 21, "07/01/1998", "16455696");
		
		assertEquals("Emma21", emma.getUsername());
		
	}
	
	@org.junit.Test
	public void testAddModuleOfStudent() { 
		Student emma = new Student("Emma", 21, "07/01/1998", "16455696");
		Module softwareEng = new Module("Software Engineering", "CT417");
		List<Module> modules = new ArrayList<Module>();
		
		emma.addModule(softwareEng);
		modules.add(softwareEng);
		
		assertEquals(modules, emma.getModules());
	}
	
	@org.junit.Test
	public void testAddCourseofStudent() {
		Student emma = new Student("Emma", 21, "07/01/1998", "16455696");
		Course computer = new Course("Computer Science", LocalDate.of(2016, 9, 01), LocalDate.of(2020, 5, 31));
		List<Course> courses = new ArrayList<Course>();
		
		emma.addCourse(computer);
		courses.add(computer);
		
		assertEquals(courses, emma.getCourses());
		
	}
	
	@org.junit.Test
	public void testStudentName() { 
		Student student = new Student();
		student.setName("Emma");
		
		assertEquals("Emma", student.getName());
	}
	
	@org.junit.Test	
	public void testStudentDob() { 
		Student student = new Student();
		student.setDob("07/01/1998");
		
		assertEquals("07/01/1998", student.getDob());
	}
	
	@org.junit.Test
	public void testStudentAge() { 
		Student student = new Student();
		student.setAge(21);
		
		assertEquals(21, student.getAge());
	}
	
	@org.junit.Test
	public void testModuleName() { 
		Module mod = new Module();
		mod.setName("Programming");
		
		assertEquals("Programming", mod.getName());
	}
	
	@org.junit.Test
	public void testModuleId() { 
		Module mod = new Module();
		mod.setId("CT123");
		
		assertEquals("CT123", mod.getId());
	}
	
	@org.junit.Test
	public void testAddStudentOfModule() {
		Module mod = new Module();
	
		List<Student> students = new ArrayList<Student>();
		Student david = new Student();
		Student emma = new Student();
		
		mod.addStudent(david);
		mod.addStudent(emma);
		
		students.add(david);
		students.add(emma);
	
		
		assertEquals(students, mod.getStudents());
		
	}
	
	@org.junit.Test
	public void testAddCourseOfModule() {
		Module mod = new Module();
	
		List<Course> courses = new ArrayList<Course>();
		Course computerSci = new Course();
		Course engineering = new Course();
		
		
		mod.addCourse(computerSci);
		mod.addCourse(engineering);
		
		courses.add(computerSci);
		courses.add(engineering);
		
		assertEquals(courses, mod.getCourses());
		
	}
	
	@org.junit.Test
	public void testCourseName() { 
		Course compSci = new Course();
		compSci.setCourseName("Computer Science");
		
		assertEquals("Computer Science", compSci.getCourseName());
	}
	
	@org.junit.Test
	public void testAddModuleOfCourse() {
		Course compSci = new Course();
	
		List<Module> modules = new ArrayList<Module>();
		Module programming = new Module();
		Module professionalSkills = new Module();
		
		compSci.addModule(programming);
		compSci.addModule(professionalSkills);
		
		modules.add(programming);
		modules.add(professionalSkills);
		
		assertEquals(modules, compSci.getModules());
		
	}
	
	@org.junit.Test
	public void testAddStudentOfCourse() {
		Course compSci = new Course();
	
		List<Student> students = new ArrayList<Student>();
		Student david = new Student();
		Student emma = new Student();
		
		compSci.addStudent(david);
		compSci.addStudent(emma);
		
		students.add(david);
		students.add(emma);
	
		
		assertEquals(students, compSci.getStudents());
		
		
	}

}
