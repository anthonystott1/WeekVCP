package WeekVCP;

public class App {

	public static void main(String[] args) {
		  // Instantiate an instance of each of the logger classes
        Logger asteriskLogger = (Logger) new AsteriskLogger();
        Logger spacedLogger = (Logger) new SpacedLogger();

        // Test both methods on both instances
        asteriskLogger.log("Hello");
        asteriskLogger.error("Hello");
        spacedLogger.log("Hello");
        spacedLogger.error("Hello");
    }

	}


