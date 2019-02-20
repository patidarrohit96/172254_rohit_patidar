package lambdaassignment7;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class TestMap {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("rohit","indore");
		map.put("sai","bhopal");
		map.put("ankit","bhopal");
		map.put("abhinay","himachal");
		
		StringBuilder sb=new StringBuilder();
		Set<Map.Entry<String, String>> s=map.entrySet();
	
		
		for(Map.Entry<String,String> x:s) {
			sb=sb.append(x.getKey()+""+x.getValue());
		}
		
		System.out.println(sb);
		
	}


}
