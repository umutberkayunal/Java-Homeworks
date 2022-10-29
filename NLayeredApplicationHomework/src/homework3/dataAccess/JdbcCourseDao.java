package homework3.dataAccess;

import homework3.entities.Course;

public class JdbcCourseDao implements CourseDao{
	
	@Override
	public void add(Course course) {
		System.out.println("added course to database with Jdbc");
	}
}
