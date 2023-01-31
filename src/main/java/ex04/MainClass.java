package ex04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		//Car, Airplane 빈을 생성하고, 의존성 주입
		//각 객체 안에 있는 배터리를 자바클래스에서 출력.
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("toy-context.xml");
		
//		Battery1 b1 = ctx.getBean(Battery1.class);
//		b1.energy();
//		
//		Battery2 b2 = ctx.getBean(Battery2.class);
//		b2.energy();
		
		Airplane air = ctx.getBean("airplane", Airplane.class);
		IBattery a = air.getBattery();
		a.energy();
		
		Car car = ctx.getBean("car", Car.class);
		IBattery b = car.getBattery();
		b.energy();
		
	}
}
