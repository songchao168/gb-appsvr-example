package genebook.websvr.example.util;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;

public class ResponseOutPut<T> {
	
	private final static String FORMAT_JSON = "json";
	private final static String FORMAT_XML = "xml";
	private CommonOutPut<T> outPut;
	private String format;
	
	
	public ResponseOutPut(String success, String msg, T data, String format){
		outPut = new CommonOutPut<T>();
		outPut.setSuccess(success);
		outPut.setMsg(msg);
		outPut.setData(data);
		this.format = format;
	}
	
	public  String response(){
		
		if(StringUtils.isEmpty(format)||format.equalsIgnoreCase(FORMAT_JSON)){
			return json();
		}else{
			return xml();
		}
		
	}
	
	private  String json(){
		
		return JSON.toJSONString(outPut);
	}
	
	private  String xml(){
		return null;
	}
}
