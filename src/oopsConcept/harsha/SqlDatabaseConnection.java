package oopsConcept.harsha;

public class SqlDatabaseConnection extends AbstractionPractice{

	
	@Override
	public void getUserName() {
		System.out.println("Get the SQL DB username");
	}

	@Override
	public void getPassword() {
		System.out.println("Get the SQL DB Password");
	}

	@Override
	public void connectDatabase(String dbName, String dbUserName, String dbPassword) {
		System.out.println("Enter SQL dbName :"+dbName);
		System.out.println("Added SQL db details with specific IP");
		System.out.println("Enter SQL dbUsername :"+dbUserName);
		System.out.println("Enter SQL dbPassword :"+dbPassword);
	}
	
	@Override
	public void getSchema() {
		System.out.println("Get the SQL DB Schema");
		
	}



}
