package com.test.domain;

public class Category {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.categoryid
     *
     * @mbg.generated Fri Mar 09 15:36:28 CST 2018
     */
    private Integer categoryid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.categoryname
     *
     * @mbg.generated Fri Mar 09 15:36:28 CST 2018
     */
    private String categoryname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.categoryid
     *
     * @return the value of category.categoryid
     *
     * @mbg.generated Fri Mar 09 15:36:28 CST 2018
     */
    public Integer getCategoryid() {
        return categoryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.categoryid
     *
     * @param categoryid the value for category.categoryid
     *
     * @mbg.generated Fri Mar 09 15:36:28 CST 2018
     */
    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.categoryname
     *
     * @return the value of category.categoryname
     *
     * @mbg.generated Fri Mar 09 15:36:28 CST 2018
     */
    public String getCategoryname() {
        return categoryname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.categoryname
     *
     * @param categoryname the value for category.categoryname
     *
     * @mbg.generated Fri Mar 09 15:36:28 CST 2018
     */
    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname == null ? null : categoryname.trim();
    }
}