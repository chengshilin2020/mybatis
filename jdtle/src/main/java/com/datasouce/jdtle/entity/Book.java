package com.datasouce.jdtle.entity;


import lombok.Data;
import java.io.Serializable;

/**
 * 文档 帮助
 *
 * @author wm
 * @version 0.0.1
 * @since 2015年11月3日 上午11:53:06
 */
@Data
public class Book implements Serializable {

    private static final long serialVersionUID = 4332725464384683869L;

    private int id;
    private String name;
    private int count;
}
