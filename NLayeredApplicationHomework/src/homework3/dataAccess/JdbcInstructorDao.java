package homework3.dataAccess;

import homework3.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Added instructor to database with Jdbc");
	}

}
