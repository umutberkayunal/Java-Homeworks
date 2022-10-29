package homework3.business;

import java.util.ArrayList;

import homework3.core.logging.Logger;
import homework3.dataAccess.CourseDao;
import homework3.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private ArrayList<String> courses = new ArrayList<String>();
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if(course.getPrice() < 0.0) {
			throw new Exception("Course price must be greater than 0.");
		}
		if(courses.contains(course.getName())) {
			throw new Exception("Course name already exists!!!!");
		}
		courseDao.add(course);
		courses.add(course.getName());
		for(Logger logger : loggers) {
			logger.log(course.getName());
		}
	}
}
