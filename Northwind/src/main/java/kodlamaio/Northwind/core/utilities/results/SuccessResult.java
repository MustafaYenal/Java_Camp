package kodlamaio.Northwind.core.utilities.results;

public class SuccessResult extends Result {
	public SuccessResult() {
	   super(true);
	}
	public SuccessResult(String message) {
		super(true,message);
	}
	
	public SuccessResult(boolean success, String message) {
		super(success, message);
		// TODO Auto-generated constructor stub
	}

}
