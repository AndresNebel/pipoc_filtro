package filter;

import static java.lang.System.getenv;

import java.util.List;

import com.jayway.jsonpath.JsonPath;

public class Filter {
	public static String filter(String json) {
		String filter =  getenv("FILTER_QUERY");
		System.out.println("FILTER:"+filter);
		System.out.println("JSON:"+json);
		String result = "";
		try {
			result = JsonPath.parse(json).read(filter);
		}
		catch (Exception e) {
			System.out.println("**************** KAPOW! ******************");
			List<String> list = JsonPath.parse(json).read(filter);
			result = list.toString();
		}
	
		return result;
	}
}
