package com.nicksui.wiki.mapper;

import com.nicksui.wiki.domain.Test;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TestMapper {
    public List<Test> list();
}
