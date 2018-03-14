package com.test.service.impl;

import com.test.domain.Category;
import com.test.domain.CategoryExample;
import com.test.mapper.CategoryMapper;
import com.test.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiaobin.wang
 * @date 2018/3/9
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public List<Category> findAll() {
        List<Category> categories = categoryMapper.selectByExample(new CategoryExample());
        System.out.println(categories);
        return categories;
    }
}
