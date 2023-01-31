package ex02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("application-context.xml"); //들어가 있는 xml파일명
		
		//생성자를 통한 주입확인
//		Hotel hotel = ctx.getBean(Hotel.class); //클래스이름 적기
//		hotel.getChef().cooking();
		
		//세터를 통한 주입확인
		MemberDAO dao = ctx.getBean("dao", MemberDAO.class);
		DatabaseDev dev = dao.getDatabaseDev();
		System.out.println(dev.getUid());
		System.out.println(dev.getUrl());
		System.out.println(dev.getUpw());
		
	}
}
