package com.datasour.plus.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.datasour.plus.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Macky
 * @Title class BookMapper
 * @Description: TODO
 * @date 2019/7/12 20:46
 */
public interface BookMapper extends BaseMapper<Book> {
    List<Book> selectListByBook(@Param("ew") Wrapper<Book> wrapper);

}
