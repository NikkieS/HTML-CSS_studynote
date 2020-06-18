package projectVer5;

public class OptionInputException extends Exception {
	public OptionInputException() {
		super("Your choice is not in the option.\nReturning to menu.");
	}
}
