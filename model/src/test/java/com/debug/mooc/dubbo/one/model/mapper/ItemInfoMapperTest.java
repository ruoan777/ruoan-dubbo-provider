package com.debug.mooc.dubbo.one.model.mapper;

import com.debug.mooc.dubbo.one.model.entity.ItemInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: ruoan
 * Date: 2020/12/11 3:47 下午
 * @Description:
 */
public class ItemInfoMapperTest {

    @Autowired
    private ItemInfoMapper mapper;

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void selectAll() {
        List<ItemInfo> itemInfos = mapper.selectAll();
        for (ItemInfo itemInfo : itemInfos) {
            System.out.println(itemInfo);
        }
    }

    @Test
    public void selectAllByParams() {
    }
}