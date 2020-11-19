package com.fishpro.jjpa.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name="book", schema = "spring_boot")
public class Book implements Serializable {
    private static final long serialVersionUID = 4332725464384683869L;

    @Id
    private Integer id;
    @Column(name="name",length = 20)
    private String name;
    @Column(name="count",length = 20)
    private Integer count;
}
