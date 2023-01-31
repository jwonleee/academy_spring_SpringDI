package ex03;

import java.util.Map;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("collection-context.xml");
		
		Customer cus = ctx.getBean("customer", Customer.class);
		Map<String, Object> maps = cus.getMaps();
		System.out.println(maps.toString());
	}
}
