package com.datasour.plus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.datasour.plus.entity.Book;
import com.datasour.plus.mapper.BookMapper;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PlusApplicationTests {

    @Autowired
    BookMapper bookMapper;

    @Test
    void selectOne() {
        Book to = bookMapper.selectOne(Wrappers.<Book>lambdaQuery()
                .eq(Book::getName, "小红")
                .eq(Book::getCount, 3));
        System.out.println(to.getName() + "///////////////////////////");
    }

    @Test
    void selectById() {
        Book to1 = bookMapper.selectById(4);
        System.out.println(to1.getName() + "///////////////////////////");
    }

    @Test
    void selectList1() {
        List<Book> to2  = bookMapper.selectList(Wrappers.<Book>lambdaQuery().eq(Book::getName, "小米"));
        to2.forEach(e -> System.out.println(e.getName() + "//////////"));
    }

    @Test
    void selectList2() {
        List<Book> to3 = bookMapper.selectList(new QueryWrapper<Book>().lambda().in(Book::getName, "小米", "小黄"));
        to3.forEach(e -> System.out.println(e.getName() + "//////////---------"));
    }

    @Test
    void selectPage() {
        Page<Book> page = new Page<Book>(1, 2,false);
        List<Book> to4 = bookMapper.selectPage(page, Wrappers.<Book>lambdaQuery().eq(Book::getName, "小米")).getRecords();
        to4.forEach(e -> System.out.println(e.getName() + "//////////********"));
    }

    @Test
    void insert() {
        Book a = new Book().setId(5).setCount(5).setName("小秋");
        bookMapper.insert(a);
    }
    @Test
    void zdimapper(){
        val query = new QueryWrapper<Book>()
//                .or(true)
//                .notLike("user_nickname", "notvalue")
//                .like("hhh", "ddd")
//                .isNotNull("n1,n2").isNull("n3")
//                .groupBy("x1").groupBy("x2,x3")
//                .having("x1=11").having("x3=433")
//                .orderBy(false,false,"dd").orderBy(true,true,"d1,d2")
//                   .setSqlSelect("sum(quantity)")
//                .isNull("order_id")
//                .eq("user_id", 1)
//                .eq("type", 1)
//                .in("status", new Integer[]{0, 1})
//                .eq("product_id", 1)
//                .between("created_time", startDate, currentDate)
//                .eq("weal", 1)
                .eq("count", "5");
        List<Book> bookList = bookMapper.selectListByBook(query);
        bookList.forEach( System.out::print);
    }
}
