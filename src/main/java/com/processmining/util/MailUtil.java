package com.processmining.util;

import java.util.Date;
import java.util.Properties;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.processmining.config.PMConfig;

public class MailUtil {
	public static String myEmailAccount = "reao123@163.com";
    public static String myEmailPassword = "1a2s3d4f";
    public static String myEmailSMTPHost = "smtp.163.com";
    public static String receiveMailAccount = "daiz1996@qq.com";
    
    public static void main(String[] args) throws Exception {
       
        Properties props = new Properties();                    
        props.setProperty("mail.transport.protocol", "smtp");   
        props.setProperty("mail.smtp.host", myEmailSMTPHost);   
        props.setProperty("mail.smtp.auth", "true");          

        Session session = Session.getDefaultInstance(props);
        session.setDebug(true);                                 

       
        MimeMessage message = createMimeMessage(session, myEmailAccount, receiveMailAccount,0);

      
        Transport transport = session.getTransport();
        transport.connect(myEmailAccount, myEmailPassword);
        transport.sendMessage(message, message.getAllRecipients());
        Thread.sleep(1000);
        transport.close();
    }
    public static MimeMessage createMimeMessage(Session session, String sendMail, String receiveMail,Integer userid) throws Exception {

        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(sendMail, "K2流程挖掘平台", "UTF-8"));
        message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(receiveMail, "XX�û�", "UTF-8"));
        message.setSubject("激活链接", "UTF-8");
        String content=String.valueOf(userid)+String.valueOf(System.currentTimeMillis())+PMConfig.SALT;
        
        message.setContent("有没有想兼职想刷单的宝宝呢～沐鑫团在这里招人啦！无需垫付和流动资金，零风险，完成任务退会费！另外还有福利单相送哦～宝妈们学生们来咨询我哦～沐鑫团欢迎你的加入！是骗子***！会费488送300福利单！无需垫付！手机就可以！有问题私聊我就好，如果我是骗子天打雷劈不得好死！我也是个学生还好我足够幸运我身边也有人被骗但是还好我足够幸运", "text/html;charset=UTF-8");

        // 6. ���÷���ʱ��
        message.setSentDate(new Date());

        // 7. ��������
        message.saveChanges();

        return message;
    }
}
