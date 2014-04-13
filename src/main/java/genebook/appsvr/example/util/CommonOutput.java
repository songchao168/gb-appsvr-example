package genebook.appsvr.example.util;


public class CommonOutput<T> {
	
	/**
	 * 1 is success , other code is faile
	 */
	private String success;
	private String msg;
	private T data;
	
	
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
	
}
