package com.pujun.webcrawler.entity;

import java.util.Date;

public class Proxy extends ProxyKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proxy.type
     *
     * @mbg.generated Sun Apr 16 17:07:34 CST 2017
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proxy.successcount
     *
     * @mbg.generated Sun Apr 16 17:07:34 CST 2017
     */
    private Integer successcount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proxy.creattime
     *
     * @mbg.generated Sun Apr 16 17:07:34 CST 2017
     */
    private Date creattime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proxy.updatetime
     *
     * @mbg.generated Sun Apr 16 17:07:34 CST 2017
     */
    private Date updatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proxy.type
     *
     * @return the value of proxy.type
     *
     * @mbg.generated Sun Apr 16 17:07:34 CST 2017
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proxy.type
     *
     * @param type the value for proxy.type
     *
     * @mbg.generated Sun Apr 16 17:07:34 CST 2017
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proxy.successcount
     *
     * @return the value of proxy.successcount
     *
     * @mbg.generated Sun Apr 16 17:07:34 CST 2017
     */
    public Integer getSuccesscount() {
        return successcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proxy.successcount
     *
     * @param successcount the value for proxy.successcount
     *
     * @mbg.generated Sun Apr 16 17:07:34 CST 2017
     */
    public void setSuccesscount(Integer successcount) {
        this.successcount = successcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proxy.creattime
     *
     * @return the value of proxy.creattime
     *
     * @mbg.generated Sun Apr 16 17:07:34 CST 2017
     */
    public Date getCreattime() {
        return creattime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proxy.creattime
     *
     * @param creattime the value for proxy.creattime
     *
     * @mbg.generated Sun Apr 16 17:07:34 CST 2017
     */
    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proxy.updatetime
     *
     * @return the value of proxy.updatetime
     *
     * @mbg.generated Sun Apr 16 17:07:34 CST 2017
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proxy.updatetime
     *
     * @param updatetime the value for proxy.updatetime
     *
     * @mbg.generated Sun Apr 16 17:07:34 CST 2017
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}