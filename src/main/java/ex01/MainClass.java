package ex01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("application-context.xml");
		
//		SpringTest bean = ctx.getBean(SpringTest.class);
//		bean.test();
		
		SpringTest bean = (SpringTest)ctx.getBean("test");
//		bean.test();
		
		SpringTest bean2 = (SpringTest)ctx.getBean("test");
		
		System.out.println(bean == bean2);
		//true ▶ singleton
		//false ▶ prototype
	}
}
