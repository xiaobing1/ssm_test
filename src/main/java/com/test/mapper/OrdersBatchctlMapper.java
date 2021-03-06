package com.test.mapper;

import com.test.domain.OrdersBatchctl;
import com.test.domain.OrdersBatchctlExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdersBatchctlMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders_batchctl
     *
     * @mbg.generated Fri Mar 09 15:36:28 CST 2018
     */
    long countByExample(OrdersBatchctlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders_batchctl
     *
     * @mbg.generated Fri Mar 09 15:36:28 CST 2018
     */
    int deleteByExample(OrdersBatchctlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders_batchctl
     *
     * @mbg.generated Fri Mar 09 15:36:28 CST 2018
     */
    int deleteByPrimaryKey(String orderserno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders_batchctl
     *
     * @mbg.generated Fri Mar 09 15:36:28 CST 2018
     */
    int insert(OrdersBatchctl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders_batchctl
     *
     * @mbg.generated Fri Mar 09 15:36:28 CST 2018
     */
    int insertSelective(OrdersBatchctl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders_batchctl
     *
     * @mbg.generated Fri Mar 09 15:36:28 CST 2018
     */
    List<OrdersBatchctl> selectByExample(OrdersBatchctlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders_batchctl
     *
     * @mbg.generated Fri Mar 09 15:36:28 CST 2018
     */
    OrdersBatchctl selectByPrimaryKey(String orderserno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders_batchctl
     *
     * @mbg.generated Fri Mar 09 15:36:28 CST 2018
     */
    int updateByExampleSelective(@Param("record") OrdersBatchctl record, @Param("example") OrdersBatchctlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders_batchctl
     *
     * @mbg.generated Fri Mar 09 15:36:28 CST 2018
     */
    int updateByExample(@Param("record") OrdersBatchctl record, @Param("example") OrdersBatchctlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders_batchctl
     *
     * @mbg.generated Fri Mar 09 15:36:28 CST 2018
     */
    int updateByPrimaryKeySelective(OrdersBatchctl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders_batchctl
     *
     * @mbg.generated Fri Mar 09 15:36:28 CST 2018
     */
    int updateByPrimaryKey(OrdersBatchctl record);
}