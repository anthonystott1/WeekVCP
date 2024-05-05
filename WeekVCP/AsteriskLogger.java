package WeekVCP;

public class AsteriskLogger implements Logger {
		    // Step 4a: Implement the AsteriskLogger methods
		    @Override
		    public void log(String message) {
		        System.out.println("***" + message + "***");
		    }

		    @Override
		    public void error(String message) {
		        System.out.println("****************");
		        System.out.println("***Error: " + message + "***");
		        System.out.println("****************");
		   
		

	}

}
