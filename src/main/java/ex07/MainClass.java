package ex07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ex02.MemberDAO;

public class MainClass {

	public static void main(String[] args) {
		
		//java 설정으로 만들어진 bean 파일은 
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		System.out.println(ctx.getBeanDefinitionCount()); //내부적으로 필요한 빈들 포함 개수
		
		MemberDAO dao = ctx.getBean("dao", MemberDAO.class);
		
		System.out.println(dao.getDatabaseDev().getUrl());
		System.out.println(dao.getDatabaseDev().getUid());
		System.out.println(dao.getDatabaseDev().getUpw());
	}
}
