package com.pujun.webcrawler.dao;

import com.pujun.webcrawler.entity.Hauses;
import com.pujun.webcrawler.entity.HausesKey;

public interface HausesMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hauses
	 * @mbg.generated  Sun Apr 16 17:07:34 CST 2017
	 */
	int insert(Hauses record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hauses
	 * @mbg.generated  Sun Apr 16 17:07:34 CST 2017
	 */
	int insertSelective(Hauses record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hauses
	 * @mbg.generated  Sun Apr 16 17:07:34 CST 2017
	 */
	Hauses selectByPrimaryKey(HausesKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hauses
	 * @mbg.generated  Sun Apr 16 17:07:34 CST 2017
	 */
	int updateByPrimaryKeySelective(Hauses record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table hauses
	 * @mbg.generated  Sun Apr 16 17:07:34 CST 2017
	 */
	int updateByPrimaryKey(Hauses record);
}