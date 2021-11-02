package com.nicksui.wiki.service;

import com.nicksui.wiki.domain.Demo;
import com.nicksui.wiki.domain.Test;
import com.nicksui.wiki.mapper.DemoMapper;
import com.nicksui.wiki.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    //@Autowired 在属性上用autowired可以代替构造函数注入。
    private final DemoMapper demoMapper;

    //这里构造函数注入是官方推荐的
    @Autowired
    public TestService(DemoMapper demoMapper){
        this.demoMapper=demoMapper;
    }

    public Demo list(){
        Integer idInt= 1;
        return  demoMapper.selectByPrimaryKey(idInt.longValue());
    }
}
