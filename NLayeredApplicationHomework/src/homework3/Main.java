package homework3;

import java.util.ArrayList;

import homework3.business.CategoryManager;
import homework3.business.CourseManager;
import homework3.business.InstructorManager;
import homework3.core.logging.DatabaseLogger;
import homework3.core.logging.FileLogger;
import homework3.core.logging.Logger;
import homework3.core.logging.MailLogger;
import homework3.dataAccess.HibernateInstructorDao;
import homework3.dataAccess.JdbcCategoryDao;
import homework3.dataAccess.JdbcCourseDao;
import homework3.entities.Category;
import homework3.entities.Course;
import homework3.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		Instructor instructor1 = new Instructor();
		instructor1.setfirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setId(1);
		
		InstructorManager instructormanager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructormanager.add(instructor1);
		
		Course course1 = new Course("Yazılım Geliştirici Yetiştirme Kampı(C# + Angular)", "2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip, döküman ve duyurularını..", 1, 0, 0, instructor1);
		Course course2 = new Course("Senior Yazılım Geliştirici Yetiştirme Kampı(.NET)", "Senior Yazılım Geliştirici Yetiştirme Kampımızın takip, döküman ve duyurularını buradan yapacağız.", 2, 0, 0, instructor1);
		
		CourseManager coursemanager = new CourseManager(new JdbcCourseDao(), loggers);
		coursemanager.add(course1);
		coursemanager.add(course2);

		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Proglamlama");
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(course1);
		courses.add(course2);
		category1.setCourses(courses);
		Category category2 = new Category();
		category2.setName("Tasarım");
		
		CategoryManager categorymanager = new CategoryManager(new JdbcCategoryDao(), loggers);
		categorymanager.add(category1);
		categorymanager.add(category2);
	}

}
