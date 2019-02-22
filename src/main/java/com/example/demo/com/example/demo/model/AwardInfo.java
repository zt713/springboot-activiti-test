package com.example.demo.model;

import java.util.Date;

/**
 * 鎻忚堪:t_award_info琛ㄧ殑瀹炰綋绫�
 * @version
 * @author:  pp
 * @鍒涘缓鏃堕棿: 2018-08-27
 */
public class AwardInfo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 奖品名称
     */
    private String awardName;

    /**
     * 描述
     */
    private String description;

    /**
     * 金额
     */
    private Integer amount;

    /**
     * 库存
     */
    private Integer remain;

    /**
     * 状态
     */
    private Byte status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 主键ID
     * @return主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键ID
     * @param id 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 奖品名称
     * @return奖品名称
     */
    public String getAwardName() {
        return awardName;
    }

    /**
     * 奖品名称
     * @param awardName 奖品名称
     */
    public void setAwardName(String awardName) {
        this.awardName = awardName == null ? null : awardName.trim();
    }

    /**
     * 描述
     * @return描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 描述
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 金额
     * @return金额
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * 金额
     * @param amount 金额
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * 库存
     * @return库存
     */
    public Integer getRemain() {
        return remain;
    }

    /**
     * 库存
     * @param remain 库存
     */
    public void setRemain(Integer remain) {
        this.remain = remain;
    }

    /**
     * 状态
     * @return状态
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status 状态
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 创建时间
     * @return创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改时间
     * @return修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}