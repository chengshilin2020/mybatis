package com.datasouce.jpa.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 文档 帮助
 *
 * @author wm
 * @version 0.0.1
 * @since 2015年11月3日 上午11:53:06
 */
@Data
@Entity
@Table(name = "book", schema = "spring_boot")
public class Book implements Serializable {

    private static final long serialVersionUID = 4332725464384683869L;

    @Id
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "count")
    private Integer count;
}
