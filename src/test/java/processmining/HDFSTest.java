package processmining;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.processmining.util.fs.HDFSOperator;


public class HDFSTest {
	public static void main(String[] args) throws IllegalArgumentException, IOException{
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-hdfs.xml");
		HDFSOperator hdfs = (HDFSOperator) ac.getBean("hdfsUtil");
	

		System.out.println(hdfs.exists("/processmining/eventlog"));
		/*
		System.out.println(hdfs.createDirectory("/pm/EventLog"));
		System.out.println(hdfs.createDirectory("/pm/StandardizedLog"));
		System.out.println(hdfs.createDirectory("/pm/OriginalLog"));
		*/
		ac.close();
	}
}
