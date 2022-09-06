package Day42_Abstraction;

public class InvalidSelectionException extends Exception { // being a sub class of Exception class makes this a checked exception

    public InvalidSelectionException() {
        super("Selection can only be 1, 2, or 3");
    }
}
