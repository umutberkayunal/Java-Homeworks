package homework3.dataAccess;

import homework3.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Added course to database with Hibernate");
		
	}

}
