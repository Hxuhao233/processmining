package processmining;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class LogDaoTest {
	public static void main(String[] args){
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/spring-*.xml");
		//IOriginalLogService oLogSerivce = (IOriginalLogService) ac.getBean("originalLogServiceImpl");
		String[] ret = ac.getBeanDefinitionNames();
		for(String item : ret){
			if(item.contains("Controller")||(item.contains("Service"))||(item.contains("Mapper")))
					System.out.println(item);
		}
	}
}
