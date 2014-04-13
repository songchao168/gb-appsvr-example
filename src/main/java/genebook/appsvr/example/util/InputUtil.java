package genebook.appsvr.example.util;



import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;

public class InputUtil {

	@SuppressWarnings("unchecked")
	public static <T> CommonInput<T> getInputData(Class<T> t, String input) {
		CommonInput<T> cip = JSON.parseObject(input, CommonInput.class);
		cip.setData(JSON.parseObject(cip.getData().toString(), t));
		return cip;
	}

	public static <T> String formatInputData(String format, String customerId,
			T data) {
		CommonInput<T> cip = new CommonInput<T>();
		cip.setCustomerId(customerId);
		cip.setOutput(format);
		cip.setData(data);
		if (StringUtils.isEmpty(format) || format.equalsIgnoreCase("json")) {
			return JSON.toJSONString(cip);
		} else {
			//todo return xml();
			return null;
		}
	}
	

	

}
