package ex.spring.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ex.spring.practice.service.TestService;

public class springTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/META-INF/application-context.xml");

		//
		TestService service = (TestService) context
				.getBean("testService");

		service.lessons();
		
		((AbstractApplicationContext)context).close();

	}

}
