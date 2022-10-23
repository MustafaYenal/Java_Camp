package kodlamaio.Northwind.core.utilities.results;

public class ErrorResult extends Result {
	public ErrorResult() {
		super(false);
	}
	ErrorResult(String message){
		super(false,message);
	}
}
