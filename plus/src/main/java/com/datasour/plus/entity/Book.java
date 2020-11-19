package com.datasour.plus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author Macky
 * @Title class Book
 * @Description: 书籍是实体类
 * @date 2019/7/13 15:23
 */
@Data
@Accessors(chain = true)
@TableName("book")
public class Book extends Model<Book> implements Serializable {
    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("count")
    private int count;
}
