package processmining;

<<<<<<< HEAD
import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

=======

import java.io.File;
import java.io.FileInputStream;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.processmining.entity.RawLog;
import com.processmining.service.IRawLogService;
>>>>>>> 0f9d0d729dd590001da30d8de7cf2e04d5337cab
import com.processmining.util.fs.HDFSOperator;


public class HDFSTest {

	public static void main(String[] args) throws Exception{
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-*.xml");
		IRawLogService logService = (IRawLogService) ac.getBean("rawLogServiceImpl");
		for(int i=1;i<100;i++){
			FileInputStream input = new FileInputStream(new File("F:\\log examples\\rawlog.txt"));
			RawLog record = new RawLog();
			record.setCreatorid(1);
			record.setFormat("txt");
			record.setIsshared(true);
			record.setName("rawlog"+i+".txt");
			logService.uploadLog(input, record);
			Thread.sleep(1000);
			input.close();
		}
		System.out.println("fin");
		ac.close();
	}
}
