package genebook.appsvr.example.util;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;

public class OutputUtil<T> {
	
	@SuppressWarnings("unchecked")
	public static <T> CommonOutput<T> getOutputData(Class<T> t, String output) {
		CommonOutput<T> cip = JSON.parseObject(output, CommonOutput.class);
		cip.setData(JSON.parseObject(cip.getData().toString(), t));
		return cip;
	}

	public static <T> String formatOutputData(String success, String msg,
			T data, String format) {
		CommonOutput<T> outPut = new CommonOutput<T>();
		outPut.setSuccess(success);
		outPut.setMsg(msg);
		outPut.setData(data);
		if (StringUtils.isEmpty(format) || format.equalsIgnoreCase("json")) {
			return JSON.toJSONString(outPut);
		} else {
			//todo return xml();
			return null;
		}

	}
}
