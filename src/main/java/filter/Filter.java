package filter;

import static java.lang.System.getenv;

import java.util.List;

import com.jayway.jsonpath.JsonPath;

public class Filter {
	public static String filter(String json) {
		String filter =  getenv("FILTER_QUERY");
		System.out.println("FILTERING:"+filter);
		System.out.println("JSON:"+json);
		List<String> list = JsonPath.parse(json).read(filter);
		return list.toString();		
	}
}
