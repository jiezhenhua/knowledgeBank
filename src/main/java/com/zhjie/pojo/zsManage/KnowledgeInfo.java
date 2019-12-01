package com.zhjie.pojo.zsManage;

import java.io.Serializable;
import java.util.Date;

public class KnowledgeInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_knowledge_bank_info.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_knowledge_bank_info.zs_title
     *
     * @mbggenerated
     */
    private String zsTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_knowledge_bank_info.zs_type
     *
     * @mbggenerated
     */
    private String zsType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_knowledge_bank_info.insert_time
     *
     * @mbggenerated
     */
    private Date insertTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_knowledge_bank_info.insert_user
     *
     * @mbggenerated
     */
    private String insertUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_knowledge_bank_info.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_knowledge_bank_info.zs_content
     *
     * @mbggenerated
     */
    private String zsContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_knowledge_bank_info
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_knowledge_bank_info.id
     *
     * @return the value of t_knowledge_bank_info.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_knowledge_bank_info.id
     *
     * @param id the value for t_knowledge_bank_info.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_knowledge_bank_info.zs_title
     *
     * @return the value of t_knowledge_bank_info.zs_title
     *
     * @mbggenerated
     */
    public String getZsTitle() {
        return zsTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_knowledge_bank_info.zs_title
     *
     * @param zsTitle the value for t_knowledge_bank_info.zs_title
     *
     * @mbggenerated
     */
    public void setZsTitle(String zsTitle) {
        this.zsTitle = zsTitle == null ? null : zsTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_knowledge_bank_info.zs_type
     *
     * @return the value of t_knowledge_bank_info.zs_type
     *
     * @mbggenerated
     */
    public String getZsType() {
        return zsType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_knowledge_bank_info.zs_type
     *
     * @param zsType the value for t_knowledge_bank_info.zs_type
     *
     * @mbggenerated
     */
    public void setZsType(String zsType) {
        this.zsType = zsType == null ? null : zsType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_knowledge_bank_info.insert_time
     *
     * @return the value of t_knowledge_bank_info.insert_time
     *
     * @mbggenerated
     */
    public Date getInsertTime() {
        return insertTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_knowledge_bank_info.insert_time
     *
     * @param insertTime the value for t_knowledge_bank_info.insert_time
     *
     * @mbggenerated
     */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_knowledge_bank_info.insert_user
     *
     * @return the value of t_knowledge_bank_info.insert_user
     *
     * @mbggenerated
     */
    public String getInsertUser() {
        return insertUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_knowledge_bank_info.insert_user
     *
     * @param insertUser the value for t_knowledge_bank_info.insert_user
     *
     * @mbggenerated
     */
    public void setInsertUser(String insertUser) {
        this.insertUser = insertUser == null ? null : insertUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_knowledge_bank_info.update_time
     *
     * @return the value of t_knowledge_bank_info.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_knowledge_bank_info.update_time
     *
     * @param updateTime the value for t_knowledge_bank_info.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_knowledge_bank_info.zs_content
     *
     * @return the value of t_knowledge_bank_info.zs_content
     *
     * @mbggenerated
     */
    public String getZsContent() {
        return zsContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_knowledge_bank_info.zs_content
     *
     * @param zsContent the value for t_knowledge_bank_info.zs_content
     *
     * @mbggenerated
     */
    public void setZsContent(String zsContent) {
        this.zsContent = zsContent == null ? null : zsContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_knowledge_bank_info
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        KnowledgeInfo other = (KnowledgeInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getZsTitle() == null ? other.getZsTitle() == null : this.getZsTitle().equals(other.getZsTitle()))
            && (this.getZsType() == null ? other.getZsType() == null : this.getZsType().equals(other.getZsType()))
            && (this.getInsertTime() == null ? other.getInsertTime() == null : this.getInsertTime().equals(other.getInsertTime()))
            && (this.getInsertUser() == null ? other.getInsertUser() == null : this.getInsertUser().equals(other.getInsertUser()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getZsContent() == null ? other.getZsContent() == null : this.getZsContent().equals(other.getZsContent()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_knowledge_bank_info
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getZsTitle() == null) ? 0 : getZsTitle().hashCode());
        result = prime * result + ((getZsType() == null) ? 0 : getZsType().hashCode());
        result = prime * result + ((getInsertTime() == null) ? 0 : getInsertTime().hashCode());
        result = prime * result + ((getInsertUser() == null) ? 0 : getInsertUser().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getZsContent() == null) ? 0 : getZsContent().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_knowledge_bank_info
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", zsTitle=").append(zsTitle);
        sb.append(", zsType=").append(zsType);
        sb.append(", insertTime=").append(insertTime);
        sb.append(", insertUser=").append(insertUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", zsContent=").append(zsContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}