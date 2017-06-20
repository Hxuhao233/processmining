package processmining;


import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.processmining.entity.RawLog;
import com.processmining.service.IRawLogService;



public class LogDaoTest {
	public static void main(String[] args){
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/spring-*.xml");

		IRawLogService rawLogSerivce = (IRawLogService) ac.getBean("rawLogServiceImpl");

		int pageNum = 1;
		int pageSize = 10;

		PageInfo<RawLog> logListWithPage = rawLogSerivce.listAll(pageNum,pageSize);
		for(RawLog record : logListWithPage.getList()){
			System.out.println(record.getName());
		}
		ac.close();
	}
}
