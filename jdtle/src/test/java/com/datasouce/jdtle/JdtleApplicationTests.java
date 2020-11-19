package com.datasouce.jdtle;

import com.datasouce.jdtle.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

@SpringBootTest
class JdtleApplicationTests {
    private ApplicationContext ctx = null;
    private JdbcTemplate jdbcTemplate = null;

    {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
    }

    @Test
    void contextLoads() {
        String sql = "SELECT id,name,count FROM Book WHERE id = ?";
        RowMapper<Book> rowMapper = new BeanPropertyRowMapper<>(Book.class);
        // 在将数据装入对象时需要调用set方法。
        Book user = jdbcTemplate.queryForObject(sql, rowMapper, 2);
        System.out.println(user.getName());
    }

}
