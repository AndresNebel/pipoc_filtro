package filter;

import static java.lang.System.getenv;


import com.jayway.jsonpath.JsonPath;

public class Filter {
	public static String filter(String json) {
		String filter =  getenv("FILTER_QUERY");
		System.out.println("FILTER:"+filter);
		System.out.println("JSON:"+json);
		return JsonPath.parse(json).read(filter);
	}
}
