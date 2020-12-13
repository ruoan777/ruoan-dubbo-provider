package com.debug.mooc.dubbo.one.server.service.dubbo;

import com.debug.mooc.dubbo.one.model.entity.ItemInfo;
import com.debug.mooc.dubbo.one.model.mapper.ItemInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author: ruoan
 * Date: 2020/12/11 3:57 下午
 * @Description:
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class DubboItemServiceImplTest {

    @Autowired
    private ItemInfoMapper itemInfoMapper;

    @Test
    public void testListItems() {
        List<ItemInfo> itemInfos = itemInfoMapper.selectAll();
    }
}