package processmining;

import java.io.InputStream;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.processmining.util.fs.HDFSOperator;

public class RawLog2NormLogTest {
	public static void main(String[] args) throws Exception{
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-hdfs.xml");
		HDFSOperator hdfs = (HDFSOperator) ac.getBean("hdfsUtil");
		InputStream input = hdfs.downloadFile("/processmining/rawlog/e05f52d9-7975-45fe-901e-6865ff8b6014");
		
		ac.close();
	}
}
