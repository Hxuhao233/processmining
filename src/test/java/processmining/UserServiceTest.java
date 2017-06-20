package processmining;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.processmining.entity.User;
import com.processmining.service.IManagerService;
import com.processmining.service.IUserService;

public class UserServiceTest {
      @Test
      public void t(){
    	  ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:/spring/spring-*.xml");
    	  /*for(String x:ctx.getBeanDefinitionNames()){
    		  System.out.println(x);
    	  }*/
    	  //System.out.print(ctx.getBean("userServiceImpl")==null);
    	 IUserService us=(IUserService) ctx.getBean("userServiceImpl");
    	 //System.out.print(us.listAllUsers().size());
    	 User u=new User();
    	 u.setEmail("xyntmssb@sb.com");
    	 u.setNickname("hahahahahgggkjhk");
    	 u.setPassword("1234444");
         u.setActivated(true);
         u.setType(1);
         us.register(u);
      }
}
