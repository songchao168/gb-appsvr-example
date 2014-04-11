package genebook.websvr.example.util;

public class CommonInput<T> {
	
	/**
	 * json , xml
	 */
	private String output;
	private String customerId;
	
	private T data;

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
