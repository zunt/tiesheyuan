package cn.xjtu.zun.tiesheyuan;

import cn.xjtu.zun.tiesheyuan.utils.MailClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.thymeleaf.TemplateEngine;

//@Runwith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = TiesheyuanApplication.class)
public class MailTest {
    @Autowired
    private MailClient mailClient;

//    @Test
//    public void testTextMail() {
//        mailClient.sendMail("847702059@qq.com", "Test", "welcome.");
//    }

    @Autowired
    private TemplateEngine templateEngine;

//    @Test
//    public void testHtmlMail(){
//        Context context = new Context();
//        context.setVariable("username", "testname");
//        String content = templateEngine.process("/mail/mail", context);
//        mailClient.sendMail("847702059@qq.com","testhtmlmail", content);
//    }
}
