package com.test.domain;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-03-08
 */
public class Category {
    /**
     * 类别编码
     */
    private Integer categoryid;

    /**
     * 类别名称
     */
    private String categoryname;

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname == null ? null : categoryname.trim();
    }
}