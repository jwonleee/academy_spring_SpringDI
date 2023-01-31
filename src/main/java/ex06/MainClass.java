package ex06;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("autowired-context.xml");
		
		Controller c = ctx.getBean("controller", Controller.class);
		
		c.hello();

	}
}
