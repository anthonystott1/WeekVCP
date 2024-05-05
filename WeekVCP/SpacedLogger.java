package WeekVCP;

public class SpacedLogger implements Logger {
    // Step 5: Implement the SpacedLogger methods
    @Override
    public void log(String message) {
        StringBuilder spacedMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            spacedMessage.append(message.charAt(i));
            if (i != message.length() - 1) {
                spacedMessage.append(" ");
            }
        }
        System.out.println(spacedMessage.toString());
    }

    @Override
    public void error(String message) {
        StringBuilder spacedErrorMessage = new StringBuilder("ERROR: ");
        for (int i = 0; i < message.length(); i++) {
            spacedErrorMessage.append(message.charAt(i));
            if (i != message.length() - 1) {
                spacedErrorMessage.append(" ");
            }
        }
        System.out.println(spacedErrorMessage.toString());
    }
}


