package genebook.websvr.example.util;



import com.alibaba.fastjson.JSON;

public class RequestInput<T>{
	
	@SuppressWarnings("unchecked")
	public CommonInput<T> getInput(Class<T> t,String input){
		CommonInput<T> cip = (CommonInput<T>) JSON.parseObject(input,CommonInput.class);
		cip.getCustomerId();
		cip.setData(JSON.parseObject(cip.getData().toString(), t));
		return cip;
	}
}
