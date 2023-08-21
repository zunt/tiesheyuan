package cn.xjtu.zun.tiesheyuan;

import ch.qos.logback.core.net.SyslogOutputStream;
import cn.xjtu.zun.tiesheyuan.mapper.LoginTicketMapper;
import cn.xjtu.zun.tiesheyuan.pojo.LoginTicket;
import cn.xjtu.zun.tiesheyuan.utils.MailClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.thymeleaf.TemplateEngine;

import java.util.Date;

//@Runwith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = TiesheyuanApplication.class)
public class MapperTest {

    @Autowired
    private LoginTicketMapper loginTicketMapper;

    @Test
    public void testInsertTicket(){
        LoginTicket ticket =  new LoginTicket();
        ticket.setUserId(1L);
        ticket.setTicket("testTicket");
        ticket.setStatus(0);
        ticket.setExpired(new Date(System.currentTimeMillis() + 1000 * 60 * 10));

        System.out.println(loginTicketMapper.insert(ticket));
        System.out.println(ticket.getId());
    }

    @Test
    public void testSelectTicket(){
        LoginTicket ticket =  loginTicketMapper.selectByTicket("testTicket");
        System.out.println("expired At:" + ticket.getExpired());
        ticket.setStatus(1);
        loginTicketMapper.updateByPrimaryKey(ticket);
    }

    @Test
    public void testUpdateTicket(){
        loginTicketMapper.updateStatusByticket("testTicket", 0);
    }
}
