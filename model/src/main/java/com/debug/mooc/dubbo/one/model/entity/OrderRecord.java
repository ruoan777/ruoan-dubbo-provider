package com.debug.mooc.dubbo.one.model.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author ruoan
 */
@Data
public class OrderRecord {

    private Integer id;

    private Integer itemId;

    private Integer total;

    private String customerName;

    private Date orderTime;

    private Integer isActive;

    private Date updateTime;

}