package spring5_mvc_study.spring;

@SuppressWarnings("serial")
public class DuplicateMemberException extends RuntimeException {
	
	public DuplicateMemberException(String message) {
		super(message);
	}
}
