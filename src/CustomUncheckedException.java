// Extending RuntimeException makes this an unchecked exception
 class InvalidConfigException extends RuntimeException {

    // Pass the error message to the parent RuntimeException class
    public InvalidConfigException(String message) {
        super(message);
    }
}

 class AppConfig {

    public void loadApiKey(String key) {
        if (key == null || key.trim().isEmpty()) {
            // Throws immediately without forcing compiler checks upstream
            throw new InvalidConfigException("API Key cannot be null or empty in settings.");
        }
        System.out.println("API Key loaded successfully!");
    }
}


public class CustomUncheckedException {
    public static void main(String[] args) {
        AppConfig config = new AppConfig();

        // No try-catch block required by the compiler
        // However, passing null will crash the thread if left uncaught
        config.loadApiKey(null);
    }
}
