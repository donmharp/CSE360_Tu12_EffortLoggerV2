package application;

// Console Manager class by Jaylene Nunez

	public class ConsoleManager {
	    private Database database;

	    // Constructor
	    public ConsoleManager(Database d) {
	        database = d;
	    }

	    // Create a new effort log in the database
	    public boolean CreateNewEffortLog(int hours, int minutes) {
	        EffortLog newLog = new EffortLog(hours, minutes);
	        return database.AddLog(newLog);
	    }

	    // Overloaded method call for testing purposes
	    public boolean CreateNewEffortLog(int hours, int minutes, double weight, int bias) {
	        EffortLog newLog = new EffortLog(hours, minutes, weight, bias);
	        return database.AddLog(newLog);
	    }

	    // Clear all effort logs in the database
	    public void ClearEffortLogs() {
	        database.ClearEffortLogs();
	    }
	}
