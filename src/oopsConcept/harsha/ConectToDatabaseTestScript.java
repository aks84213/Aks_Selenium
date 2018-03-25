package oopsConcept.harsha;

public class ConectToDatabaseTestScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputDbName = "sql";
		String inputDbUserName = "harsha";
		String inputDbPassword = "1234566";
		
		dbConnectionDetails(inputDbName, inputDbUserName, inputDbPassword);
		

	}
	
	public static void dbConnectionDetails(String dbName, String dbUserName, String dbPassword) {
		
		if(dbName.equalsIgnoreCase("SQL")) {
			connectToSqlDb(dbName, dbUserName, dbPassword);
		}else if(dbName.equalsIgnoreCase("Oracle")) {
			connectToOracleDb(dbName, dbUserName, dbPassword);
		}else if(dbName.equalsIgnoreCase("Mongo")) {
			connectToMongoDb(dbName, dbUserName, dbPassword);
		}else {
			System.out.println("Database is not connected since its invalid");
		}
		
	}
	

	public static void connectToSqlDb(String dbName, String dbUserName, String dbPassword) {
		
		SqlDatabaseConnection sqldb = new SqlDatabaseConnection();
		sqldb.getUserName();
		sqldb.connectDatabase(dbName, dbUserName, dbPassword);
	}
	
	public static void connectToOracleDb(String dbName, String dbUserName, String dbPassword) {
		
		OracleDabataBaseConnection oralcedb = new OracleDabataBaseConnection();
		oralcedb.getUserName();
		oralcedb.getPassword();
		oralcedb.connectDatabase(dbName, dbUserName, dbPassword);
	}

	public static void connectToMongoDb(String dbName, String dbUserName, String dbPassword) {
	
		MongoDatabaseConnection mongodb = new MongoDatabaseConnection();
		mongodb.getUserName();
		mongodb.getPassword();
		mongodb.getSchema();
		mongodb.connectDatabase(dbName, dbUserName, dbPassword);
}
}
